package guru.springframework.jokes.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Doa on 22-5-2019.
 */
@Service
public class GetJokeImpl implements GetJoke {

    private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String getJokeString() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
