package org.pavan.springbootutil.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonAutoDetect
//@JsonIgnoreProperties
@Entity
public class Remark {
	
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String remarkType;
	@Column
	private String description;
	
/*	
	@OneToOne(mappedBy="remark")
	private Share share;*/
	
	public String getRemarkType() {
		return remarkType;
	}
	public void setRemarkType(String remarkType) {
		this.remarkType = remarkType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
/*	public Share getShare() {
		return share;
	}
	public void setShare(Share share) {
		this.share = share;
	}*/

}
