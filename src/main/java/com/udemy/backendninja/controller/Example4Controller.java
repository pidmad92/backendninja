package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/example4")
public class Example4Controller {

    public static final String EXAMPLE4_1_VIEW = "404";
    public static final String EXAMPLE4_2_VIEW = "500";

    @GetMapping("/")
    public RedirectView redirectView(){
        return new RedirectView("/example4/showpage404");
    }

    @GetMapping("/showpage404")
    public String showpage404(){
        return EXAMPLE4_1_VIEW;
    }

    @GetMapping("/showpage500")
    public String showpage500(){
        return EXAMPLE4_2_VIEW;
    }
}
