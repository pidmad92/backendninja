package com.udemy.backendninja.controller;

import com.udemy.backendninja.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/example3")
public class Example3Controller {

    public static final String FORM_VIEW = "form";
    public static final String RESULT = "result";

    /*// Forma #1 para redireccionar
    @GetMapping("/")
    public String redirect(){
        return "redirect:/example3/showform";
    }*/

    // Forma #2 para redireccionar
    @GetMapping("/")
    public RedirectView redirectView(){
        return new RedirectView("/example3/showForm");
    }

    @GetMapping("/showform")
    public String showForm(Model model){
        model.addAttribute("person",new Person()); // Al formulario le da un modelo de Persona
        return FORM_VIEW;
    }

    @PostMapping("/addperson")
    public ModelAndView addPerson(@ModelAttribute("person") Person person){ //Recoge un atributo tipo person
        ModelAndView mav = new ModelAndView(RESULT);
        mav.addObject("persona", person); // Bajo el atributo persona, envia el atributo person
        return mav;
    }
}
