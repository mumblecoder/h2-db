package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Integer>, QuerydslPredicateExecutor<ToDo>{

}
