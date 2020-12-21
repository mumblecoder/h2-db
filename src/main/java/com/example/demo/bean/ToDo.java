package com.example.demo.bean;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int seq;
	
	@CreationTimestamp
	LocalDateTime createDt;
	@UpdateTimestamp
	LocalDateTime updateDt;
	
	String content;
	boolean success;
	
}
