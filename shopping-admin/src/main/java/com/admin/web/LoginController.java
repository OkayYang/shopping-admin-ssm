package com.admin.web;

import com.admin.domain.Admin;
import com.admin.service.AdminService;
import com.admin.utils.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin/login")
public class LoginController {
    @Autowired
    AdminService adminService;
    @GetMapping()
    public String main(){
        return "login";
    }

    @RequestMapping("/exit")
    public String toLogin(HttpServletRequest request){
        request.getSession().invalidate();
        return "login";
    }
    @RequestMapping("/check")
    @ResponseBody
    public Status checkLogin(Admin admin, HttpServletRequest request){
        List<Admin> admins = adminService.selectAdminByLogin(admin);
        HttpSession session = request.getSession();
        Status status = new Status();
        if (admins.size()==1){
            status.setStatus(200);
            status.setMessage("登陆成功");
            System.out.println(admins.get(0));
            session.setAttribute("admin",admins.get(0));
        }else {
            status.setStatus(400);
            status.setMessage("账号或密码错误");
        }
        return status;
    }
    @RequestMapping("/info")
    @ResponseBody
    public Admin LoginInfo(HttpServletRequest request){
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        return admin;
    }
}
