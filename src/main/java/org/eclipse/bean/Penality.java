package org.eclipse.bean;

public class Penality {
private int id;
private String codepe,codead,penalite;

public Penality() {	
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCodepe() {
	return codepe;
}

public void setCodepe(String codepe) {
	this.codepe = codepe;
}

public String getCodead() {
	return codead;
}

public void setCodead(String codead) {
	this.codead = codead;
}

public String getPenalite() {
	return penalite;
}

public void setPenalite(String penalite) {
	this.penalite = penalite;
}

public Penality(String codepe, String codead, String penalite) {
	this.codepe = codepe;
	this.codead = codead;
	this.penalite = penalite;
}
public Penality(int id,String codepe, String codead, String penalite) {
    this.id=id;
	this.codepe = codepe;
	this.codead = codead;
	this.penalite = penalite;
}
@Override
public String toString() {
	return "Penality [codep=" + codepe + ", codead=" + codead + ", penalite=" + penalite + "]";
}

}
