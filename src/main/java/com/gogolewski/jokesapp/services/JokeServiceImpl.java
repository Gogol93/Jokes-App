package com.gogolewski.jokesapp.services;

import com.gogolewski.jokesapp.models.ChuckNorrisQuote;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuote chuckNorrisQuote;

    public JokeServiceImpl(ChuckNorrisQuote chuckNorrisQuotes) {
        this.chuckNorrisQuote = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuote.generateRandomQuote();
    }


}
