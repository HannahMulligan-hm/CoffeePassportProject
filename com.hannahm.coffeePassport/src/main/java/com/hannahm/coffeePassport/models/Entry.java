package com.hannahm.coffeePassport.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="entry")
public class Entry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min = 5, max = 200)
	private String coffeeName;
	@NotNull
	@Size(min = 5, max = 200)
	private String roast;
	@NotNull
	@Size(min = 5, max = 200)
	private String brewMethod;
	@NotNull
	@Size(min = 5, max = 200)
	private String desc;
	@NotNull
	private String temp;
	@NotNull
	private String origin;
	@Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
	public Entry() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public String getRoast() {
		return roast;
	}

	public void setRoast(String roast) {
		this.roast = roast;
	}

	public String getBrewMethod() {
		return brewMethod;
	}

	public void setBrewMethod(String brewMethod) {
		this.brewMethod = brewMethod;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    
	
    
    
}
