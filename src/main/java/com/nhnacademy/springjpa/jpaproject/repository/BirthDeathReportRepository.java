package com.nhnacademy.springjpa.jpaproject.repository;

import com.nhnacademy.springjpa.jpaproject.entity.BirthDeathReportResident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirthDeathReportRepository extends JpaRepository<BirthDeathReportResident, Integer> {
}
