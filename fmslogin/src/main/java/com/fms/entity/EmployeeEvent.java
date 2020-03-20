package com.fms.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;



@Table("employee_event")
public class EmployeeEvent {
	
	@Id
	private long id;
	
	private String type;
	
    private int employeeId;
	
	private String eventId;
	
	public int getEmployeeId() {
		return employeeId;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEventId() {
		return eventId;
	}



	public void setEventId(String eventId) {
		this.eventId = eventId;
	}




	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	

}
