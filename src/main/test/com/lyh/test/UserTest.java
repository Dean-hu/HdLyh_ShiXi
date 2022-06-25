package com.lyh.test;

import com.hdlyh.mapper.UserMapper;
import com.hdlyh.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserTest {
    private UserMapper userMapper;
    private String resources;
    private InputStream inputStream;
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    @Before
    public void beforeTest() throws IOException {
        //获取sqlSession对象
        resources = "mybatis-config.xml";
        inputStream = Resources.getResourceAsStream(resources);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession=sqlSessionFactory.openSession();
        //获取mapper代理对象
        userMapper = sqlSession.getMapper(UserMapper.class);
    }
    @After
    public void afterTest(){
        //提交事务，关闭资源
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testSelectAll(){
        //调用sql语句
        List<User> users = userMapper.selectAllUser();
        for(User user:users){
            System.out.println(user);
        }
    }
    @Test
    public void testChangeUserInfo(){
        User user = new User();
        user.setUser_id(1003);
        user.setUser_password("qqqqq");
        //调用sql语句
        userMapper.changeUserInfo(user);
    }
    @Test
    public void testDeleteUser(){
        userMapper.deleteUser(1003);
    }
}
