package com.admin.web;

import com.admin.domain.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/index")
public class IndexController {

    @RequestMapping()
    public String showIndex(){
        return "index";
    }

}
