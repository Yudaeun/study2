package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    //TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;

    }
    //JSON
    //리퀘스트가 오면 request->object mapper->object->method->object->object mapper->json->response
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user; //200ok로 response
    }

    @PutMapping("/put")
    //리스폰스엔티티를 사용하면 리소스가 생성되면 201 값을 가져온다. 수정되면 200
    public ResponseEntity<User> put(@RequestBody User user){
       return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
