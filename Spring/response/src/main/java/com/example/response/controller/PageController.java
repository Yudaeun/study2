package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//페이지를 반환한다.
public class PageController {
    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }
    //ResponseEntity
    @ResponseBody
    @GetMapping("/user")
    public User user(){
        var user=new User();
        user.setName("riri");
        user.setAddress("서울시 강남구");
        return user;
    }
}
