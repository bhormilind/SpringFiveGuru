package com.spring5.SpringWebapp.repositories;

import com.spring5.SpringWebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
