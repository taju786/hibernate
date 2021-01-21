package com.test.HibernateOperation;

import javax.persistence.Embeddable;

@Embeddable
public class AllienName {
private String fname;
private String mnane;
private String lname;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getMnane() {
	return mnane;
}
public void setMnane(String mnane) {
	this.mnane = mnane;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
@Override
public String toString() {
	return "AllienName [fname=" + fname + ", mnane=" + mnane + ", lname=" + lname + "]";
}
}
