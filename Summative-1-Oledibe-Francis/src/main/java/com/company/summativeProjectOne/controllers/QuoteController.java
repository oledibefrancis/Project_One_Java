package com.company.summativeProjectOne.controllers;

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
public class QuoteController {
    public static List<Quote> quoteList = new ArrayList<>(Arrays.asList(
            new Quote(1, "Kevin Kruse", "Life is about making an impact, not making an income"),
            new Quote(2, "Napoleon Hill", "Whatever the mind of man can conceive and believe, it can achieve"),
            new Quote(3, "Albert Einstein", "Strive not to be a success, but rather to be of value"),
            new Quote(6, "Wayne Gretzky", "You miss 100% of the shots you don’t take"),
            new Quote(9, "Babe Ruth", "Every strike brings me closer to the next home run"),
            new Quote(13, "Earl Nightingale", "We become what we think about"),
            new Quote(17, "Buddha", "The mind is everything. What you think you become"),
            new Quote(19, "Socrates", "An unexamined life is not worth living"),
            new Quote(20, "Woody Allen", "Eighty percent of success is showing up"),
            new Quote(21, "Steve Jobs", "Your time is limited, so don’t waste it living someone else’s life"),
            new Quote(27, "Jim Rohn", "Either you run the day, or the day runs you"),
            new Quote(33, "Anais Nin", "Life shrinks or expands in proportion to one's courage"),
            new Quote(42, "Theodore Roosevelt", "Believe you can and you’re halfway there"),
            new Quote(48, "Japanese Proverb", "Fall seven times and stand up eight"),
            new Quote(73, "Oprah Winfrey", "You become what you believe")
    ));

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuotes() {

        int rnd = new Random().nextInt(quoteList.size());
        return quoteList.get(rnd);
    }
}
