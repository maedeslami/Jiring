package jiring.service;

import jiring.repository.JiringDao;
import jiring.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Lenovo on 8/15/2021.
 */
@Component
public class PersonServiceImpl implements PersonService {
    @Autowired
    JiringDao jiringDao;
    @Override
    public Person save(Person person) {

        return jiringDao.save(person);
    }
}
