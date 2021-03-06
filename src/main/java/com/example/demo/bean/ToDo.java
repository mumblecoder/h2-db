package com.example.demo.bean;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Setter
@Getter
@NoArgsConstructor
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_seq")
	Category category;
	
	
}
