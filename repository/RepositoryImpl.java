package com.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.TypedQuery;


import com.data.Notes;
import com.data.Task;
@org.springframework.stereotype.Repository
public class RepositoryImpl implements Repository {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Task> findAll() {
		TypedQuery<Task> query= em.createQuery("Select t from Task t ORDER BY t.TASK_ID ASC", Task.class);
		return query.getResultList();
	}

	@Override
	public List<Notes> findAll1() {
		TypedQuery<Notes> query= em.createQuery("Select t from Notes t ORDER BY t.TASK_ID ASC", Notes.class);
		return query.getResultList();
	}

	@Override
	public Task findbyTask(String TASK_ID) {
		TypedQuery<Task> query= em.createQuery("Select t from Task t where t.TASK_ID= :id", Task.class);
		query.setParameter("id", TASK_ID);
		List<Task> task = query.getResultList();
		if(task!=null && task.size()==1) {
			return task.get(0);
		}
		else {
			return null;
		}
	}

	@Override
	public Task create(Task task) {
		System.out.println(task);
		em.persist(task);
		System.out.println("Value inserted");
		return task;
	}
	
}
