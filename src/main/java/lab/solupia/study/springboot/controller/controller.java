package lab.solupia.study.springboot.controller;

import lab.solupia.study.springboot.dto.UserDto;
import lab.solupia.study.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
    @Autowired
    private UserService service;

    @GetMapping("/")
    public String hello() {
        return "index";
    }

    @GetMapping("/user")
    public ModelAndView user_list() {
        return new ModelAndView("user");
    }

    @GetMapping("/add_user")
    public ModelAndView addUser() {
        return new ModelAndView("add_user");
    }

    @PostMapping("/add_done")
    public String add_done(UserDto dto) {
        service.insert(dto);
        return "redirect:/";
    }
}
