package com.example.personservice.person.query;

import com.example.personservice.person.model.Person;

import java.util.Optional;
import java.util.UUID;

public interface PersonQueryService {
    Optional<Person> findPerson(UUID id);
}
