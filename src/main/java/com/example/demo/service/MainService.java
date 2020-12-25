package com.example.demo.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.ToDo;
import com.example.demo.repository.ToDoRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Service
public class MainService {
	
	@Autowired
	ToDoRepository repository;
	
	@Autowired
	JPAQueryFactory factory;

	public List<ToDo> getToDo() {
		return repository.findAll();
	}

	public Object addToDo(ToDo toDo) {
		return repository.save(toDo);
	}

	public Object updateToDo(int todoId, ToDo toDo) {
		ToDo td = repository.findById(todoId).orElseThrow();
		if (td != null) {
			td.setSuccess(toDo.isSuccess());
			if (toDo.getContent() != null) {
				td.setContent(toDo.getContent());
			}
			return repository.save(td);
		}
		return null;
	}
	
	public void queryDslTest() {
		
	}
	
}
