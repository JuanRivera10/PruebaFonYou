package com.prueba.servicios.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class ExamenDTO {

	@Id
	private Integer id;
	private Integer idexamen;
	private String pregunta1;
	private String pregunta2;
	private String pregunta3;
	private String pregunta4;
	private Integer idzonah;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

}
