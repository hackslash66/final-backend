package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



/**
 * @author Akshara
 *
 * @version 1.8
 */

@Entity
@Table(name = "users")
@NamedQuery(name = "login", query = "FROM User WHERE uname=:username AND password=:password AND status=:status")
@NamedQuery(name = "fetchifyes", query = "select u from User u where u.status=:status")
public class User {
	
	@Id
	@Column(name = "uname",length=15)
	private String uname;
	
	@Column(name = "email",length=25)
	private String email;
	
	@Column(name = "password",length=15)
	private String password;
	
	@Column(name = "phone",length=15)
	private String phone;
	
	@Column(name = "name",length=15)
	private String name;
	
	@Column(name = "account",length=16)
	private String account;
	
	@Column(name = "ifsc",length=15)
	private String ifsc;
	
	@Column(name = "address",length=40)
	private String address;
	
	@Column(name = "bank",length=15)
	private String bank;
	
	@Column(name = "card",length=15)
	private String card;
	
	@Column(name = "status",length=15)
	private String status;

	@OneToMany(mappedBy = "user", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Order> ord = new ArrayList<Order>();

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Order> getOrd() {
		return ord;
	}

	public void setOrd(List<Order> ord) {
		this.ord = ord;
	}

	

}
