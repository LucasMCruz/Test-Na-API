package com.gft.show.controller;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.gft.show.model.CasaShow;
import com.gft.show.repository.CasaShowRepository;
import com.gft.show.service.CasaShowService;

@SpringBootTest
@AutoConfigureMockMvc
class CasadeshowApplicationTests {


	
	@Autowired
	CasaShowRepository casaRe;
	
	@Autowired
	CasaShowService casaSe;
	
	
	@Before
	public void setup(){
		
		System.out.println("iniciando");
	}
	
	@Test
	void deveValidarNomeCasaShow() {
		
	
		assertEquals("Fabrique", casaSe.buscarPorNome("Fabrique").getNome());
	}

}
