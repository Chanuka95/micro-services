package movieinfoservice.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import movieinfoservice.enums.MovieCategory;

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


}
