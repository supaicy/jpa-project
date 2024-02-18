package com.nhnacademy.springjpa.jpaproject.repository;

import com.nhnacademy.springjpa.jpaproject.entity.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<Resident, Integer> {
    Integer findByReportDate(Integer residentSerialNumber)
}
