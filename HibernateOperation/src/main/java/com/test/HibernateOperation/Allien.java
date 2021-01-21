package com.test.HibernateOperation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Allien 
{
@Id
private int aid;

private AllienName an;
private String color;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public AllienName getAn() {
	return an;
}
public void setAn(AllienName an) {
	this.an = an;
}
@Override
public String toString() {
	return "Allien [aid=" + aid + ", an=" + an + ", color=" + color + "]";
}

}
