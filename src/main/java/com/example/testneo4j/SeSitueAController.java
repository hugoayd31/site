package com.example.testneo4j;

import com.example.testneo4j.SeSitueA;
import com.example.testneo4j.SeSitueAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seSitueA")
public class SeSitueAController {

    @Autowired
    private SeSitueAService seSitueAService;

    @GetMapping
    public List<SeSitueA> getAllSeSitueA() {
        return seSitueAService.findAll();
    }

    @GetMapping("/{id}")
    public SeSitueA getSeSitueAById(@PathVariable Long id) {
        return seSitueAService.findById(id);
    }

    @PostMapping
    public SeSitueA createSeSitueA(@RequestBody SeSitueA seSitueA) {
        return seSitueAService.save(seSitueA);
    }

    @PutMapping("/{id}")
    public SeSitueA updateSeSitueA(@PathVariable Long id, @RequestBody SeSitueA updatedSeSitueA) {
        SeSitueA seSitueA = seSitueAService.findById(id);
        if (seSitueA != null) {
            seSitueA.setDistance(updatedSeSitueA.getDistance());
            seSitueA.setTmpsTrajetVoiture(updatedSeSitueA.getTmpsTrajetVoiture());
            seSitueA.setTmpsTrajetTransport(updatedSeSitueA.getTmpsTrajetTransport());
            return seSitueAService.save(seSitueA);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteSeSitueA(@PathVariable Long id) {
        seSitueAService.deleteById(id);
    }




}