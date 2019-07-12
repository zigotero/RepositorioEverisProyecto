package com.example.springboot.testcontroller;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.springboot.controller.FamiliesController;
import com.example.springboot.entity.Families;


@RunWith(SpringJUnit4ClassRunner.class)
public class TestFamilyController {


	//testea todo lo relacionado al llamado de servlets
	//llamar directamente los endpoints
	private MockMvc mocMvc;
	//inyeccion
	@InjectMocks
	private FamiliesController familiesController;

	//creacion del mock  familiescontroller
	@Before
	public void  setUp() throws Exception{
		
		mocMvc= MockMvcBuilders
				.standaloneSetup(familiesController)
				.build();
	}
	
	@Test
	public void testTamiliesController( )throws Exception{
		
		//testear el estado de los endpoints
		mocMvc.perform(MockMvcRequestBuilders.get("/family/all"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		;
		
		
	}
	
}
