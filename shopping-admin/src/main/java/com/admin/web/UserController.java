package com.admin.web;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.admin.domain.Admin;
import com.admin.domain.User;
import com.admin.service.UserService;
import com.admin.utils.Status;
import com.admin.utils.UserData;
import com.fasterxml.jackson.databind.util.JSONPObject;
import freemarker.core.JSONOutputFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public String main(){
        return "user-list";
    }
    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public UserData list(User user)
    {
        UserData userData = userService.selectUserList(user);
        return userService.selectUserList(user);
    }
    @GetMapping("/list")
    @ResponseBody
    public UserData list(User user,int page,int limit) throws UnsupportedEncodingException {
        if (user.getUname()!=null){
            user.setUname(new String(user.getUname().getBytes("ISO-8859-1"), "utf-8"));

            return userService.selectUserList(user);
        }

        return userService.selectUserListByPage(page,limit);
    }
    @PostMapping("/edit")
    @ResponseBody
    public Status userEdit(@RequestBody User user){
        int success = userService.updateUser(user);
        Status status = new Status();
        if (success==1){
            status.setStatus(200);
            status.setMessage("修改成功!");
        }else {
            status.setStatus(404);
            status.setMessage("修改失败，请联系管理员!");
        }
        return status;
    }
    @RequestMapping("/del")
    @ResponseBody
    public Status userDel(int[] uids){
        System.out.println(uids);

        int success = userService.deleteUserByUids(uids);
        Status status = new Status();
        if (success!=0){
            status.setStatus(200);
            status.setMessage("删除成功!");
        }else {
            status.setStatus(404);
            status.setMessage("删除失败，请联系管理员!");
        }
        return status;
    }

    @PostMapping("/add")
    @ResponseBody
    public Status userAdd(@RequestBody User user){
        int success = userService.insertUser(user);
        Status status = new Status();
        if (success==1){
            status.setStatus(200);
            status.setMessage("添加成功!");
        }else {
            status.setStatus(404);
            status.setMessage("添加失败失败，请联系管理员!");
        }
        return status;
    }



}