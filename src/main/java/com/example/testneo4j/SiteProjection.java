package com.example.testneo4j;

import java.util.List;

public interface SiteProjection {
    Long getId();
    String getNomSite();
    String getInfoGeographique();
    boolean isSiteParalympique();
}
