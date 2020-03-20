package com.fms.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.data.annotation.Id;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T18:02:22.909+05:30[Asia/Calcutta]")
public class UserInfo   {
  @JsonProperty("token")
  private String token = null;

  @JsonIgnore
  private String userId = null;

  @JsonProperty("roleId")
  private String roleId = null;
  
  
  @JsonProperty("userId")
  @Id
  private long id;
  
  

  public UserInfo(String token, String userId, String roleId) {
	super();
	this.token = token;
	this.userId = userId;
	this.roleId = roleId;
}

public UserInfo token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  
    public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public UserInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  
    public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserInfo roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId
   * @return roleId
  **/
  @ApiModelProperty(value = "")
  
    public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }
  
  


  public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

@Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfo userInfo = (UserInfo) o;
    return Objects.equals(this.token, userInfo.token) &&
        Objects.equals(this.userId, userInfo.userId) &&
        Objects.equals(this.roleId, userInfo.roleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, userId, roleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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
