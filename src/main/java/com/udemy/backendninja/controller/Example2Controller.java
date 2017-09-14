package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class Example2Controller {

    private static final String EXAMPLE2_VIEW = "example2";

    //Primera Forma para una peticion Get
    //localhost:8080/example2/request1?nm=Pierre
    @GetMapping("/request1")
    public ModelAndView request1(@RequestParam(name="nm",required = false, defaultValue = "NULL") String name){ // Datos que ingresan al request1 (anotacion(variable=valor , otros atributos) tipo variable)
        ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
        mav.addObject("nm_in_model",name);
        return mav;
    }


    // Segunda Forma para una peticion Get
    //localhost:8080/example2/request1/Pierre
    @GetMapping("/request2/{nm}")// El nombre del atributo va en la anotacion getMapping
    public ModelAndView request2(@PathVariable("nm") String name){//Y con la anotacion PathVariable se declara la variable nm
        ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
        mav.addObject("nm_in_model",name);
        return mav;
    }
}
