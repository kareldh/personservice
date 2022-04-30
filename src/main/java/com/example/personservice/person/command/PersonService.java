package com.example.personservice.person.command;

import com.example.personservice.person.model.Person;

import java.util.UUID;

public interface PersonService {
    UUID save(Person person);
}
