import com.hdlyh.mapper.ProjectMapper;
import com.hdlyh.mapper.UserMapper;
import com.hdlyh.po.Project;
import com.hdlyh.po.User;
import com.hdlyh.service.ProjectService;
import com.hdlyh.service.UserService;
import com.hdlyh.tools.json;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc.xml"})
public class test {
   @Autowired
    UserService userService;
   @Autowired
    ProjectService projectService;
    @Test
    public void testCreateUser(){
        User user =new User("zhangsan","123456",1);
        System.out.println(userService.createUser(user));
    }

    @Test
    public void testFindUserById(){
        System.out.println(userService.findUserById(1001));
    }

    @Test
    public void testFindUserByName(){
        System.out.println(userService.findUserByName("zhangsan"));
    }
    /*添加项目测试*/
/*    @Test
    public void addProject(){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        System.out.println(dateFormat.format(date));
        Project project =new Project("苗族古歌","田锦锋","123456","传承人信息",
                "sdfsdfsdfsd",date,1,0,null,0,null);
        projectService.addProject(project);
    }*/
      @Test
    public void json(){
        List<Project> allProject = projectService.findAllProject();
        json<Project> j = new json<>();
        System.out.println(j.tojson(allProject));
    }

}
