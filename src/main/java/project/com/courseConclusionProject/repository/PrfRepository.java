package project.com.courseConclusionProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.com.courseConclusionProject.dto.PrfStationDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PrfRepository extends JpaRepository<PrfStationDto, UUID> {
    Optional<PrfStationDto> findByUuid(UUID uuid);
    Optional<PrfStationDto> findById(Long id);
    void deleteById(Long id);

}
