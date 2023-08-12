package com.example.demo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface info extends CrudRepository<data,Integer>{
	public List<data> findByDateGreaterThanOrderByDate(String date);
	public List<data> findByOrderByDate();

}

