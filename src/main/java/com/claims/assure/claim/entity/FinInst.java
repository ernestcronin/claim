package com.claims.assure.claim.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "FinInst")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class FinInst {

    @Id
    private int finInstId;
    private String name;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String fax;
    private String email;
    private String url;
    private String contactName;
}
