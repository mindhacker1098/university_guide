package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface sinfo extends CrudRepository<song,Integer>{
	public List<song> findByOrderById();
}
