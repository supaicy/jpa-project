package com.nhnacademy.springjpa.jpaproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "household_composition_resident")
public class HouseholdCompositionResident {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "household_serial_number", referencedColumnName = "household_serial_number", nullable = false)
    private Household household;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resident_serial_number", referencedColumnName = "resident_serial_number", nullable = false)
    private Resident resident;

    @Column(name = "report_date", nullable = false)
    private LocalDate reportDate;

    @Column(name = "household_relationship_code", nullable = false, length = 20)
    private String householdRelationshipCode;

    @Column(name = "household_composition_change_reason_code", nullable = false, length = 20)
    private String householdCompositionChangeReasonCode;
}