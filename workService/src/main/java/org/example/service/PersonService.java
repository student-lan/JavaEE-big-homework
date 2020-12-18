package org.example.service;

import org.example.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonService {
    public Person findByName(String userName, String password);

}
