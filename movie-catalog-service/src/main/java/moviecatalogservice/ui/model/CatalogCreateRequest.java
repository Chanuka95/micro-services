package moviecatalogservice.ui.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import moviecatalogservice.enums.MovieCategory;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CatalogCreateRequest {

    @NotNull
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
