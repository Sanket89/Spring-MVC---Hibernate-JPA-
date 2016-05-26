package com.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
/*@NamedQueries (
@NamedQuery(name="Task.findById", query="select t from TASK where t.id= :pId")
		)*/

public class Task {
	
	@Id
	private String TASK_ID;
	
	private String USER_ID;
	private String GROUP_ID;
	private String STATUS;
	private String PRIORITY_ID;
	private String DUE_DATE;
	private String TITLE;
	private String DESCRIPTION;
	private String RESOURCE_TYPE;
	private String RESOURCE_ID;
	private String PARENT_ID;
	private String CREATED_DATE;
	private String CREATED_BY; 
}
