package com.prueba.servicios.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prueba.servicios.dto.ExamenRequest;
import com.prueba.servicios.entity.Examen;
import com.prueba.servicios.repository.ExamenRepository;
import com.prueba.servicios.services.ExamenServices;
import com.prueba.servicios.utils.MHelper;

@Component
public class ExamenServiceImpl implements ExamenServices{

	@Autowired
	private ExamenRepository examenrepository;

	@Override
	public void save(ExamenRequest examen) {
		Examen examenes = MHelper.modelMapper().map(examen, Examen.class);
		
		this.examenrepository.save(examenes);
	}
}
