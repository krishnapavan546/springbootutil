package org.pavan.springbootutil.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//@Component
@Entity
@Table(name="PAVAN.FINANCE")
public class Finance {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="FINANCESEQUENCE")
	@SequenceGenerator(name="FINANCESEQUENCE",sequenceName="FINANCESEQUENCE")
	private int id;	
	
	//@ManyToOne(targetEntity=Item.class)
	
	//@JoinColumn(name="ITEMNAME")
	@Column(name="ITEMS")
	private String items;
	
	@Column(name="EXPECTEDAMOUNT")
	private Integer expectedAmount;
	@Column(name="ACTUALAMOUNT")
	private Integer actualAmount;
	
	public Finance() {
		System.out.println("Inside Entity object creation ");
	}
	
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public Integer getExpectedAmount() {
		return expectedAmount;
	}
	public void setExpectedAmount(Integer expectedAmount) {
		this.expectedAmount = expectedAmount;
	}
	public Integer getActualAmount() {
		return actualAmount;
	}
	public void setActualAmount(Integer actualAmount) {
		this.actualAmount = actualAmount;
	}
	/*public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = counter;
	}*/
}
