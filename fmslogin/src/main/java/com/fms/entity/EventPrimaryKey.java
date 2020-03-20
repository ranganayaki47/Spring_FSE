package com.fms.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EventPrimaryKey implements Serializable {
	
	
    private int employeeId;
	
	private String eventId;
	
	public int getEmployeeId() {
		return employeeId;
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



	public EventPrimaryKey(int employeeId, String eventId) {
		super();
		this.employeeId = employeeId;
		this.eventId = eventId;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventPrimaryKey other = (EventPrimaryKey) obj;
		if (employeeId != other.employeeId)
			return false;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		return true;
	}
	
	
  
}
