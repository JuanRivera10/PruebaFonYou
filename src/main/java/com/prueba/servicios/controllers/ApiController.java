package com.prueba.servicios.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.servicios.dto.EstudianteRequest;
import com.prueba.servicios.dto.ExamenRequest;
import com.prueba.servicios.dto.RespExamenRequest;
import com.prueba.servicios.dto.SaveRespEstRequest;
import com.prueba.servicios.entity.Estudiante;
import com.prueba.servicios.entity.Examen;
import com.prueba.servicios.entity.RespExamen;
import com.prueba.servicios.repository.EstudianteRepository;
import com.prueba.servicios.repository.ExamenRepository;
import com.prueba.servicios.repository.RespExamenRepository;
import com.prueba.servicios.services.EstudianteServices;
import com.prueba.servicios.services.ExamenServices;
import com.prueba.servicios.services.RespExamenServices;
import com.prueba.servicios.services.SaveRespEstServices;



@CrossOrigin("*")
@RestController
@RequestMapping("/services")
public class ApiController {

	@Autowired 
	EstudianteServices estudianteServices;
	
	@Autowired
	ExamenServices examenServices;
	
	@Autowired 
	RespExamenServices respexamenServices;
	
	@Autowired
	SaveRespEstServices saverespestServices;
	
	@Autowired
	EstudianteRepository estudianteRepository;
	
	@Autowired
	ExamenRepository examenRepository;
	
	@Autowired
	RespExamenRepository respexamenRepository;
	
	@PostMapping(value = "/guardarestudiante", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saverUser(@RequestBody EstudianteRequest request) {

			System.out.println("SALIDA REQUEST" + request);
		this.estudianteServices.save(request);

		return ResponseEntity.ok(Boolean.TRUE);

	}
	
	@PostMapping(value = "/guardarexamen", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saverExamen(@RequestBody ExamenRequest request) {

			System.out.println("SALIDA REQUEST" + request);
		this.examenServices.save(request);

		return ResponseEntity.ok(Boolean.TRUE);

	}
	
	@PostMapping(value = "/guardarrespexamen", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saverrespExamen(@RequestBody RespExamenRequest request) {

			System.out.println("SALIDA REQUEST" + request);
		this.respexamenServices.save(request);

		return ResponseEntity.ok(Boolean.TRUE);

	}
	
	@PostMapping(value = "/guardarrespexamenest", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saverrespExamenEst(@RequestBody SaveRespEstRequest request) {

		Optional<Estudiante> estid = this.estudianteRepository.findByidestudiante(request.getIdestudiante());
		
		Optional<Examen> exmid = this.examenRepository.findByidexamen(request.getIdexamen());
		
		Optional<RespExamen> respexm =  this.respexamenRepository.findByidexamen(request.getIdexamen());
		
		
		
		
		if(estid.get().getIdzonaH() == exmid.get().getIdzonah()) {
			
			if(respexm.get().getRespuesta1().equals(request.getRespuesta1())) {
				
				if(respexm.get().getRespuesta2().equals(request.getRespuesta2())) {
				
					if(respexm.get().getRespuesta3().equals(request.getRespuesta3())) {
						
						if(respexm.get().getRespuesta4().equals(request.getRespuesta4())) {
							
							System.out.println("SALIDA REQUEST" + request);
							this.saverespestServices.save(request);
							
						}else {
							System.out.println("ERROR");
						}
						
					}else {
						System.out.println("3/4");
					}
					
				}else {
					System.out.println("2/4");
				}
				

			}else {
				System.out.println("1/4");
			}
			

			return ResponseEntity.ok(Boolean.FALSE);
		}
		
		return null;

	}
}
