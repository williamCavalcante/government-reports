package project.com.courseConclusionProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.com.courseConclusionProject.dto.PrfStationDto;
import project.com.courseConclusionProject.service.PrfService;

import java.util.List;


@RestController
@RequestMapping("/prfStation")
public class PrfController {

    @Autowired
    private PrfService prfService;

    @GetMapping
    public List<PrfStationDto> getAll() {
        return prfService.getAll();
    }

    @GetMapping("/{id}")
    public PrfStationDto getById(@PathVariable Long id) {
        return prfService.getById(id);
    }

    @PostMapping
    public PrfStationDto create(@RequestBody PrfStationDto prfStationDto) {
        return prfService.create(prfStationDto);
    }

    @PutMapping("/{id}")
    public PrfStationDto update(@PathVariable Long id, @RequestBody PrfStationDto prfStationDto) {
        return prfService.update(id, prfStationDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        prfService.delete(id);
    }
}

