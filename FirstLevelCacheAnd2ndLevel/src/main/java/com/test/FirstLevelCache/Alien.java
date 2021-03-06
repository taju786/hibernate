package com.test.FirstLevelCache;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity(name="IT_table")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien
{
@Id	
private int aid;
private String aname;
private String color;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
}

}
