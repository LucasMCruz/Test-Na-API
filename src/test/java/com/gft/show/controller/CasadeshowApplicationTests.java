package com.gft.show.controller;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.gft.show.model.CasaShow;
import com.gft.show.repository.CasaShowRepository;
import com.gft.show.service.CasaShowService;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//@AutoConfigureMockMvc
public class CasadeshowApplicationTests {

	@Autowired
	private WebApplicationContext contex;
	
	private MockMvc mvc;
	
	
	@Mock
	private CasaShowRepository casaRe;
	
	@InjectMocks
	private CasaShowService casaSe;
	
	@Autowired
	private CasaShowService casaService;
	
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		
		this.mvc = MockMvcBuilders.webAppContextSetup(this.contex).build();
		System.out.println("iniciando");
		
	}

	@After
	public void setDown() {
		System.out.println("Finalizado os testes");
	}
	
	@Test
	public void lala() throws Exception {
		String url = "/casas/4";
		this.mvc.perform(get(url)).andExpect(status().isOk());
	}
	
	/*@Test
	public void deveValidarNomeCasaShow(){
		List<CasaShow> casa = Arrays.asList(new CasaShow());
		//assertEquals("Clubinh", casaService.buscarPorNome("Clubinh"));
		Assert.assertEquals(casa, casaService.buscarPorNome("Brasil"));
		
	}*/
	
	@Test
	public void deveValidarAntesdeSalvar() {
		CasaShow casa = new CasaShow();
		casa.setEndereco("av brasil");
		casa.setNome("Clubinho");
		assertNotNull(casaService.salvar(casa));
	}
	
	@Test
	public void deveDeletarUmaCasa() throws Exception {
		
		Mockito.when(casaSe.deletar((long) 2));
	}
	
	/*@Test
	public void deveValidarNomeCasaShow() {
		CasaShow casa = new CasaShow();
		casa.setEndereco("av brasil");
		casa.setNome("Clubinho");
		
		Mockito.when(casaSe.buscarPorNome(casa.getNome())).thenReturn("Clubinho");
		assertEquals("Clubinho", casaService.buscarPorNome("Clubinho").getNome());
	}*/
	

}
