package com.prueba.servicios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.servicios.entity.SaveRespEst;

@Repository
public interface SaveRespEstRepository extends CrudRepository<SaveRespEst, Integer>{

}
