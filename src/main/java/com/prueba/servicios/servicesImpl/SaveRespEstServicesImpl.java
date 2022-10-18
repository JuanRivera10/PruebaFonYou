package com.prueba.servicios.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prueba.servicios.dto.SaveRespEstRequest;
import com.prueba.servicios.entity.SaveRespEst;
import com.prueba.servicios.repository.SaveRespEstRepository;
import com.prueba.servicios.services.SaveRespEstServices;
import com.prueba.servicios.utils.MHelper;

@Component
public class SaveRespEstServicesImpl implements SaveRespEstServices{

	
	@Autowired
	private SaveRespEstRepository saverespestRepository;

	@Override
	public void save(SaveRespEstRequest saverespest) {
		
		SaveRespEst saveresp = MHelper.modelMapper().map(saverespest, SaveRespEst.class);
		
		this.saverespestRepository.save(saveresp);
		
	}
	
	
}
