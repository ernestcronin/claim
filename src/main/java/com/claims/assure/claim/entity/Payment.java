package com.claims.assure.claim.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "Payment")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Payment {

    @Id
    @Column(name = "PaymentId")
    private Integer paymentId;

    @Column(name = "PharmacyId")
    private Integer pharmacyId;

    @Column(name = "Reference")
    private String reference;

    @Column(name = "Amount", precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(name = "PaymentDate")
    private Date paymentDate;

    @Column(name = "PaymentTypeId")
    private Integer paymentTypeId;

    @Column(name = "Status")
    private String status;

    // Foreign key mappings

    @ManyToOne
    @JoinColumn(name = "PharmacyId", insertable = false, updatable = false)
    private Pharmacy pharmacy;

    @ManyToOne
    @JoinColumn(name = "PaymentTypeId", insertable = false, updatable = false)
    private PaymentType paymentType;

}
