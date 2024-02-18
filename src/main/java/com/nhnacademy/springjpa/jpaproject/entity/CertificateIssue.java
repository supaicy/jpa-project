package com.nhnacademy.springjpa.jpaproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "certificate_issue")
public class CertificateIssue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certificate_confirmation_number", nullable = false)
    private Integer certificateConfirmationNumber;

    @Column(name = "resident_serial_number", nullable = false)
    private Integer residentSerialNumber;

    @Column(name = "certificate_type_code", nullable = false, length = 20)
    private String certificateTypeCode;

    @Column(name = "certificate_issue_date", nullable = false)
    private LocalDate certificateIssueDate;

    // 연관 관계 - 주민과 연결
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resident_serial_number", insertable = false, updatable = false)
    private Resident resident;

}
