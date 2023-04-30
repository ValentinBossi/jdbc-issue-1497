package com.reproduce.issue1497;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findByName(String name);
}