package moviecatalogservice.repository.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import moviecatalogservice.enums.MovieCategory;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "catalog")
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "movie_id")
    private Integer movieId;

    @Basic(optional = false)
    @Column(name = "name")
    private String movieName;

    @Column(name = "year")
    private LocalDate releasedDate;

    @Column(name = "category")
    private MovieCategory category;

    @Column(name = "country")
    private String country;

    @Column(name = "description")
    private String movieDescription;

    @Column(name = "characters")
    private String movieCharacters;

    @Column(name = "language")
    private String movieLanguage;

    @Column(name = "budget")
    private String movieBudget;

    @Column(name = "rating")
    private String rating;

}
