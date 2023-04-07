package movieinfoservice.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import movieinfoservice.service.MovieInfoService;
import movieinfoservice.ui.model.InfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CatalogInfoController {

    @Autowired
    private MovieInfoService movieInfoService;

    @Operation(summary = "Get all Movie Info")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Found movie details", content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
            schema = @Schema(implementation = InfoResponse.class))})})
    @GetMapping(path = "/AllMovieInfo")
    public ResponseEntity<?> getAllMovieInfo(){
        List<InfoResponse> infoResponse = movieInfoService.getAllMovies();
        return ResponseEntity.status(HttpStatus.OK).body(infoResponse);
    }



}
