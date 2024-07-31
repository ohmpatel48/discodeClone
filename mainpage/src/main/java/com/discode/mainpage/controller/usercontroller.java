package com.discode.mainpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class usercontroller {

  @RequestMapping("/user")
  public String loginpage() {
    return "index";
  }
}
