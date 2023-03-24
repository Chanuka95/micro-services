package movieinfoservice.repository.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import movieinfoservice.enums.MovieCategory;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "info")
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "info_id")
    private Integer info_id;

    @Basic(optional = false)
    @Column(name = "name")
    private String movieName;

    @Column(name = "year")
    private LocalDate releasedDate;

    @Column(name = "category")
    private MovieCategory movieCategory;

    @Column(name = "description")
    private String movieDescription;

    @Column(name = "rating")
    private String rating;

}
