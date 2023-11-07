package lab.solupia.study.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String hello() {
        return "index";
    }

    @GetMapping("/user")
    public ModelAndView user_list() {
        return new ModelAndView("user");
    }
}
