package com.example.personservice.person.query;

import com.example.personservice.person.model.Person;

import java.util.Optional;

public interface PersonQueryService {
    Optional<Person> findPerson(String id);
}
