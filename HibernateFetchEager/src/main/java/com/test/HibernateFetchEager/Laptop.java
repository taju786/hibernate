package com.test.HibernateFetchEager;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop 
{
@Id	
private int lid;
private String lbrand;
private int price;
@ManyToOne
private Alien alien;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLbrand() {
	return lbrand;
}
public void setLbrand(String lbrand) {
	this.lbrand = lbrand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Laptop [lid=" + lid + ", lbrand=" + lbrand + ", price=" + price + ", alien=" + alien + "]";
}


}
