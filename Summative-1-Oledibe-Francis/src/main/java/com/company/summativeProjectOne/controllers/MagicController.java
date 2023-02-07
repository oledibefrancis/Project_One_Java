package com.company.summativeProjectOne.controllers;

import com.company.summativeProjectOne.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MagicController {

    private static List<Answer> answerList = new ArrayList<>(Arrays.asList(
            new Answer(1, "What is the capital of France?", "Paris"),
            new Answer(2, "Who won the Best Actor Oscar in 2022?", "Anthony Hopkins"),
            new Answer(3, "Who wrote the book To Kill a Mockingbird?", "Harper Lee"),
            new Answer(4, "How many planets are there in our solar system?", "Eight"),
            new Answer(5, "Who painted the Mona Lisa?", "Leonardo da Vinci"),
            new Answer(6, "What is the largest ocean on Earth?", "The Pacific Ocean"),
            new Answer(7, "Who is the current Prime Minister of the UK?", "Boris Johnson"),
            new Answer(8, "What is the name of the first man to walk on the Moon?", " Neil Armstrong"),
            new Answer(9, "Who is the main character in the Harry Potter series?", "Harry Potter"),
            new Answer(10, "What is the smallest country in the world by land area?", "Vatican City"),
            new Answer(11, "What is the most spoken language in the world?", "Mandarin Chinese"),
            new Answer(12, "Who won the FIFA World Cup in 2022?", "Spain"),
            new Answer(13, "Who wrote the novel \"Pride and Prejudice\"?", "Jane Austen")

    ));
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer getAnswer(@RequestBody Answer answer) {

        int rnd = new Random().nextInt(answerList.size());
        return answerList.get(rnd);

    }
}
