package com.nhnacademy.springjpa.jpaproject.repository;

import com.nhnacademy.springjpa.jpaproject.entity.Household;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseholdRepository extends JpaRepository<Household, Integer> {
}
