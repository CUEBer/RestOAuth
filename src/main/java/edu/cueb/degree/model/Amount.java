package edu.cueb.degree.model;

import edu.cueb.degree.util.JpaConverterJson;

import javax.persistence.*;

@Entity
public class Amount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double pDoctor;
    private double pMaster;
    @Column(columnDefinition = "json")
    @Convert(converter = JpaConverterJson.class)
    private AgeStructure struct[];
}
