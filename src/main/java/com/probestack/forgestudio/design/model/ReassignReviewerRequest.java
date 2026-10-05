package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ReassignReviewerRequest
 */
@JsonTypeName("reassignReviewer_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T18:38:51.714426785Z[GMT]")public class ReassignReviewerRequest {

  private String currentReviewer;

  private String newReviewer;

  private String reason;

  /**
   * Gets or Sets notifyChannels
   */
  public enum NotifyChannelsEnum {
    EMAIL("EMAIL"),
    
    SLACK("SLACK"),
    
    PAGERDUTY("PAGERDUTY"),
    
    WEBHOOK("WEBHOOK");

    private String value;

    NotifyChannelsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NotifyChannelsEnum fromValue(String value) {
      for (NotifyChannelsEnum b : NotifyChannelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  @Valid
  private List<NotifyChannelsEnum> notifyChannels;

  public ReassignReviewerRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReassignReviewerRequest(String currentReviewer, String newReviewer, String reason) {
    this.currentReviewer = currentReviewer;
    this.newReviewer = newReviewer;
    this.reason = reason;
  }

  public ReassignReviewerRequest currentReviewer(String currentReviewer) {
    this.currentReviewer = currentReviewer;
    return this;
  }

  /**
   * Reviewer being replaced.
   * @return currentReviewer
  */
  @NotNull   @Schema(name = "currentReviewer", example = "amit.kumar@forgesphere.example.com", description = "Reviewer being replaced.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currentReviewer")
  public String getCurrentReviewer() {
    return currentReviewer;
  }

  public void setCurrentReviewer(String currentReviewer) {
    this.currentReviewer = currentReviewer;
  }

  public ReassignReviewerRequest newReviewer(String newReviewer) {
    this.newReviewer = newReviewer;
    return this;
  }

  /**
   * New reviewer to assign.
   * @return newReviewer
  */
  @NotNull   @Schema(name = "newReviewer", example = "priya.sharma@forgesphere.example.com", description = "New reviewer to assign.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("newReviewer")
  public String getNewReviewer() {
    return newReviewer;
  }

  public void setNewReviewer(String newReviewer) {
    this.newReviewer = newReviewer;
  }

  public ReassignReviewerRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for reassignment (min 15 chars).
   * @return reason
  */
  @NotNull @Size(min = 15)   @Schema(name = "reason", example = "Original reviewer is on PTO; reassigning to backup.", description = "Reason for reassignment (min 15 chars).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ReassignReviewerRequest notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public ReassignReviewerRequest addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Channels to notify of the reassignment.
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\"]", description = "Channels to notify of the reassignment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyChannels")
  public List<NotifyChannelsEnum> getNotifyChannels() {
    return notifyChannels;
  }

  public void setNotifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReassignReviewerRequest reassignReviewerRequest = (ReassignReviewerRequest) o;
    return Objects.equals(this.currentReviewer, reassignReviewerRequest.currentReviewer) &&
        Objects.equals(this.newReviewer, reassignReviewerRequest.newReviewer) &&
        Objects.equals(this.reason, reassignReviewerRequest.reason) &&
        Objects.equals(this.notifyChannels, reassignReviewerRequest.notifyChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentReviewer, newReviewer, reason, notifyChannels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReassignReviewerRequest {\n");
    sb.append("    currentReviewer: ").append(toIndentedString(currentReviewer)).append("\n");
    sb.append("    newReviewer: ").append(toIndentedString(newReviewer)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    notifyChannels: ").append(toIndentedString(notifyChannels)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

