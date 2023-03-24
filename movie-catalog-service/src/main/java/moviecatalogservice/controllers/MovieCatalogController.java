package moviecatalogservice.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import moviecatalogservice.repository.model.Catalog;
import moviecatalogservice.service.MovieCatalogService;
import moviecatalogservice.ui.model.CatalogCreateRequest;
import moviecatalogservice.ui.model.CatalogCreateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class MovieCatalogController {

    @Autowired
    private MovieCatalogService movieCatalogService;

    @Operation(summary="Insert movie details")
    @ApiResponse(responseCode = "200", description = "Movie inserted to database", content = {
            @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = CatalogCreateResponse.class))
    } )
    @PostMapping(path= "/catalog" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> insertMovieDetails(@Valid @RequestBody CatalogCreateRequest createRequest){
        Catalog createResponse = movieCatalogService.insertMovieDetails(createRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createResponse);
    }


}
