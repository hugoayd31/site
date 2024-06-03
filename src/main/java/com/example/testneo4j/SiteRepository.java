package com.example.testneo4j;

import com.example.testneo4j.Site;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;
public interface SiteRepository extends Neo4jRepository<Site, Long> {
    List<Site> findByNomSite(String nomSite);
    List<Site> findByInfoGeographique(String infoGeographique);
    @Query("MATCH (s:Site) RETURN s")
    List<SiteProjection> findAllProjectedBy();
}