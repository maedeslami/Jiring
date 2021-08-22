package jiring.repository;

/**
 * Created by Lenovo on 8/15/2021.
 */

import jiring.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JiringDao extends JpaRepository<Person, Long> {

}
