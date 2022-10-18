package com.prueba.servicios.services;

import org.springframework.stereotype.Service;

import com.prueba.servicios.dto.RespExamenRequest;

@Service
public interface RespExamenServices {

	void save (RespExamenRequest respexamen);
}
