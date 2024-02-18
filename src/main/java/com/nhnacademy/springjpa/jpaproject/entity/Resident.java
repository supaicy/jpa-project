package com.nhnacademy.springjpa.jpaproject.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@NamedEntityGraph(
        name = "RESIDENT_REGISTRATION_COPY",
        attributeNodes = {
                @NamedAttributeNode("name"),
                @NamedAttributeNode("residentSerialNumber"),
                @NamedAttributeNode("residentRegistrationNumber")
        }
)
@Entity
@Table(name = "resident")
public class Resident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resident_serial_number", nullable = false)
    private Integer residentSerialNumber;

    @Column(name = "resident_registration_number", nullable = false)
    private String residentRegistrationNumber;

    @Column(nullable = false)
    private String name;

    @Column(name = "gender_code", nullable = false, length = 20)
    private String genderCode;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @OneToMany(mappedBy = "resident")
    private Set<FamilyRelationship> familyRelationships;
}
