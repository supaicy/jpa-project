package com.nhnacademy.springjpa.jpaproject.repository;

import com.nhnacademy.springjpa.jpaproject.entity.FamilyRelationship;
import com.nhnacademy.springjpa.jpaproject.entity.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.NamedEntityGraph;
import java.util.List;


public interface FamilyRelationshipRepository extends JpaRepository<FamilyRelationship, Integer> {
    List<Resident> findByFamilyResidentSerialNumber(Integer residentSerialNumber);

    List<FamilyRelationship> findByFamilyRelationshipCode(String familyRelationshipCode);

}
