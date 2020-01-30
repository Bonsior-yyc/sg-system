package com.bnu.sg.system.controller.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexStudentController {
    @GetMapping("/student/index")
    public String index(){
        return "/student/index";
    }
}
