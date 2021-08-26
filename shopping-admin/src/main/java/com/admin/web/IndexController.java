package com.admin.web;

import com.admin.domain.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = {"/admin/index","/*","/admin","/"})
    public String showIndex(){
        return "index";
    }

}
