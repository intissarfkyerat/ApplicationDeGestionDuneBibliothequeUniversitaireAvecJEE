package org.eclipse.bean;

public class Loans {
   private int id;
   private String codel,codead;
   private String datel,dateb;
   
public Loans() {
	
}



public Loans(String codep, String codead, String datel, String dateb) {
	
	this.codel = codep;
	this.codead = codead;
	this.datel = datel;
	this.dateb = dateb;
}

public Loans(int id,String codep, String codead, String datel, String dateb) {
	this.id=id;
	this.codel = codep;
	this.codead = codead;
	this.datel = datel;
	this.dateb = dateb;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCodel() {
	return codel;
}


public void setCodel(String codep) {
	this.codel = codep;
}


public String getCodead() {
	return codead;
}


public void setCodead(String codead) {
	this.codead = codead;
}


public String getDatel() {
	return datel;
}


public void setDatel(String datel) {
	this.datel = datel;
}


public String getDateb() {
	return dateb;
}


public void setDateb(String dateb) {
	this.dateb = dateb;
}


@Override
public String toString() {
	return "Loans [codep=" + codel + ", codead=" + codead + ", datel=" + datel + ", dateb=" + dateb + "]";
}
   
}
