package movieinfoservice.service;

import movieinfoservice.ui.model.InfoResponse;

import java.util.List;

public interface MovieInfoService {

    List <InfoResponse> getAllMovies();
}
