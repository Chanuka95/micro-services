package moviecatalogservice.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import moviecatalogservice.enums.MovieCategory;
import moviecatalogservice.repository.model.Catalog;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Catalogevent {

    private String movieName;

    private LocalDate releasedDate;

    private MovieCategory category;

    private String movieDescription;

    private String rating;

    public Catalogevent(Catalog catalogEvent) {
        setMovieName(catalogEvent.getMovieName());
        setReleasedDate(catalogEvent.getReleasedDate());
        setCategory(catalogEvent.getCategory());
        setMovieDescription(catalogEvent.getMovieDescription());
        setRating(catalogEvent.getRating());
    }
}
