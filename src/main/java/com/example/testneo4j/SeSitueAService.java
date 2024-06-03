package com.example.testneo4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeSitueAService {

    @Autowired
    private SeSitueARepository seSitueARepository;

    public List<SeSitueA> findAll() {
        return seSitueARepository.findAll();
    }

    public SeSitueA save(SeSitueA seSitueA) {
        return seSitueARepository.save(seSitueA);
    }

    public SeSitueA findById(Long id) {
        return seSitueARepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        seSitueARepository.deleteById(id);
    }


}