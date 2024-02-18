package com.nhnacademy.springjpa.jpaproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "household_movement_address")
public class HouseholdMovementAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "household_serial_number", nullable = false)
    private Integer householdSerialNumber;

    @Column(name = "house_movement_report_date", nullable = false)
    private LocalDate houseMovementReportDate;

    @Column(name = "house_movement_address", nullable = false, length = 500)
    private String houseMovementAddress;

    @Column(name = "last_address_yn", nullable = false, length = 1)
    private String lastAddressYn;

    // 연관 관계 - 세대와 연결
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "household_serial_number", insertable = false, updatable = false)
    private Household household;
}
