package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping(path="/hello") //http://localhost:9090/api/get/hello
    //path로 지정하면 명시적으로 주소를 지정한다는 뜻

    public String getHello(){
        return "get hello";
    }
    @RequestMapping(path="/hi",method= RequestMethod.GET)
    //method로 GET를 지정해주지 않으면 get post put delete 모두 들어가게 된다.
    public String hi(){
        return "hi";
    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name="name") String Pname){
        //@PathVariable annotation을 이용해서 변화하는 name 값을 지정해줄 수 있다.
        System.out.println("PathVariable: "+Pname);
        return Pname;
    }
    //쿼리 파라미터=url의 부분에서 물음표 뒤에 있는 것들
    //주로 검색을 할 때 여러가지 매개변수 인자를 칭함
    //http://localhost:9090/api/get/query-param?user=ruru&email=ruru@naver.com&age=20
    @GetMapping(path="query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb=new StringBuilder();

        queryParam.entrySet().forEach( entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+" = "+entry.getValue()+"\n");
        });
        return sb.toString();
    }

    //QueryParameter를 명시적으로 지정해주는 방법
    //하지만 이 방식은 받는 값이 많아지면 코드짜기 힘들어진다는 점이 있고,
    //클라이언트가 잘못된 값을 보내면(age에 정수를 보내야 하는데 문자열을 보낸다던지) 400번대 에러가 발생한다.
    @GetMapping("query-param2")
    public String queryParam02(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam int age)
    {

        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name+" "+email+" "+age;
    }

    //DTO를 이용해서 지정해주는 방법
    @GetMapping("query-param3")
    public String queryParam3(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
