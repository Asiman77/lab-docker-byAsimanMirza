package com.ironhack.labdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final PersonRepository personRepository;

    public HelloController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/api/hello")
    public String hello() {
        return personRepository.findAll()
                .stream()
                .findFirst()
                .map(person -> "Hello, " + person.getName() + "!")
                .orElse("Hello, World!");
    }
}