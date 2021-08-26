import com.admin.dao.GoodDao;
import com.admin.dao.UserDao;
import com.admin.domain.Admin;
import com.admin.domain.Good;
import com.admin.domain.User;
import com.admin.service.AdminService;
import com.admin.service.GoodService;
import com.admin.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Test {
    @org.junit.Test
    public void userTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        /*String names[] = applicationContext.getBeanDefinitionNames();
        for (String name:names
        ) {
            System.out.println("容器中对象名称"+name);
        }
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        int count = userDao.countUser();
        System.out.println(count);

        GoodService goodService = (GoodService) applicationContext.getBean("goodServiceImpl");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd%");
        System.out.println(goodService.todaySale());*/

        /*AdminService adminService = (AdminService) applicationContext.getBean("adminServiceImpl");
        Admin admin = new Admin();
        admin.setName("admin");
        admin.setPassword("123");
        List<Admin> admins = adminService.selectAdminByLogin(admin);
        System.out.println(admins.get(0));*/

        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        /*System.out.println(userService.selectUserListByPage(1,10));*/
        User user =new User();
        user.setUname("168");
        System.out.println(userService.selectUserList(user));


    }
    /*@org.junit.Test
    public void goodTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        GoodService goodService = (GoodService) applicationContext.getBean("goodServiceImpl");
        System.out.println(goodService.selectGoodsByPage(0,3));
    }*/
}
