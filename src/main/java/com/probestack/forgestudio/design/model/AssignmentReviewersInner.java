package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AssignmentReviewersInner
 */
@JsonTypeName("Assignment_reviewers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T18:38:51.714426785Z[GMT]")public class AssignmentReviewersInner {

  private String engineerId;

  private String name;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    PRIMARY("PRIMARY"),
    
    SECONDARY("SECONDARY"),
    
    SUBJECT_EXPERT("SUBJECT_EXPERT"),
    
    LEARNING_OPPORTUNITY("LEARNING_OPPORTUNITY");

    private String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private RoleEnum role;

  private BigDecimal expertiseMatch;

  private Integer currentLoad;

  private BigDecimal fairnessScore;

  private String reasoning;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    IN_REVIEW("IN_REVIEW"),
    
    APPROVED("APPROVED"),
    
    CHANGES_REQUESTED("CHANGES_REQUESTED"),
    
    DISMISSED("DISMISSED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime respondedAt;

  public AssignmentReviewersInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AssignmentReviewersInner(String engineerId, String name, RoleEnum role, BigDecimal expertiseMatch, Integer currentLoad) {
    this.engineerId = engineerId;
    this.name = name;
    this.role = role;
    this.expertiseMatch = expertiseMatch;
    this.currentLoad = currentLoad;
  }

  public AssignmentReviewersInner engineerId(String engineerId) {
    this.engineerId = engineerId;
    return this;
  }

  /**
   * Get engineerId
   * @return engineerId
  */
  @NotNull   @Schema(name = "engineerId", example = "priya.sharma@forgesphere.example.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("engineerId")
  public String getEngineerId() {
    return engineerId;
  }

  public void setEngineerId(String engineerId) {
    this.engineerId = engineerId;
  }

  public AssignmentReviewersInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull   @Schema(name = "name", example = "Priya Sharma", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssignmentReviewersInner role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @NotNull   @Schema(name = "role", example = "PRIMARY", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public AssignmentReviewersInner expertiseMatch(BigDecimal expertiseMatch) {
    this.expertiseMatch = expertiseMatch;
    return this;
  }

  /**
   * 0-1 score of how well this reviewer knows the files.
   * @return expertiseMatch
  */
  @NotNull @Valid   @Schema(name = "expertiseMatch", example = "0.92", description = "0-1 score of how well this reviewer knows the files.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expertiseMatch")
  public BigDecimal getExpertiseMatch() {
    return expertiseMatch;
  }

  public void setExpertiseMatch(BigDecimal expertiseMatch) {
    this.expertiseMatch = expertiseMatch;
  }

  public AssignmentReviewersInner currentLoad(Integer currentLoad) {
    this.currentLoad = currentLoad;
    return this;
  }

  /**
   * Pending reviews at assignment time.
   * @return currentLoad
  */
  @NotNull   @Schema(name = "currentLoad", example = "3", description = "Pending reviews at assignment time.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currentLoad")
  public Integer getCurrentLoad() {
    return currentLoad;
  }

  public void setCurrentLoad(Integer currentLoad) {
    this.currentLoad = currentLoad;
  }

  public AssignmentReviewersInner fairnessScore(BigDecimal fairnessScore) {
    this.fairnessScore = fairnessScore;
    return this;
  }

  /**
   * Higher = more reviews taken historically.
   * @return fairnessScore
  */
  @Valid   @Schema(name = "fairnessScore", example = "78.5", description = "Higher = more reviews taken historically.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fairnessScore")
  public BigDecimal getFairnessScore() {
    return fairnessScore;
  }

  public void setFairnessScore(BigDecimal fairnessScore) {
    this.fairnessScore = fairnessScore;
  }

  public AssignmentReviewersInner reasoning(String reasoning) {
    this.reasoning = reasoning;
    return this;
  }

  /**
   * Get reasoning
   * @return reasoning
  */
    @Schema(name = "reasoning", example = "Owns 68% of the changed files; has capacity (3 pending reviews); last reviewed 4 days ago.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reasoning")
  public String getReasoning() {
    return reasoning;
  }

  public void setReasoning(String reasoning) {
    this.reasoning = reasoning;
  }

  public AssignmentReviewersInner status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
    @Schema(name = "status", example = "IN_REVIEW", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AssignmentReviewersInner respondedAt(OffsetDateTime respondedAt) {
    this.respondedAt = respondedAt;
    return this;
  }

  /**
   * Get respondedAt
   * @return respondedAt
  */
  @Valid   @Schema(name = "respondedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("respondedAt")
  public OffsetDateTime getRespondedAt() {
    return respondedAt;
  }

  public void setRespondedAt(OffsetDateTime respondedAt) {
    this.respondedAt = respondedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignmentReviewersInner assignmentReviewersInner = (AssignmentReviewersInner) o;
    return Objects.equals(this.engineerId, assignmentReviewersInner.engineerId) &&
        Objects.equals(this.name, assignmentReviewersInner.name) &&
        Objects.equals(this.role, assignmentReviewersInner.role) &&
        Objects.equals(this.expertiseMatch, assignmentReviewersInner.expertiseMatch) &&
        Objects.equals(this.currentLoad, assignmentReviewersInner.currentLoad) &&
        Objects.equals(this.fairnessScore, assignmentReviewersInner.fairnessScore) &&
        Objects.equals(this.reasoning, assignmentReviewersInner.reasoning) &&
        Objects.equals(this.status, assignmentReviewersInner.status) &&
        Objects.equals(this.respondedAt, assignmentReviewersInner.respondedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineerId, name, role, expertiseMatch, currentLoad, fairnessScore, reasoning, status, respondedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentReviewersInner {\n");
    sb.append("    engineerId: ").append(toIndentedString(engineerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    expertiseMatch: ").append(toIndentedString(expertiseMatch)).append("\n");
    sb.append("    currentLoad: ").append(toIndentedString(currentLoad)).append("\n");
    sb.append("    fairnessScore: ").append(toIndentedString(fairnessScore)).append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    respondedAt: ").append(toIndentedString(respondedAt)).append("\n");
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

