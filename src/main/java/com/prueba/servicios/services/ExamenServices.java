package com.prueba.servicios.services;

import org.springframework.stereotype.Service;

import com.prueba.servicios.dto.ExamenRequest;

@Service
public interface ExamenServices {

	
	void save (ExamenRequest examen);
}
