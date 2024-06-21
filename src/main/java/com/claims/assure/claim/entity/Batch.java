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
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Batch")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Batch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BatchId")
	private Integer batchId;
	
	@Column(name = "BatchType")
	private String batchType;
	
	@Column(name = "BatchClosed")
	private Boolean batchClosed;
	
	@Column(name = "BatchDate")
	private java.sql.Date batchDate;
}
