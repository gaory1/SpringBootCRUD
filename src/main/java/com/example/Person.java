package com.example;

import lombok.Data;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by gaolb on 6/8/17.
 */
@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long    id;

    String  name;
    String  sex;
    int     age;
}
