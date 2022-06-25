package com.lyh.test;

import com.hdlyh.mapper.ProjectMapper;
import com.hdlyh.po.Project;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ProjectTest {
    private ProjectMapper projectMapper;
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
        projectMapper = sqlSession.getMapper(ProjectMapper.class);
    }
    @After
    public void afterTest(){
        //提交事务，关闭资源
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addProject(){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        Project pro = new Project();
        pro.setProject_info("this is a test bar ...");
        pro.setProject_name("test");
        Project project =new Project("苗族古歌","田锦锋","123456",
                "传承人信息","sdfsdfsdfsd",date,1,0,
                null,0,null);
        projectMapper.addProject(pro);
    }

}
