package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Yashwanth
 *
 * @version 1.8
 */

@Entity
@Table(name = "emi_card")
@NamedQuery(name = "carddetails", query = "FROM EMICard WHERE cardNo=:cardNo")
public class EMICard {
	
	@Id
	@Column(name = "cardNo", length = 16)
	private String cardNo;
	
	@Column(name = "issueDate", length = 20)
	private String issueDate;
	
	@Column(name = "expiryDate", length = 20)
	private String expiryDate;
	
	@Column(name = "balance", length = 20)
	private double balance;
	
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "uname")
	private User user;

	
     


	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}


	public String getIssuedate() {
		return issueDate;
	}


	public void setIssuedate(String issuedate) {
		this.issueDate = issuedate;
	}


	public String getExpirydate() {
		return expiryDate;
	}


	public void setExpirydate(String expirydate) {
		this.expiryDate = expirydate;
	}


	public String getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getCardNo() {
		return cardNo;
	}


    
	
}