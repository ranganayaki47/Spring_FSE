package com.fms.entity;

import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

import org.springframework.data.annotation.Id;

@Data
@Table("eventsummary")
public class EventSummary {
	
	@Id
	private Long Id;
	
	private String eventId;
	
	private String month;
	
	private String baseLocation;
	
    private String beneficiaryName;
	
	private String venueAddress;
	
	private String councilName;
	
    private String project;
	
	private String category;
	
	private String eventName;
	
    private String eventDescription;
	
	private String eventDate;
	
	private int totalNoOfVolunteers;
	
    private int totalVolunteerHours;
	
	private int totalTravelHours;
	
	private int overallVolunteerHours;
	
    private int livesImpacted;
	
	private String status;
	
	private int activityType;
	
	private int pocId;
	
	private String pocName;
	
	private int pocContact;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getVenueAddress() {
		return venueAddress;
	}

	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}

	public String getCouncilName() {
		return councilName;
	}

	public void setCouncilName(String councilName) {
		this.councilName = councilName;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}


	public int getTotalNoOfVolunteers() {
		return totalNoOfVolunteers;
	}

	public void setTotalNoOfVolunteers(int totalNoOfVolunteers) {
		this.totalNoOfVolunteers = totalNoOfVolunteers;
	}

	public int getTotalVolunteerHours() {
		return totalVolunteerHours;
	}

	public void setTotalVolunteerHours(int totalVolunteerHours) {
		this.totalVolunteerHours = totalVolunteerHours;
	}

	public int getTotalTravelHours() {
		return totalTravelHours;
	}

	public void setTotalTravelHours(int totalTravelHours) {
		this.totalTravelHours = totalTravelHours;
	}

	public int getOverallVolunteerHours() {
		return overallVolunteerHours;
	}

	public void setOverallVolunteerHours(int overallVolunteerHours) {
		this.overallVolunteerHours = overallVolunteerHours;
	}

	public int getLivesImpacted() {
		return livesImpacted;
	}

	public void setLivesImpacted(int livesImpacted) {
		this.livesImpacted = livesImpacted;
	}

	public int getPocId() {
		return pocId;
	}

	public void setPocId(int pocId) {
		this.pocId = pocId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getPocName() {
		return pocName;
	}

	public void setPocName(String pocName) {
		this.pocName = pocName;
	}

	public int getActivityType() {
		return activityType;
	}

	public void setActivityType(int activityType) {
		this.activityType = activityType;
	}

	public int getPocContact() {
		return pocContact;
	}

	public void setPocContact(int pocContact) {
		this.pocContact = pocContact;
	}

	

}
