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
@Table(name="RESPUESTASEXAMEN")
public class RespExamen {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="Respuesta1")
	private String respuesta1;
	@Column(name="Respuesta2")
	private String respuesta2;
	@Column(name="Respuesta3")
	private String respuesta3;
	@Column(name="Respuesta4")
	private String respuesta4;
	@Column(name="idExamen")
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
	public Integer getIdexamen() {
		return idexamen;
	}
	public void setIdexamen(Integer idexamen) {
		this.idexamen = idexamen;
	}
	@Override
	public String toString() {
		return "RespExamen [id=" + id + ", respuesta1=" + respuesta1 + ", respuesta2=" + respuesta2 + ", respuesta3="
				+ respuesta3 + ", respuesta4=" + respuesta4 + ", idexamen=" + idexamen + "]";
	}
	
	
}
