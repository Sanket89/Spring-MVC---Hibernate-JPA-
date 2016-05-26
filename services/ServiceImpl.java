package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.Notes;
import com.data.Task;
import com.repository.Repository;


@org.springframework.stereotype.Service
@org.springframework.transaction.annotation.Transactional
public class ServiceImpl implements Service{
	
	@Autowired
	private Repository repository;
	
	public List<Task> findAll() {
		return repository.findAll();
	}
	
	public List<Notes> findAll1() {
		return repository.findAll1();
	}
	
	public Task create(Task task)
	{
		Task t = repository.findbyTask(task.getTASK_ID());
		System.out.println(task.getTASK_ID());
		if(t != null) {
			System.out.println("Error");
			return null;
		}
		else {
			return repository.create(task);
		}
		
	}
	
	
}
