package com.udemy.backendninja.controller;

import com.udemy.backendninja.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller // Anotación diseñada para generar las vistas, ésta hereda de @Component
@RequestMapping("/example") // Anotación diseñada para generar una URL en la que se generará la vista
public class ExampleController {

    private static final String EXAMPLE_VIEW = "example";

    // Primera forma - Para redireccionar las plantillas
    @RequestMapping(value = "/exampleString", method = RequestMethod.GET) // Anotación usada porque se trata de una petición Get y se le indica la ruta.
    public String exampleString(Model model){
        model.addAttribute("people", getPeople()); // En el modelAtribute se ingresa el nombre de la variable seguido del valor
        return EXAMPLE_VIEW; // Se mostrará la plantilla example.html
    }

    // Segunda Forma - Para incertar datos en la plantillas
    @GetMapping("/exampleMAV") // Anotación usada porque se trata de una petición Get y se le indica la ruta.
    public ModelAndView exampleMAV(){
        ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
        mav.addObject("people", getPeople());
        return mav; // Se mostrará la vista example.html
    }

    private List<Person> getPeople(){
        List<Person> peoble = new ArrayList<>();
        peoble.add(new Person("Pierre",25));
        peoble.add(new Person("Milagros",26));
        peoble.add(new Person("Jose",20));
        peoble.add(new Person("Santiago",18));
        return peoble;
    }

}
