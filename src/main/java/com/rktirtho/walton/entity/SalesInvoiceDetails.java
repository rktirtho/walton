package com.rktirtho.walton.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Table
@Entity
public class SalesInvoiceDetails {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
   @OneToOne
   private SalesInvoice salesInvoice;
   private Integer lineNumber;
   @OneToOne
   private Product product;
   private String productName;
   private Double quantity;
   private Double unitPrice;
   private Double amount;

}
