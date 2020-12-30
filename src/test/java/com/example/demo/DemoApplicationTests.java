package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.controller.MainController;
import com.example.demo.service.MainService;

@WebMvcTest(controllers = MainController.class)
class DemoApplicationTests {

	@Autowired
    private MockMvc mvc;

    @MockBean
    private MainService service;
	
	@Test
	void contextLoads() {
	}

}
