package com.fms.entity;

public class DashBoard {
	
	private String totalEvents;
	private String livesImpacted;
	private String totalVolunteers;
	private String totalParticipants;
	
	public DashBoard() {
		super();
	}

	public DashBoard(String totalEvents, String livesImpacted, String totalVolunteers, String totalParticipants) {
		super();
		this.totalEvents = totalEvents;
		this.livesImpacted = livesImpacted;
		this.totalVolunteers = totalVolunteers;
		this.totalParticipants = totalParticipants;
	}

	public String getTotalEvents() {
		return totalEvents;
	}

	public void setTotalEvents(String totalEvents) {
		this.totalEvents = totalEvents;
	}

	public String getLivesImpacted() {
		return livesImpacted;
	}

	public void setLivesImpacted(String livesImpacted) {
		this.livesImpacted = livesImpacted;
	}

	public String getTotalVolunteers() {
		return totalVolunteers;
	}

	public void setTotalVolunteers(String totalVolunteers) {
		this.totalVolunteers = totalVolunteers;
	}

	public String getTotalParticipants() {
		return totalParticipants;
	}

	public void setTotalParticipants(String totalParticipants) {
		this.totalParticipants = totalParticipants;
	}
	
	
	
	

}
