package org.example.service;

import org.example.Person;
import org.example.dao.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;

    @Override
    public Person findByName(String userName, String password) {
        return personDAO.findByName(userName,password);
    }


}
