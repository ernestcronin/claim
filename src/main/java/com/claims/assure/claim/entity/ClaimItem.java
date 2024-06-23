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
@Table(name = "ClaimItem")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ClaimItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ClaimItemId")
	private Long claimItemId;

	@Column(name = "FileName")
	private String fileName;

	@Column(name = "patientLastName")
	private String patientLastName;

	@Column(name = "PatientFirstName")
	private String patientFirstName;

	@Column(name = "PatientDOB")
	private Date patientDOB;

	@Column(name = "ClaimNumber")
	private String claimNumber;

	@Column(name = "RxDate")
	private Date rxDate;

	@Column(name = "RxNumber")
	private String rxNumber;

	@Column(name = "EcsDate")
	private Date ecsDate;

	@Column(name = "LabelName")
	private String labelName;

	@Column(name = "NDC")
	private String ndc;

	@Column(name = "QTY")
	private Integer qty;

	@Column(name = "IngredientCost")
	private Float ingredientCost;

	@Column(name = "DaySupply")
	private Integer daySupply;

	@Column(name = "PrescriberId")
	private String prescriberId;

	@Column(name = "TotalAmountPaid")
	private Float totalAmountPaid;

	@Column(name = "PharmacyNpi")
	private String pharmacyNpi;

	@Column(name = "GroupId")
	private String groupId;

	@Column(name = "BillingId")
	private Integer billingId;

	@Column(name = "Status")
	private String status;

	@Column(name = "Note")
	private String note;

	@Column(name = "CheckFileName")
	private String checkFileName;

	@Column(name = "ReferenceNumber")
	private String referenceNumber;

	@Column(name = "BGQ")
	private String bgq;

	@Column(name = "ID")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "BatchId", nullable = false)
	private Batch batch;

	@ManyToOne
	@JoinColumn(name = "PatientId", nullable = false)
	private Patient patient;
	
	@ManyToOne
	@JoinColumn(name = "PharmacyId")
	private Pharmacy pharmacy;

	@ManyToOne
	@JoinColumn(name = "PaymentId")
	private Payment payment;

	@ManyToOne
	@JoinColumn(name = "PaymentTypeId")
	private PaymentType paymentType;
}
