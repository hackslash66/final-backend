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
@SequenceGenerator(name = "custseq", sequenceName = "seq_cust", initialValue = 1001, allocationSize = 1)
public class Product {
	
	@Id
	@GeneratedValue(generator = "custseq", strategy = GenerationType.SEQUENCE)
	private int pID;
	
	@Column(name="pname",length = 30)
	private String pName;
	
	@Column(name="pdetails",length = 200)
	private String pDetails;
	
	@Column
	private double pRate;
	
	
	
	public int getPid() {
		return pID;
	}
	public void setPid(int pid) {
		this.pID = pid;
	}
	
	public String getPname() {
		return pName;
	}
	public void setPname(String pname) {
		this.pName = pname;
	}
	
	public String getPdetails() {
		return pDetails;
	}
	public void setPdetails(String pdetails) {
		this.pDetails = pdetails;
	}
	
	public double getPrate() {
		return pRate;
	}
	public void setPrate(double prate) {
		this.pRate = prate;
	}
	
	
}
