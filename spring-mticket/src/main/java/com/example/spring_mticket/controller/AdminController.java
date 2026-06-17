package com.example.spring_mticket.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.spring_mticket.model.Movie;
import com.example.spring_mticket.service.MovieService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public String moviePage(Model model) {

        model.addAttribute("movie", new Movie());
        model.addAttribute("movies",
                movieService.getAllMovies());

        return "admin-movies";
    }

    @PostMapping("/movies/add")
    public String addMovie(
            @ModelAttribute Movie movie) {

        movieService.addMovie(movie);

        return "redirect:/admin/movies";
    }

    @GetMapping("/movies/delete/{id}")
    public String deleteMovie(
            @PathVariable Long id) {

        movieService.deleteMovie(id);

        return "redirect:/admin/movies";
    }
}