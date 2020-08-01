package pl.coderslab.bootexamplekrajeew04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name, Model m){
        m.addAttribute("name", name);
        return "hello";
    }
}
