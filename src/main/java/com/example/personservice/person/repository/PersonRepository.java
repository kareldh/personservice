package com.example.personservice.person.repository;

import com.example.personservice.person.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, String>, CustomPersonRepository {
}
