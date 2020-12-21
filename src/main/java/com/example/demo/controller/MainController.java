package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.ToDo;
import com.example.demo.service.MainService;

@RestController
@RequestMapping(value = "/todos")
public class MainController {

	
	@Autowired
	MainService service;
	
	@GetMapping
	public ResponseEntity<?> get() { 
		return ResponseEntity.ok(service.getToDo());
	}
	
	@PostMapping
	public ResponseEntity<?> post(@RequestBody ToDo toDo){
		return ResponseEntity.ok(service.addToDo(toDo));
	}
	
	@PutMapping(value = "/{todoId}")
	public ResponseEntity<?> put(@PathVariable int todoId, @RequestBody ToDo toDo){
		return ResponseEntity.ok(service.updateToDo(todoId, toDo));
	}
	
}
