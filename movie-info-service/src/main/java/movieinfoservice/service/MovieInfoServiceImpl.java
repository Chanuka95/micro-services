package movieinfoservice.service;

import movieinfoservice.repository.CatalogInfoRepository;
import movieinfoservice.repository.model.Info;
import movieinfoservice.ui.model.InfoResponse;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieInfoServiceImpl implements MovieInfoService{

    private ModelMapper modelMapper;

    public MovieInfoServiceImpl(){
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT).setSkipNullEnabled(true);
    }

    @Autowired
    private CatalogInfoRepository catalogInfoRepository;

    @Override
    public List<InfoResponse> getAllMovies() {
        List<Info> addressTypes = catalogInfoRepository.findAll();
        List<InfoResponse> responseModels = new ArrayList<>();
        addressTypes.forEach(Info -> {
            InfoResponse responseModel = modelMapper.map(Info, InfoResponse.class);
            responseModels.add(responseModel);
        });
        return responseModels;
    }
}
