package com.metaverse.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api") // 상위 클래스인 컨트롤러에다가 api라는 prefix를 설정해주면 접두사 역할 할 수 있음
public class HelloController {

    @GetMapping("/hello") //"localhost:8080/api/hello" 이렇게 하면 작동 안됨 규칙임. localhost:8080/여기까지는 써있다는 느낌
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "Get Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return"Post Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "Put Method 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "Delete Method 요청";
    }

}
