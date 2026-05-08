package com.ironhack.labdocker;

import com.ironhack.labdocker.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}