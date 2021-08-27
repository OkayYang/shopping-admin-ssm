import com.admin.dao.GoodDao;
import com.admin.dao.UserDao;
import com.admin.domain.*;
import com.admin.service.*;
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
    /*@org.junit.Test
    public void recoverUserTest() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        RecordUserService service = (RecordUserService) applicationContext.getBean("recordUserServiceImpl");
        service.recoverUser(61L);
    }*/
    @org.junit.Test
    public void orderTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        OrderRecordService service = (OrderRecordService) applicationContext.getBean("orderRecordServiceImpl");
        OrderRecord record = new OrderRecord();
        record.setRid(17L);
        System.out.println(service.selectRecordList(record));
    }
}
