package com.hibernate.Demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parentDetails")
public class Parent 
{
	@Id
	private int p_id;
	private String pname;
	
	private Child child ;
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parent(int p_id, String pname, Child child) {
		super();
		this.p_id = p_id;
		this.pname = pname;
		this.child = child;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Child getChild() {
		return child;
	}
	public void setChild(Child child) {
		this.child = child;
	}
	@Override
	public String toString() {
		return "Parent [p_id=" + p_id + ", pname=" + pname + ", child=" + child + "]";
	}
	
	
	
}
