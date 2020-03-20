package com.fms.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@Table("test")
public class Test {
	
	@Id
	private Integer id;
	@Column
	private String eventName;
	

	public Integer getId() {
		return id;
	}

	public void settId(Integer id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Test(String eventName) {
		super();
		this.eventName = eventName;
	}

	public Test() {
		super();
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", eventName=" + eventName + "]";
	}
	
	
	
	

}
