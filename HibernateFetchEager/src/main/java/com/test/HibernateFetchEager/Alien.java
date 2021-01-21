package com.test.HibernateFetchEager;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Allien_table")
public class Alien
{
@Id	
private int aid;
@OneToMany(mappedBy="alien" ,fetch=FetchType.EAGER)
private Collection<Laptop> laps=new ArrayList<Laptop>();
private String aname;
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
public Collection<Laptop> getLaps() {
	return laps;
}
public void setLaps(Collection<Laptop> laps) {
	this.laps = laps;
}
}
