package com.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by gaolb on 6/8/17.
 */

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {
}
