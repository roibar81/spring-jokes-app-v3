package roi.springframework.springjokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService {

    ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        //Not best practices for Dependency Injection, only for this project.
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
