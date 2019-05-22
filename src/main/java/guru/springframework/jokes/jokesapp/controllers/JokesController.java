package guru.springframework.jokes.jokesapp.controllers;

import guru.springframework.jokes.jokesapp.services.GetJoke;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Doa on 22-5-2019.
 */
@Controller
public class JokesController {

    private GetJoke joke;

    public JokesController(GetJoke joke) {
        this.joke = joke;
    }

    @RequestMapping("/")
    public String getJokes(Model model) {

        model.addAttribute("chucknorris", joke.getJokeString());

        return "chucknorris";
    }
}
