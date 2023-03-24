package moviecatalogservice.ui.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import moviecatalogservice.enums.MovieCategory;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CatalogCreateResponse {

    private Integer movieId;

    private String movieName;

    private LocalDate releasedDate;

    private MovieCategory category;

    private String country;

    private String movieDescription;

    private String movieCharacters;

    private String movieLanguage;

    private String movieBudget;

    private String rating;
}
