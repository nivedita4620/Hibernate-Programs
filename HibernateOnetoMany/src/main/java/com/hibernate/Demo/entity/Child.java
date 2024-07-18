package com.hibernate.Demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="childDetails")
public class Child 
{
	private int cid;
	private String cName;
	private Parent parent;
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Child(int cid, String cName, Parent parent) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.parent = parent;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	@Override
	public String toString() {
		return "Child [cid=" + cid + ", cName=" + cName + ", parent=" + parent + "]";
	}

	
}
