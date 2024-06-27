package com.discode.authcatation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pagecontroller {

    @RequestMapping("/login")
    public String loginpage() {
        return "login";
    }

    @RequestMapping("/signup")
    public String signuppage() {
        return "signup";
    }

}
