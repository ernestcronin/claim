package com.claims.assure.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claims.assure.claim.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
