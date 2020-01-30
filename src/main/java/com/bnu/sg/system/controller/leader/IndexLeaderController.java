package com.bnu.sg.system.controller.leader;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexLeaderController {
    @GetMapping("/leader/index")
    public String index(){
        return "/leader/index";
    }
}
