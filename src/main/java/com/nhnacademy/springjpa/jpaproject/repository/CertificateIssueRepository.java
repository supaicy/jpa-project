package com.nhnacademy.springjpa.jpaproject.repository;

import com.nhnacademy.springjpa.jpaproject.entity.CertificateIssue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateIssueRepository extends JpaRepository<CertificateIssue, Integer> {
}
