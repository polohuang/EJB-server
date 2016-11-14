package com.paul.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USERS")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "NAME", nullable = false)
	@NotNull
	private String name;
	
	@Column(name = "PASSWORD", nullable = false)
	@NotNull
	private String password;
	
	@Column(name = "ID_NUM", nullable = false)
	@Id
	private String IDNumber;
	
	@Column(name = "GENDER", nullable = false)
	@NotNull
	private int gender;
	
	@Column(name = "AGE")
	private int age;
	
	@Column(name = "COUNTRY", nullable = false)
	@NotNull
	private int country;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "EMAIL", nullable = false)
	@NotNull
	private String email;
	
	@Column(name = "TELEPHONE", nullable = false)
	@NotNull
	private String telephone;
	
	@Column(name = "NEWS", nullable = false)
	@NotNull
	private int news;

	public User() {
		super();
	}

	public User(String name, String password, String iDNumber, int gender,
			int age, int country, String address, String email, String tel,
			int news) {
		super();
		this.name = name;
		this.password = password;
		this.IDNumber = iDNumber;
		this.gender = gender;
		this.age = age;
		this.country = country;
		this.address = address;
		this.email = email;
		this.telephone = tel;
		this.news = news;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		this.IDNumber = iDNumber;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCountry() {
		return country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return telephone;
	}

	public void setTel(String tel) {
		this.telephone = tel;
	}
	
	public int getNews() {
		return news;
	}

	public void setNews(int news) {
		this.news = news;
	}
	
}
