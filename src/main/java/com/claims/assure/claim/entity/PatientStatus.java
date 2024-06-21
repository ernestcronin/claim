package com.claims.assure.claim.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PatientStatus")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PatientStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PatientStatusId")
    private Long patientStatusId;

    @Column(name = "PatientStatusName")
    private String patientStatusName;
}