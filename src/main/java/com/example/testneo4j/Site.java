package com.example.testneo4j;


import com.example.testneo4j.SeSitueA;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;
import java.util.Set;
@Getter
@Setter
@Node
public class Site {

    @Id
    @GeneratedValue
    private Long id;
    private String nomSite;
    private String infoGeographique;
    private boolean siteParalympique;


    @JsonManagedReference
    @Relationship(type = "SESITUEA", direction = Relationship.Direction.OUTGOING)
    private List<SeSitueA> seSitueAOutgoing;

    @JsonBackReference
    @Relationship(type = "SESITUEA", direction = Relationship.Direction.INCOMING)
    private List<SeSitueA> seSitueAIncoming;

}