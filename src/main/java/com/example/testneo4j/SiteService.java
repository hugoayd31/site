package com.example.testneo4j;

import com.example.testneo4j.Site;
import com.example.testneo4j.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteService {

    @Autowired
    private SiteRepository siteRepository;

    public boolean existsById(Long id) {
        return siteRepository.existsById(id);
    }

    public List<Site> findAll() {
        return siteRepository.findAll();
    }

    public Site save(Site site) {
        return siteRepository.save(site);
    }

    public Site findById(Long id) {
        return siteRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        siteRepository.deleteById(id);
    }

    // Méthodes de service pour les recherches personnalisées si nécessaire
    public List<Site> findByName(String name) {
        return siteRepository.findByNomSite(name);
    }

    public List<Site> findByLocation(String location) {
        return siteRepository.findByInfoGeographique(location);
    }
}

