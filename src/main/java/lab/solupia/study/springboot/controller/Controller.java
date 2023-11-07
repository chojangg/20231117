package lab.solupia.study.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String hello() {
        return "index";
    }

    @GetMapping("/user")
    public String user_list() {
        return "user";
    }
}
