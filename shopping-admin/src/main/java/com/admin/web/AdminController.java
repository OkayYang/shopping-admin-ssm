package com.admin.web;

import com.admin.domain.Welcome;
import com.admin.service.GoodService;
import com.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
    @Autowired
    UserService userService;
    @Autowired
    GoodService goodService;

    @RequestMapping("/admin/welcome")
    @ResponseBody
    public Welcome welcomeData(){
        Welcome welcome = new Welcome();
        welcome.setUserNum(userService.countUser());
        welcome.setGoodNum(goodService.countGood());
        welcome.setTotalSale(goodService.totalSale());
        welcome.setTodaySale(goodService.todaySale());
        return welcome;
    }

    @RequestMapping("/admin/error")

    public String error(){
        return "error";
    }

}
