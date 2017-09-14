package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Anotación diseñada para generar las vistas, ésta hereda de @Component
@RequestMapping("/say") // Anotación diseñada para generar una URL en la que se generará la vista
public class HelloWorldController {

    @GetMapping("/helloworld") // Anotación usada porque se trata de una petición Get y se le indica la ruta.
    public String helloWorld(){
        return "helloworld"; // Se mostrará la plantilla helloworld.html
    }

}
