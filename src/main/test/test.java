import com.hdlyh.mapper.UserMapper;
import com.hdlyh.po.User;
import com.hdlyh.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc.xml"})
public class test {
   @Autowired
    UserService userService;
    @Test
    public void testCreateUser(){
        User user =new User("zhangsan","123456",1);
        System.out.println(userService.createUser(user));
    }
    
    @Test
    public void testFindUserById(){
        System.out.println(userService.findUserById(1));
    }

    @Test
    public void testFindUserByName(){
        System.out.println(userService.findUserByName("zhangsan"));
    }
}
