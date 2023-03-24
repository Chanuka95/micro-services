package moviecatalogservice.service;

import moviecatalogservice.config.MovieCatalogEventNotification;
import moviecatalogservice.event.Catalogevent;
import moviecatalogservice.repository.MovieCatalogRepository;
import moviecatalogservice.repository.model.Catalog;
import moviecatalogservice.ui.model.CatalogCreateRequest;
import moviecatalogservice.ui.model.CatalogCreateResponse;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class MovieCatalogServiceImpl implements MovieCatalogService{

    private ModelMapper modelMapper;

    @Autowired
    private MovieCatalogEventNotification movieCatalogEventNotification;

    @Autowired
    private MovieCatalogRepository movieCatalogRepository;

    public MovieCatalogServiceImpl(){
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT).setSkipNullEnabled(true);
    }

    @Override
    public Catalog insertMovieDetails(CatalogCreateRequest createRequest) {
        try{
            Catalog catalog = modelMapper.map(createRequest, Catalog.class);
            Catalog catalogSaved = movieCatalogRepository.save(catalog);
            movieCatalogEventNotification.movieCatalogOut().send(MessageBuilder.withPayload(new Catalogevent(catalogSaved)).build());
            return catalog;
        }catch (Exception e){
            throw new RuntimeException("something wrong");
        }
    }

}
