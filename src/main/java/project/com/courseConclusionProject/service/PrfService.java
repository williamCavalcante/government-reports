package project.com.courseConclusionProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.com.courseConclusionProject.dto.PrfStationDto;
import project.com.courseConclusionProject.repository.PrfRepository;

import java.util.List;
import java.util.UUID;

@Service
public class PrfService {
    @Autowired
    private PrfRepository prfRepository;

    public PrfStationDto findByUuid(UUID uuid) {
        return prfRepository.findByUuid(uuid).orElse(null);
    }

    public List<PrfStationDto> getAll() {
        return prfRepository.findAll();
    }

    public PrfStationDto getById(Long id) {
        return prfRepository.findById(id).orElse(null);
    }

    public PrfStationDto create(PrfStationDto prfStationDto) {
        return prfRepository.save(prfStationDto);
    }

    public PrfStationDto update(Long id, PrfStationDto prfStationDto){
        PrfStationDto existingPrfStation = getById(id);
        if (existingPrfStation != null) {
            return prfRepository.save(prfStationDto);
        }
        return null;
    }
    public void delete(Long id) {
        prfRepository.deleteById(id);
    }
}
