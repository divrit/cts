package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name="Power")
public class ManAtWork {
@Id

private int sid;

private String name;

private int agee;
public ManAtWork() {
	super();
	// TODO Auto-generated constructor stub
}
public ManAtWork(int sid, String name, int agee) {
	super();
	this.sid = sid;
	this.name = name;
	this.agee = agee;
}
@Override
public String toString() {
	return "ManAtWork [sid=" + sid + ", name=" + name + ", agee=" + agee + "]";
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAgee() {
	return agee;
}
public void setAgee(int agee) {
	this.agee = agee;
}


}
