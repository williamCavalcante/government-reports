package project.com.courseConclusionProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import project.com.courseConclusionProject.entity.PrfRadar;
import project.com.courseConclusionProject.entity.PrfStation;

import java.util.List;
import java.util.UUID;

@Repository
public interface PrfRepository extends JpaRepository<PrfStation, UUID> {
    @Query("SELECT p FROM PrfStation p WHERE p.uf = ?1 AND p.county = ?2")
    List<PrfStation> findByUfAndCounty(String uf, String county);

    @Query("SELECT p FROM PrfRadar p WHERE p.uf = ?1 AND p.municipio = ?2")
    List<PrfRadar> findByUfAndMunicipio(String uf, String municipio);
}
