package pl.coderslab.bootexamplekrajeew04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.bootexamplekrajeew04.entity.Person;

@Controller
public class HomeController {
    @GetMapping
    public String home(){
        Person person = Person.builder()
                .firstName("imie")
                .lastName("nazwisko")
                .build();

        return "home";
    }
}
