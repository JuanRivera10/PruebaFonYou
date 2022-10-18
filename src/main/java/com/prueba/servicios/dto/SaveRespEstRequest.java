package com.prueba.servicios.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SaveRespEstRequest {
	
	@JsonProperty("Respuesta1")
	private String respuesta1;
	@JsonProperty("Respuesta2")
	private String respuesta2;
	@JsonProperty("Respuesta3")
	private String respuesta3;
	@JsonProperty("Respuesta4")
	private String respuesta4;
	@JsonProperty("idEstudiante")
	private Integer idestudiante;
	@JsonProperty("idExamen")
	private Integer idexamen;
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
	@Override
	public String toString() {
		return "SaveRespEstRequest [respuesta1=" + respuesta1 + ", respuesta2=" + respuesta2 + ", respuesta3="
				+ respuesta3 + ", respuesta4=" + respuesta4 + ", idestudiante=" + idestudiante + ", idexamen="
				+ idexamen + "]";
	}
	public SaveRespEstRequest(String respuesta1, String respuesta2, String respuesta3, String respuesta4,
			Integer idestudiante, Integer idexamen) {
		super();
		this.respuesta1 = respuesta1;
		this.respuesta2 = respuesta2;
		this.respuesta3 = respuesta3;
		this.respuesta4 = respuesta4;
		this.idestudiante = idestudiante;
		this.idexamen = idexamen;
	}
	
	
	
}
