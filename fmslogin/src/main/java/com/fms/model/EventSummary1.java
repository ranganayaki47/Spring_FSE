package com.fms.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EventSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T18:02:22.909+05:30[Asia/Calcutta]")
public class EventSummary1   {
  @JsonProperty("totalEvents")
  private String totalEvents = null;

  @JsonProperty("livesImpacted")
  private String livesImpacted = null;

  @JsonProperty("totalVolunteers")
  private String totalVolunteers = null;

  @JsonProperty("totalParticipants")
  private String totalParticipants = null;

  public EventSummary1 totalEvents(String totalEvents) {
    this.totalEvents = totalEvents;
    return this;
  }

  /**
   * Get totalEvents
   * @return totalEvents
  **/
  @ApiModelProperty(value = "")
  
    public String getTotalEvents() {
    return totalEvents;
  }

  public void setTotalEvents(String totalEvents) {
    this.totalEvents = totalEvents;
  }

  public EventSummary1 livesImpacted(String livesImpacted) {
    this.livesImpacted = livesImpacted;
    return this;
  }

  /**
   * Get livesImpacted
   * @return livesImpacted
  **/
  @ApiModelProperty(value = "")
  
    public String getLivesImpacted() {
    return livesImpacted;
  }

  public void setLivesImpacted(String livesImpacted) {
    this.livesImpacted = livesImpacted;
  }

  public EventSummary1 totalVolunteers(String totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
    return this;
  }

  /**
   * Get totalVolunteers
   * @return totalVolunteers
  **/
  @ApiModelProperty(value = "")
  
    public String getTotalVolunteers() {
    return totalVolunteers;
  }

  public void setTotalVolunteers(String totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
  }

  public EventSummary1 totalParticipants(String totalParticipants) {
    this.totalParticipants = totalParticipants;
    return this;
  }

  /**
   * Get totalParticipants
   * @return totalParticipants
  **/
  @ApiModelProperty(value = "")
  
    public String getTotalParticipants() {
    return totalParticipants;
  }

  public void setTotalParticipants(String totalParticipants) {
    this.totalParticipants = totalParticipants;
  }
  
  


  public EventSummary1(String totalEvents, String livesImpacted, String totalVolunteers, String totalParticipants) {
	super();
	this.totalEvents = totalEvents;
	this.livesImpacted = livesImpacted;
	this.totalVolunteers = totalVolunteers;
	this.totalParticipants = totalParticipants;
}
  
  public EventSummary1( String livesImpacted) {
		super();
		
		
	}

@Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSummary1 eventSummary = (EventSummary1) o;
    return Objects.equals(this.totalEvents, eventSummary.totalEvents) &&
        Objects.equals(this.livesImpacted, eventSummary.livesImpacted) &&
        Objects.equals(this.totalVolunteers, eventSummary.totalVolunteers) &&
        Objects.equals(this.totalParticipants, eventSummary.totalParticipants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalEvents, livesImpacted, totalVolunteers, totalParticipants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSummary {\n");
    
    sb.append("    totalEvents: ").append(toIndentedString(totalEvents)).append("\n");
    sb.append("    livesImpacted: ").append(toIndentedString(livesImpacted)).append("\n");
    sb.append("    totalVolunteers: ").append(toIndentedString(totalVolunteers)).append("\n");
    sb.append("    totalParticipants: ").append(toIndentedString(totalParticipants)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
