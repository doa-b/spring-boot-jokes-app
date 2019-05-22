package guru.springframework.jokes.jokesapp.controllers;

import guru.springframework.jokes.jokesapp.services.GetJoke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Doa on 22-5-2019.
 */
@Controller
public class JokesController {

    private GetJoke joke;

    @Autowired          // not required, but to show your intent to other developers
    public JokesController(GetJoke joke) {
        this.joke = joke;
    }

    @RequestMapping({"/", ""})
    public String showJokes(Model model) {

        model.addAttribute("joke", joke.getJokeString());

        return "chucknorris";
    }
}
