package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller // Anotación diseñada para generar las vistas, ésta hereda de @Component
@RequestMapping("/example") // Anotación diseñada para generar una URL en la que se generará la vista
public class ExampleController {

    public static final String EXAMPLE_VIEW = "example";

    // Primera forma - Para redireccionar las plantillas
    @RequestMapping(value = "/exampleString", method = RequestMethod.GET) // Anotación usada porque se trata de una petición Get y se le indica la ruta.
    public String exampleString(){
        return EXAMPLE_VIEW; // Se mostrará la plantilla example.html
    }

    // Segunda Forma - Para incertar datos en la plantillas
    @GetMapping("/exampleMAV") // Anotación usada porque se trata de una petición Get y se le indica la ruta.
    public ModelAndView exampleMAV(){
        return new ModelAndView(EXAMPLE_VIEW); // Se mostrará la vista example.html
    }

}
