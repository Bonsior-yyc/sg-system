package com.bnu.sg.system.controller.admin;


import com.bnu.sg.system.model.User;
import com.bnu.sg.system.service.UserService;
import com.bnu.sg.system.util.MD5Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping("/admin")
public class IndexAdminController {


    private final UserService userService;

    public IndexAdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/index")
    public String indexaPage(){
        return "/admin/index";
    }

    @GetMapping("index/addUser")
    public String addUser(@RequestParam String studentId,@RequestParam String name){
        Date date = new Date();
        User user1 = new User();
        user1.setStudentId(studentId);
        user1.setName(name);
        user1.setCreateTime(date);
        user1.setUpdateTime(date);
        user1.setPassword(MD5Utils.code(studentId));
        user1.setEmail((studentId.concat("@mail.bnu.edu.cn")));
        user1.setType(0);
        userService.addUser(user1);
        return "redirect:";

    }

}
