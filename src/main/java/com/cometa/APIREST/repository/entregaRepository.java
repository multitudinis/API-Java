package com.cometa.APIREST.repository;

import java.util.List;

import org.hibernate.sql.Delete;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cometa.APIREST.models.entrega;

public interface entregaRepository extends JpaRepository<entrega, Long> {
	List<entrega> findById(long id);
	Delete deleteById(long id);
}
