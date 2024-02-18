package com.nhnacademy.springjpa.jpaproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "household")
public class Household {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "household_serial_number", nullable = false)
    private Integer houseHoldSerialNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "household_resident_serial_number", referencedColumnName = "resident_serial_number", nullable = false)
    private Resident resident;

    @Column(name = "household_composition_date", nullable = false)
    private LocalDate householdCompositionDate;

    @Column(name = "household_composition_reason_code", nullable = false, length = 20)
    private String householdCompositionReasonCode;

    @Column(name = "current_house_movement_address", nullable = false)
    private String currentHouseMovementAddress;

    // 연관된 세대구성주민 매핑
    @OneToMany(mappedBy = "household")
    private Set<HouseholdCompositionResident> householdCompositionResidents;
}
