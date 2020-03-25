package com.gft.show.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gft.show.model.CasaShow;

public interface CasaShowRepository extends JpaRepository<CasaShow, Long>{
	
	public CasaShow findByNome(String nome);

	public void save(String string);

		
	
}
