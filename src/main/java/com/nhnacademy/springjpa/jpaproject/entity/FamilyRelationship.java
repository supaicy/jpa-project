package com.nhnacademy.springjpa.jpaproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "family_relationship")
public class FamilyRelationship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "family_resident_serial_number", nullable = false)
    private Integer familyResidentSerialNumber;

    @Column(name = "family_relationship_code", nullable = false)
    private String familyRelationshipCode;

    @ManyToOne
    @JoinColumn(name = "base_resident_serial_number", insertable = false, updatable = false)
    private Resident resident;
}