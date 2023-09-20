package com.zoe.pawse.Controller;

import com.zoe.pawse.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    // 로그인
    @GetMapping("/user/login")
    public String user_user(Model model){
        model.addAttribute("main_content", "user/login");
        return "main";
    }
}
