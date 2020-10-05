package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Yashwanth
 *
 * @version 1.8
 */

@Entity
@Table(name = "transactions")
@SequenceGenerator(name = "transseq", sequenceName = "seq_trans", initialValue = 1001, allocationSize = 1)
public class Transaction {

	@Id
	@Column(name = "transactionID")
	@GeneratedValue(generator = "transseq", strategy = GenerationType.SEQUENCE)
	private int transactionID;
	
	@Column(name = "orderID")
	private int orderID;
	
	@Column(name = "transactionDate",length=15)
	private String transactionDate;
	
	@Column(name = "amountPaid")
	private double amountPaid;

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	
	
	
}
