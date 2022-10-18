package com.prueba.servicios.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.servicios.entity.RespExamen;

@Repository
public interface RespExamenRepository extends CrudRepository<RespExamen, Integer>{

	@Transactional(readOnly = true)
	Optional<RespExamen> findByidexamen(Integer idexamen);
}
