package com.prueba.servicios.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prueba.servicios.dto.RespExamenRequest;
import com.prueba.servicios.entity.RespExamen;
import com.prueba.servicios.repository.RespExamenRepository;
import com.prueba.servicios.services.RespExamenServices;
import com.prueba.servicios.utils.MHelper;

@Component
public class RespExamenServiceImpl implements RespExamenServices {

	
	@Autowired
	private RespExamenRepository respexamenRepository;

	@Override
	public void save(RespExamenRequest respexamen) {
		
		RespExamen respexamens = MHelper.modelMapper().map(respexamen, RespExamen.class);
		
		this.respexamenRepository.save(respexamens);
		
	}
	
	
}
