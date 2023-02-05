package com.company.summativeProjectOne.controllers;

import com.company.summativeProjectOne.models.Definition;
import com.company.summativeProjectOne.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {
    public static List<Definition> wordList = new ArrayList<>(Arrays.asList(

            new Definition(1, "abstract method", "A method that has no implementation"),
            new Definition(2, "argument", "A data item specified in a method call. An argument can be a literal value, a variable, or an expression"),
            new Definition(3, "array", "A collection of data items, all of the same type, in which each item's position is uniquely designated by an integer"),
            new Definition(4, "atomic", "Refers to an operation that is never interrupted or left in an incomplete state under any circumstance"),
            new Definition(5, "authentication", "The process by which an entity proves to another entity that it is acting on behalf of a specific identity"),
            new Definition(6, "binary operator", "An operator that has two arguments"),
            new Definition(7, "bit", "The smallest unit of information in a computer, with a value of either 0 or 1"),
            new Definition(8, "byte", "A sequence of eight bits. Java provides a corresponding byte type"),
            new Definition(9, "casting", "Explicit conversion from one data type to another"),
            new Definition(10, "char", "A Java keyword used to declare a variable of type character"),
            new Definition(11, "commit", "The point in a transaction when all updates to any resources involved in the transaction are made permanent"),
            new Definition(12, "compositing", "The process of superimposing one image on another to create a single image"),
            new Definition(13, "const", "A reserved Java keyword not used by current versions of the Java programming language"),
            new Definition(14, "delegation", "An act whereby one principal authorizes another principal to use its identity or privileges with some restrictions"),
            new Definition(15, "distributed", "Running in more than one address space")

    ));
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getDefinition() {

        int rnd = new Random().nextInt(wordList.size());
        return wordList.get(rnd);
    }
}
