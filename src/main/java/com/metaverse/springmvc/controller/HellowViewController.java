package com.metaverse.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HellowViewController {
    @GetMapping("/static-hello")
    public String hello() {
        return "hello.html";
    }

    @GetMapping("/html/redirect")
    public String htmlRedirct(){
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    public String htmlTemplates(){
        // ... 내부 로직 추가 될 수 있음
        // prefix classpath: resources까지의 경로 + templates/ 까지 가지고 있음
        // suffix .html(접미사)
        return "hello-template";
    }
}
