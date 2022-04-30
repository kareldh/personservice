package com.example.personservice.person.rest;

import com.example.personservice.person.command.PersonService;
import com.example.personservice.person.model.Person;
import com.example.personservice.person.query.PersonQueryService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/api/person")
public class PersonController {
    private final PersonService personService;
    private final PersonQueryService personQueryService;

    public PersonController(PersonService personService, PersonQueryService personQueryService) {
        this.personService = personService;
        this.personQueryService = personQueryService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    UUID createPerson(@RequestBody Person person) {
        return personService.save(person);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Person> getPerson(@PathVariable String id) {
        return ResponseEntity.of(personQueryService.findPerson(id));
    }
}
