package com.admin.web;

import java.util.List;
import com.admin.domain.User;
import com.admin.service.UserService;
import com.admin.utils.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin/user")
public class UserController {

    @Autowired
    private UserService userService;
    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("/list")
    @ResponseBody
    public UserData list(User user)
    {
        return userService.selectUserList(user);
    }
    @GetMapping("/list")
    @ResponseBody
    public UserData list(int page,int limit)
    {
        return userService.selectUserListByPage(page,limit);
    }


}