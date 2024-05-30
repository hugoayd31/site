package com.example.testneo4j;

import com.example.testneo4j.SeSitueA;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import java.util.List;

public interface SeSitueARepository extends Neo4jRepository<SeSitueA, Long> {
    List<SeSitueA> findByStartSiteNomSite(String nomSite);
    List<SeSitueA> findByEndSiteNomSite(String nomSite);
}
