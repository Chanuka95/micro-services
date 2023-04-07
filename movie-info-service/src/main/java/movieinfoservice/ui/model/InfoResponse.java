package movieinfoservice.ui.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import movieinfoservice.enums.MovieCategory;
import movieinfoservice.repository.model.Info;

import javax.persistence.Column;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InfoResponse {

    private String movieName;

    private LocalDate releasedDate;

    private MovieCategory movieCategory;

    private String movieDescription;

    private String rating;

    public InfoResponse(Info info) {
        this.movieName = this.getMovieName();
        this.releasedDate = this.getReleasedDate();
        this.movieCategory = this.getMovieCategory();
        this.movieDescription = this.getMovieDescription();
        this.rating = this.getRating();
    }
}
