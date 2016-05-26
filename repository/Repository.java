package com.repository;

import java.util.List;

import com.data.Notes;
import com.data.Task;

public interface Repository {
	public List<Task> findAll();

	public List<Notes> findAll1();
	public Task create(Task task);
	
	public Task findbyTask(String TASK_ID);
}
