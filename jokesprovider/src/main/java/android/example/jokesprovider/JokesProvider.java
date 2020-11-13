package android.example.jokesprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokesProvider {

    public String tellingJokes() {

        List<String> jokesList = new ArrayList<>();

        jokesList.add("that's very funny 0 ");
        jokesList.add("that's very funny 1 ");
        jokesList.add("that's very funny 2 ");
        jokesList.add("that's very funny 3 ");
        jokesList.add("that's very funny 4 ");
        jokesList.add("that's very funny 5 ");

        Random random = new Random();

        return jokesList.get(random.nextInt(jokesList.size()));
    }
}