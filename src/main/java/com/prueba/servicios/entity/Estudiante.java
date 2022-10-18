package com.prueba.servicios.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ESTUDIANTE")
public class Estudiante {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="idEstudiante")
	private Integer idestudiante;
	@Column(name="Nombre")
	private String nombre;
	@Column(name="Edad")
	private Integer edad;
	@Column(name="Ciudad")
	private String ciudad;
	@Column(name="idZonaH")
	private Integer idzonaH;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdestudiante() {
		return idestudiante;
	}
	public void setIdestudiante(Integer idestudiante) {
		this.idestudiante = idestudiante;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Integer getIdzonaH() {
		return idzonaH;
	}
	public void setIdzonaH(Integer idzonaH) {
		this.idzonaH = idzonaH;
	}
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", idestudiante=" + idestudiante + ", nombre=" + nombre + ", edad=" + edad
				+ ", ciudad=" + ciudad + ", idzonaH=" + idzonaH + "]";
	}
	
	
}
