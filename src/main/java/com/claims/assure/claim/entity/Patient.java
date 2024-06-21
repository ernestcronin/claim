package com.claims.assure.claim.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Patient")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PatientId")
    private Long patientId;
    
    @ManyToOne
    @JoinColumn(name = "InsuranceId")
    private Insurance insurance;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "DOB")
    private Date dob;

    @Column(name = "ClaimNumber")
    private String claimNumber;
    
    @Column(name = "GroupId")
    private Integer groupId;

    @Column(name = "Address1")
    private String address1;

    @Column(name = "Address2")
    private String address2;

    @Column(name = "City")
    private String city;

    @Column(name = "State")
    private String state;

    @Column(name = "Zip")
    private String zip;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Email")
    private String email;

    @Column(name = "ResidenceCode")
    private String residenceCode;

    @ManyToOne
    @JoinColumn(name = "PatientStatusId")
    private PatientStatus patientStatus;

    @Column(name = "Notes")
    private String notes;

    @Column(name = "Updated")
    private Date updated;

    @ManyToOne
    @JoinColumn(name = "AttorneyId")
    private Attorney attorney;

}
