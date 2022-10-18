package com.prueba.servicios.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prueba.servicios.dto.EstudianteDTO;
import com.prueba.servicios.dto.EstudianteRequest;
import com.prueba.servicios.entity.Estudiante;
import com.prueba.servicios.repository.EstudianteRepository;
import com.prueba.servicios.services.EstudianteServices;

import com.prueba.servicios.utils.MHelper;

@Component
public class EstudianteServicesImpl implements EstudianteServices {

	
	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public void save(EstudianteRequest estudiante) {
		Estudiante estudiantes = MHelper.modelMapper().map(estudiante, Estudiante.class);
		
		this.estudianteRepository.save(estudiantes);
	}
}
