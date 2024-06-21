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
@Table(name = "Insurance")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "InsuranceId")
    private Long insuranceId;

    @Column(name = "CompanyName")
    private String companyName;

    @Column(name = "PriorCompanyName")
    private String priorCompanyName;

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

    @Column(name = "Phone1")
    private String phone1;

    @Column(name = "Phone2")
    private String phone2;

    @Column(name = "Phone3")
    private String phone3;

    @Column(name = "Phone4")
    private String phone4;

    @Column(name = "Phone5")
    private String phone5;

    @Column(name = "Url")
    private String url;

    @Column(name = "SendAs")
    private String sendAs;

    @Column(name = "AdjustorSpecific")
    private String adjustorSpecific;

    @Column(name = "LienStatement")
    private String lienStatement;

    @Column(name = "Copies")
    private Integer copies;

    @Column(name = "Email1")
    private String email1;

    @Column(name = "Email2")
    private String email2;

    @Column(name = "Email3")
    private String email3;

    @Column(name = "Email4")
    private String email4;

    @Column(name = "Email5")
    private String email5;

    @Column(name = "Fax1")
    private String fax1;

    @Column(name = "Fax2")
    private String fax2;

    @Column(name = "Fax3")
    private String fax3;

    @Column(name = "Fax4")
    private String fax4;

    @Column(name = "Fax5")
    private String fax5;

    @Column(name = "InvoiceByLine")
    private Boolean invoiceByLine;
}
