package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author surya
 *
 * @version 1.8
 */

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@Column(name = "pId")
	private int pId;
	
	@Column(name="pname",length = 30)
	private String pName;
	
	@Column(name="pdes",length = 200)
	private String pDetails;
	
	@Column(name="prate")
	private double pRate;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpDetails() {
		return pDetails;
	}

	public void setpDetails(String pDetails) {
		this.pDetails = pDetails;
	}

	public double getpRate() {
		return pRate;
	}

	public void setpRate(double pRate) {
		this.pRate = pRate;
	}
	
	
	
	
	
	
}
