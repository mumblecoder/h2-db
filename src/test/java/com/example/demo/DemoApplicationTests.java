package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.example.demo.bean.ToDo;
import com.example.demo.controller.MainController;
import com.example.demo.service.MainService;

@WebMvcTest(controllers = MainController.class)
class DemoApplicationTests {

	@Autowired
    private MockMvc mvc;

    @MockBean
    private MainService service;
	
	@Test
	void contextLoads() throws Exception {
		
		ToDo todo = new ToDo();
		todo.setContent("test");
		mvc.perform(post("/todos", todo));
		
        //when
        final ResultActions actions = mvc.perform(get("/todos", 1L)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andDo(print());

        //then
        actions
                .andExpect(status().isOk())
                .andExpect(jsonPath("content").value("test"))
        ;
		
		
	}

}
