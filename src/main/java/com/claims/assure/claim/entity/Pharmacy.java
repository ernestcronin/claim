package com.claims.assure.claim.entity;

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
@Table(name = "Pharmacy")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Pharmacy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PharmacyId")
	private int pharmacyId;
	private String name;
	private String npi;
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
	private String contactPhone;
	private String contactEmail;
	private String taxId;
	private String ncpp;
	private String nabp;
	private String dea;
	private Boolean w9Stored;
	private String w9Filename;
	private String logo;
	private Boolean delivery;
	private Double brandRate;
	private Double genericRate;
	private Boolean lien;
	private Double patientAttorneyRate;
	private Double providerAttorneyRate;
	private Boolean achPayment;
	private String bankAccount;
	private String bankName;
	private String routingNumber;

	@ManyToOne
	@JoinColumn(name = "FinInstId")
	private FinInst finInst;
}
