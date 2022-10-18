package com.prueba.servicios.dto;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class EstudianteRequest {
	
	@JsonProperty("idEstudiante")
	private Integer idestudiante;
	@JsonProperty("Nombre")
	private String nombre;
	@JsonProperty("Edad")
	private Integer edad;
	@JsonProperty("Ciudad")
	private String ciudad;
	@JsonProperty("idZonaH")
	private Integer idzonaH;

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
		return "EstudianteRequest [idestudiante=" + idestudiante + ", nombre=" + nombre + ", edad="
				+ edad + ", ciudad=" + ciudad + ", idzonaH=" + idzonaH + "]";
	}
	public EstudianteRequest(Integer idestudiante, String nombre, Integer edad, String ciudad,
			Integer idzonaH) {
		super();
		this.idestudiante = idestudiante;
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		this.idzonaH = idzonaH;
	}
	
	
}
