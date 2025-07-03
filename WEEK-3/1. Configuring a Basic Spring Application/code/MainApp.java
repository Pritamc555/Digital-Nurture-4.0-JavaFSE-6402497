package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class MainApp {
    public static void main(String[] args) {
        // Load the Spring container using XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean from the Spring container
        BookService bookService = (BookService) context.getBean("bookService");

        // Call method to add a book
        bookService.addBook("Spring Framework Basics");
    }
}
