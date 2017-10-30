package guru.springframework.chucknorris.controllers;

import guru.springframework.chucknorris.services.JokeFetcher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Jokes {

    private JokeFetcher jokeFetcher;

    public Jokes(JokeFetcher jokeFetcher){
        this.jokeFetcher = jokeFetcher;
    }

    @RequestMapping({"/", ""})
    public String getJokes(Model model){
        model.addAttribute("joke", jokeFetcher.getJoke());
        return "chucknorris";
    }

}
