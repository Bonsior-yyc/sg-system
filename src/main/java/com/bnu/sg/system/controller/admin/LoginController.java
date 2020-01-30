package com.bnu.sg.system.controller.admin;

import com.bnu.sg.system.model.User;
import com.bnu.sg.system.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/admin")
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String loginPage(){
        System.out.println("ok1");
        return "admin/login";
    }


    @RequestMapping("/login")
    public void login(@RequestParam String studentId,
                        @RequestParam String password,
                        HttpServletRequest request,
                        HttpServletResponse response,
                        RedirectAttributes attributes) throws IOException {
        User user = userService.checkUser(studentId,password);
        System.out.println("ok");
        if (user != null){
            user.setPassword(null);
            request.getSession().setAttribute("user",user);
            System.out.println(user.getType());
            if (user.getType()==0)  response.sendRedirect("/student/index");
            if (user.getType()==1)  response.sendRedirect("/admin/index");
            if (user.getType()==2)  response.sendRedirect("/leader/index");
            else response.sendRedirect("/error/error");
        }else {
            attributes.addFlashAttribute("message","密码错误！");
            response.sendRedirect("");
        }
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "redirect:/admin";
    }
}
