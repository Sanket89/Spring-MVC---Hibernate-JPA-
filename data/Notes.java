package com.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Notes {

	@Id
	@GenericGenerator(strategy="uuid2", name="myuuid")
	@GeneratedValue(generator="myuuid")
	
	private String id;
	
	@Column(unique=true)
	private String NOTE_ID;
	private String NOTE;
	private String TASK_ID;

	private String TYPE;
	private String PARENT_ID;
	private String CREATED_DATE;
	private String CREATED_BY; 
	private String RESOURCE_TYPE;
	private String RESOURCE_ID;
}
