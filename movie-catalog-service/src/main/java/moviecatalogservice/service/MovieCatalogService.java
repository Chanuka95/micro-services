package moviecatalogservice.service;

import moviecatalogservice.repository.model.Catalog;
import moviecatalogservice.ui.model.CatalogCreateRequest;
import moviecatalogservice.ui.model.CatalogCreateResponse;

public interface MovieCatalogService {

    Catalog insertMovieDetails(final CatalogCreateRequest createRequest);

}
