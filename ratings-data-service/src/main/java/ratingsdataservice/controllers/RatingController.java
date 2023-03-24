package ratingsdataservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ratingsdataservice.models.Rating;

@RestController
@RequestMapping("/ratingdata")
public class RatingController {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,5);
    }

}

