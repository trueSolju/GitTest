package com.example.GitTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String main(){
        System.out.println(111111);
        System.out.println("이 코드는 dev 브렌치에서 추가함");
        return "main";
    }
}
