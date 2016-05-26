package com.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.data.Notes;
import com.data.Task;

@Component
public interface Service {
	public List<Task> findAll();
	
	public List<Notes> findAll1();
	
	public Task create(Task task);
	

}
