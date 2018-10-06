package com.spring5.SpringWebapp.bootstrap;

import com.spring5.SpringWebapp.model.Author;
import com.spring5.SpringWebapp.model.Book;
import com.spring5.SpringWebapp.model.Publisher;
import com.spring5.SpringWebapp.repositories.AuthorRepository;
import com.spring5.SpringWebapp.repositories.BookRepository;
import com.spring5.SpringWebapp.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    private void initData(){
        Author eric = new Author("Eric","Evans");
        Publisher milpubUSA = new Publisher("Milind Publications","USA");
        Book ddd = new Book("Domain Driven Design","1234",milpubUSA);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        //milpubUSA.
        publisherRepository.save(milpubUSA);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author milind = new Author("Milind", "Bhor");
        Publisher milpubIN = new Publisher("Milind Publications","India");
        Book springBestPract = new Book("Spring-5 Best Practices","2222",milpubIN);
        milind.getBooks().add(springBestPract);
        springBestPract.getAuthors().add(milind);
        springBestPract.getAuthors().add(milind);

        publisherRepository.save(milpubIN);
        authorRepository.save(milind);
        bookRepository.save(springBestPract);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
