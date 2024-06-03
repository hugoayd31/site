package com.example.testneo4j;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.*;


@Getter
@Setter
@RelationshipProperties
public class SeSitueA {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "distance")
    private Double distance;

    @Property(name = "tmpsTrajetVoiture")
    private Double tmpsTrajetVoiture;

    @Property(name = "tmpsTrajetTransport")
    private Double tmpsTrajetTransport;


    @TargetNode
    private Site endSite;


}