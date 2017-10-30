package guru.springframework.chucknorris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeFetcherImpl implements JokeFetcher {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeFetcherImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
