package com.prueba.servicios.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class SaveRespEstDTO {

	@Id
	private Integer id;
	private String respuesta1;
	private String respuesta2;
	private String respuesta3;
	private String respuesta4;
	private Integer idestudiante;
	private Integer idexamen;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRespuesta1() {
		return respuesta1;
	}
	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}
	public String getRespuesta2() {
		return respuesta2;
	}
	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}
	public String getRespuesta3() {
		return respuesta3;
	}
	public void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}
	public String getRespuesta4() {
		return respuesta4;
	}
	public void setRespuesta4(String respuesta4) {
		this.respuesta4 = respuesta4;
	}
	public Integer getIdestudiante() {
		return idestudiante;
	}
	public void setIdestudiante(Integer idestudiante) {
		this.idestudiante = idestudiante;
	}
	public Integer getIdexamen() {
		return idexamen;
	}
	public void setIdexamen(Integer idexamen) {
		this.idexamen = idexamen;
	}
	
	
}
