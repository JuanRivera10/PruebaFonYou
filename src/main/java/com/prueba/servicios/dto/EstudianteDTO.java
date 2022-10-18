package com.prueba.servicios.dto;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;

@Data
public class EstudianteDTO {
	@Id
	private Integer id;
	private Integer idestudiante;
	private String nombre;
	private Integer edad;
	private String ciudad;
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
	
	
}
