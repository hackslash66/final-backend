package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author yashwanth
 *
 * @version 1.8
 */

@Entity
@Table(name = "orders")
@SequenceGenerator(name = "ordseq", sequenceName = "seq_ord", initialValue = 1001, allocationSize = 1)
//@NamedQuery(name = "orderfetch", query = "FROM orders WHERE  uname=:username ")
public class Order {

	@Id
	@Column(name = "Order_id")
	@GeneratedValue(generator = "ordseq", strategy = GenerationType.SEQUENCE)
	private int orderID;
	
	@Column(name = "Order_date")
	private String orderDate;
	
	@Column(name = "emi_duration")
	private String emiDuration;
	
	@ManyToOne
	@JoinColumn(name = "uname")
	private User user;

	
	@OneToOne
	@JoinColumn(name = "pId")
	private Product product;

	@Column(name = "productname",length=50)
	private String productname;
	
	@Column(name = "producturl",length=80)
	private String producturl;
	
	@Column(name = "amountPaid")
	private String amountPaid;
	
	@Column(name = "dueAmount")
	private String dueAmount;
	
	@Column(name = "monthsLeft")
	private String monthsLeft;
	

	

	public String getAmountPaid() {
		return amountPaid;
	}


	public void setAmountPaid(String amountPaid) {
		this.amountPaid = amountPaid;
	}


	public String getDueAmount() {
		return dueAmount;
	}


	public void setDueAmount(String dueAmount) {
		this.dueAmount = dueAmount;
	}


	public String getMonthsLeft() {
		return monthsLeft;
	}


	public void setMonthsLeft(String monthsLeft) {
		this.monthsLeft = monthsLeft;
	}


	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public String getProducturl() {
		return producturl;
	}


	public void setProducturl(String producturl) {
		this.producturl = producturl;
	}


	

	public int getO_id() {
		return orderID;
	}


	public void setO_id(int o_id) {
		this.orderID = o_id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	


	public int getOrderID() {
		return orderID;
	}


	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}


	

	

	public String getEmiDuration() {
		return emiDuration;
	}


	public void setEmiDuration(String emiDuration) {
		this.emiDuration = emiDuration;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Order [id=" + orderID + ", stock=" + orderDate + ", quantity=" + emiDuration + ", quote=" + user+ ",product=" + product +"]";
	}
}