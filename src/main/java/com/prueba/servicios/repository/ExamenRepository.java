package com.prueba.servicios.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.servicios.entity.Examen;

@Repository
public interface ExamenRepository extends CrudRepository<Examen, Integer> {

	@Transactional(readOnly = true)
	Optional<Examen> findByidexamen(Integer idexamen);
}
