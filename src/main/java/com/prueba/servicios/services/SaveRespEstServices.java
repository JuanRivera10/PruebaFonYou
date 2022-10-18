package com.prueba.servicios.services;

import org.springframework.stereotype.Service;

import com.prueba.servicios.dto.SaveRespEstRequest;

@Service
public interface SaveRespEstServices {

	void save (SaveRespEstRequest saverespest);
}
