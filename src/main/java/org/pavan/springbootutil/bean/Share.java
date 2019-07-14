package org.pavan.springbootutil.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonAutoDetect
//@JsonInclude
@Entity
public class Share {
	
	@Id
	@GeneratedValue
	private long id;
	//@JsonProperty(value="companyName")
	@Column(name="company_name")
	private String companyName;
	@Column
	private double price;
	public Share() {
	}
	@JsonProperty
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn
	private Remark remark;
	
	public Remark getRemark() {
		return remark;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setRemark(Remark remark) {
		this.remark = remark;
	}

}
