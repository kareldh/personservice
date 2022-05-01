package com.example.personservice.person.query;

import com.example.personservice.person.model.Person;
import com.example.personservice.person.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class DefaultPersonQueryService implements PersonQueryService {
    private final PersonRepository personRepository;

    public DefaultPersonQueryService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Optional<Person> findPerson(UUID id) {
        return personRepository.findById(id);
    }
}
