package project.com.courseConclusionProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.com.courseConclusionProject.entity.PrfRadar;
import project.com.courseConclusionProject.entity.PrfStation;
import project.com.courseConclusionProject.repository.PrfRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PrfService {
    @Autowired
    private PrfRepository prfRepository;

    public List<PrfStation> getByUfAndMunicipio(String uf, String municipio) {
        return prfRepository.findByUfAndCounty(uf, municipio);
    }
    public List<PrfRadar> getRadarByUfAndMunicipio(String uf, String municipio) {
        return prfRepository.findByUfAndMunicipio(uf, municipio);
    }

}
