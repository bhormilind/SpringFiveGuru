package com.spring5.SpringWebapp.repositories;

import com.spring5.SpringWebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
