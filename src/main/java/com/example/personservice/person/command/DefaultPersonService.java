package com.example.personservice.person.command;

import com.example.personservice.person.model.Person;
import com.example.personservice.person.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DefaultPersonService implements PersonService {
    private final PersonRepository personRepository;

    public DefaultPersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public UUID save(Person person) {
        return personRepository.save(person).getId();
    }
}
