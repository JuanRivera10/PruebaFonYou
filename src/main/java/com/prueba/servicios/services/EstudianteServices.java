package com.prueba.servicios.services;

import org.springframework.stereotype.Service;

import com.prueba.servicios.dto.EstudianteRequest;

@Service
public interface EstudianteServices {

	
	void save (EstudianteRequest estudiante);
}
