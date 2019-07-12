package com.example.springboot.testcontroller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import com.example.springboot.controller.ParentsController;

public class TestParentController {
	

	//testea todo lo relacionado al llamado de servlets
	//llamar directamente los endpoints
	@Autowired
	private MockMvc mocMvc;
	//inyeccion
	//@InjectMocks
	@MockBean
	private ParentsController parentsController;

	//creacion del mock  familiescontroller
	@Before
	public void  setUp() throws Exception{
		
		mocMvc= MockMvcBuilders
				.standaloneSetup(parentsController)
				.build();
	}
	
	@Test
	public void testParentsController( )throws Exception{
		
		//testear el estado de los endpoints
		mocMvc.perform(MockMvcRequestBuilders.get("/parents/all"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		;
		
		
	}

}
