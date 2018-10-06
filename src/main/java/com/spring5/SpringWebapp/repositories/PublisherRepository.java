package com.spring5.SpringWebapp.repositories;

import com.spring5.SpringWebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
