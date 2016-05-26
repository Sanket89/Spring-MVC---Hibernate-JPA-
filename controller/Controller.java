package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.data.Notes;
import com.data.Task;
import com.services.Service;

@RestController
@RequestMapping(value="/itsm")

public class Controller {
	
	@Autowired
	private Service service;

	@RequestMapping(value="/task",method=RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Task> findAll(){
		return service.findAll();		
	}
	
	@RequestMapping(value="/createRequest", method=RequestMethod.POST,  produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Task create(@RequestBody Task task){
		return service.create(task);		
	}
	
	@RequestMapping(value="/notes",method=RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Notes> findAll1(){
		return service.findAll1();		
	}
}
