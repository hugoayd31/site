package com.example.testneo4j;
import com.example.testneo4j.Site;
import com.example.testneo4j.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sites")
public class SiteController {

    @Autowired
    private SiteService siteService;

    @GetMapping("getall")
    public List<Site> getAllSites() {
        return siteService.findAll();
    }

    @GetMapping("site/{id}")
    public Site getSiteById(@PathVariable Long id) {
        return siteService.findById(id);
    }

    @PostMapping
    public Site createSite(@RequestBody Site site) {
        return siteService.save(site);
    }

    @PutMapping("update/{id}")
    public Site updateSite(@PathVariable Long id, @RequestBody Site updatedSite) {
        Site site = siteService.findById(id);
        if (site != null) {
            site.setNomSite(updatedSite.getNomSite());
            site.setInfoGeographique(updatedSite.getInfoGeographique());
            return siteService.save(site);
        }
        return null;
    }

    @DeleteMapping("delete/{id}")
    public void deleteSite(@PathVariable Long id) {
        siteService.deleteById(id);
    }

    // Endpoints pour les recherches personnalisées
    @GetMapping("/name/{name}")
    public List<Site> getSitesByName(@PathVariable String name) {
        return siteService.findByName(name);
    }

    @GetMapping("/location/{location}")
    public List<Site> getSitesByLocation(@PathVariable String location) {
        return siteService.findByLocation(location);
    }

    // Nouvelle méthode GET pour récupérer les sites sans seSitueAOutgoing
    @GetMapping("/synthese")
    public List<SiteProjection> getAllSitesWithoutOutgoing() {
        return siteService.findAllProjected();
    }
}