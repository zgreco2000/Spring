package com.Spring.springMVC.accessingdatamysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "ddr")
public class DDR {
  @Id
  private int codigo;
  @Column(name = "denominacion", nullable = false)
  private String denominacion;
  @Column(name = "descripcion", nullable = false)
  private String descripcion;
  @Column(name = "año", nullable = false)
  private int año;
  @Column(name = "posesion", nullable = false)
  private int posesion;
  
public DDR() {
	
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getDenominacion() {
	return denominacion;
}

public void setDenominacion(String denominacion) {
	this.denominacion = denominacion;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public int getAño() {
	return año;
}

public void setAño(int año) {
	this.año = año;
}

public int getPosesion() {
	return posesion;
}

public void setPosesion(int posesion) {
	this.posesion = posesion;
}


}