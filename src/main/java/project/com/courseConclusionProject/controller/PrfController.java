package project.com.courseConclusionProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.com.courseConclusionProject.entity.PrfRadar;
import project.com.courseConclusionProject.entity.PrfStation;
import project.com.courseConclusionProject.service.PrfService;

import java.util.List;


@RestController
@RequestMapping("/prfStation")
public class PrfController {

    @Autowired
    private PrfService prfService;

    @GetMapping("/search")
    public List<PrfStation> getByUfAndMunicipio(@RequestParam String uf, @RequestParam String municipio) {
        return prfService.getByUfAndMunicipio(uf, municipio);
    }

    @GetMapping("/radar")
    public List<PrfRadar> getRadarByUfAndMunicipio(@RequestParam String uf, @RequestParam String municipio) {
        return prfService.getRadarByUfAndMunicipio(uf, municipio);
    }
}

