package com.prueba.servicios.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ExamenRequest {
	@JsonProperty("idExamen")
	private Integer idexamen;
	
	@JsonProperty("Pregunta1")
	private String pregunta1;
	
	@JsonProperty("Pregunta2")
	private String pregunta2;
	
	@JsonProperty("Pregunta3")
	private String pregunta3;
	
	@JsonProperty("Pregunta4")
	private String pregunta4;
	
	@JsonProperty("idZonaH")
	private Integer idzonah;
	public Integer getIdexamen() {
		return idexamen;
	}
	public void setIdexamen(Integer idexamen) {
		this.idexamen = idexamen;
	}
	public String getPregunta1() {
		return pregunta1;
	}
	public void setPregunta1(String pregunta1) {
		this.pregunta1 = pregunta1;
	}
	public String getPregunta2() {
		return pregunta2;
	}
	public void setPregunta2(String pregunta2) {
		this.pregunta2 = pregunta2;
	}
	public String getPregunta3() {
		return pregunta3;
	}
	public void setPregunta3(String pregunta3) {
		this.pregunta3 = pregunta3;
	}
	public String getPregunta4() {
		return pregunta4;
	}
	public void setPregunta4(String pregunta4) {
		this.pregunta4 = pregunta4;
	}
	public Integer getIdzonah() {
		return idzonah;
	}
	public void setIdzonah(Integer idzonah) {
		this.idzonah = idzonah;
	}
	@Override
	public String toString() {
		return "ExamenRequest [idexamen=" + idexamen + ", pregunta1=" + pregunta1 + ", pregunta2=" + pregunta2
				+ ", pregunta3=" + pregunta3 + ", pregunta4=" + pregunta4 + ", idzonah=" + idzonah + "]";
	}
	public ExamenRequest(Integer idexamen, String pregunta1, String pregunta2, String pregunta3, String pregunta4,
			Integer idzonah) {
		super();
		this.idexamen = idexamen;
		this.pregunta1 = pregunta1;
		this.pregunta2 = pregunta2;
		this.pregunta3 = pregunta3;
		this.pregunta4 = pregunta4;
		this.idzonah = idzonah;
	}
	
	
}
