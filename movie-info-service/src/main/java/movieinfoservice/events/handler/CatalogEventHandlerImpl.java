package movieinfoservice.events.handler;

import movieinfoservice.events.Catalogevent;
import movieinfoservice.repository.CatalogInfoRepository;
import movieinfoservice.repository.model.Info;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
public class CatalogEventHandlerImpl implements CatalogEventHandler{

    private ModelMapper modelMapper;

    @Autowired
    private CatalogInfoRepository catalogInfoRepository;

    public CatalogEventHandlerImpl(){
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT).setSkipNullEnabled(true);
    }

    @Override
    @StreamListener("movieCatalogIn")
    public void handleCatalogMovieDetails(Catalogevent catalogevent) {
        Info info = modelMapper.map(catalogevent, Info.class);
        catalogInfoRepository.save(info);
    }
}
