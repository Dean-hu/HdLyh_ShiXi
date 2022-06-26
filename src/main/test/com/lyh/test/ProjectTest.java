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
        pro.setProject_owner_info("lyh is the owner");
        pro.setProject_owner("lyh");
        pro.setProject_tel("123123123");
        pro.setProject_apply_time(date);
        pro.setProject_user_id(1001);
        projectMapper.addProject(pro);
    }
    @Test
    public void findProjectByCondition(){
        /*String proInfo = "吃";*/
        int check1 = 0;
        Project pro = new Project();
/*        proInfo = "%"+proInfo+"%";
        pro.setProject_info(proInfo);*/
        pro.setProject_check1(check1);
        List<Project> pros = projectMapper.findProjectByCondition(pro);
        for(Project p : pros){
            System.out.println(p);
        }
    }

}
