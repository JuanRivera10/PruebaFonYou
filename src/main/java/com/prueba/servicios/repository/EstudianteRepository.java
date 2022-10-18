package com.prueba.servicios.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.servicios.entity.Estudiante;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Integer>{

	@Transactional(readOnly = true)
	Optional<Estudiante> findByidestudiante(Integer idestudiante);
}
