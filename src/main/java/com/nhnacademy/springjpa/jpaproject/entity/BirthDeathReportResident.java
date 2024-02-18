package com.nhnacademy.springjpa.jpaproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "birtg_death_report")
public class BirthDeathReportResident {

    @Id
    @Column(name = "birth_death_type_code", nullable = false)
    private String birthDeathTypeCode;

    @Column(name = "report_resident_serial_number", nullable = false)
    private Integer reportResidentSerialNumber;

    @Column(name = "birth_death_report_date", nullable = false)
    private LocalDate birthDeathReportDate;

    @Column(name = "birth_report_qualifications_code")
    private String birthReportQualificationsCode;

    @Column(name = "death_report_qualifications_code")
    private String deathReportQualificationsCode;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "report_resident_serial_number", referencedColumnName = "resident_serial_number", insertable = false, updatable = false)
    private Resident reportingResident;
}
