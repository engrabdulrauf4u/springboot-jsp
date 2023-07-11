package com.example.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView navigateToHomePage() {
        ModelAndView mv = new ModelAndView("hello.jsp");
        return mv;
    }


    @RequestMapping("/loginprocess")
    public ModelAndView logintoPage(@RequestParam String name,@RequestParam String password,Model model) {

        model.addAttribute("username",name);
        ModelAndView mv = new ModelAndView("success.jsp");
        return mv;
    }


}
