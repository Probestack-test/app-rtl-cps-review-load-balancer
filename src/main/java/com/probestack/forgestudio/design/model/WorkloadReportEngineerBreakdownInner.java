package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WorkloadReportEngineerBreakdownInner
 */
@JsonTypeName("WorkloadReport_engineerBreakdown_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T18:38:51.714426785Z[GMT]")public class WorkloadReportEngineerBreakdownInner {

  private String engineerId;

  private String name;

  /**
   * Gets or Sets seniority
   */
  public enum SeniorityEnum {
    JUNIOR("JUNIOR"),
    
    MID("MID"),
    
    SENIOR("SENIOR"),
    
    STAFF("STAFF"),
    
    PRINCIPAL("PRINCIPAL");

    private String value;

    SeniorityEnum(String value) {
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
    public static SeniorityEnum fromValue(String value) {
      for (SeniorityEnum b : SeniorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SeniorityEnum seniority;

  private Integer pendingReviews;

  private Integer reviewsCompleted;

  private Integer reviewsRequested;

  private Integer avgResponseTimeMinutes;

  private Integer medianResponseTimeMinutes;

  private Double slaCompliancePercent;

  private Double approvalRatePercent;

  private Double changesRequestedRatePercent;

  private BigDecimal fairnessScore;

  private BigDecimal fairnessDelta;

  /**
   * Gets or Sets burnoutRisk
   */
  public enum BurnoutRiskEnum {
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    CRITICAL("CRITICAL");

    private String value;

    BurnoutRiskEnum(String value) {
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
    public static BurnoutRiskEnum fromValue(String value) {
      for (BurnoutRiskEnum b : BurnoutRiskEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private BurnoutRiskEnum burnoutRisk;

  @Valid
  private List<String> expertiseAreas;

  /**
   * Gets or Sets availability
   */
  public enum AvailabilityEnum {
    AVAILABLE("AVAILABLE"),
    
    ON_LEAVE("ON_LEAVE"),
    
    ONCALL("ONCALL"),
    
    FOCUS_TIME("FOCUS_TIME"),
    
    DO_NOT_DISTURB("DO_NOT_DISTURB");

    private String value;

    AvailabilityEnum(String value) {
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
    public static AvailabilityEnum fromValue(String value) {
      for (AvailabilityEnum b : AvailabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private AvailabilityEnum availability;

  public WorkloadReportEngineerBreakdownInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkloadReportEngineerBreakdownInner(String engineerId, String name, Integer pendingReviews, Integer reviewsCompleted, Integer avgResponseTimeMinutes, BigDecimal fairnessScore) {
    this.engineerId = engineerId;
    this.name = name;
    this.pendingReviews = pendingReviews;
    this.reviewsCompleted = reviewsCompleted;
    this.avgResponseTimeMinutes = avgResponseTimeMinutes;
    this.fairnessScore = fairnessScore;
  }

  public WorkloadReportEngineerBreakdownInner engineerId(String engineerId) {
    this.engineerId = engineerId;
    return this;
  }

  /**
   * Get engineerId
   * @return engineerId
  */
  @NotNull   @Schema(name = "engineerId", example = "amit.kumar@forgesphere.example.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("engineerId")
  public String getEngineerId() {
    return engineerId;
  }

  public void setEngineerId(String engineerId) {
    this.engineerId = engineerId;
  }

  public WorkloadReportEngineerBreakdownInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull   @Schema(name = "name", example = "Amit Kumar", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkloadReportEngineerBreakdownInner seniority(SeniorityEnum seniority) {
    this.seniority = seniority;
    return this;
  }

  /**
   * Get seniority
   * @return seniority
  */
    @Schema(name = "seniority", example = "SENIOR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seniority")
  public SeniorityEnum getSeniority() {
    return seniority;
  }

  public void setSeniority(SeniorityEnum seniority) {
    this.seniority = seniority;
  }

  public WorkloadReportEngineerBreakdownInner pendingReviews(Integer pendingReviews) {
    this.pendingReviews = pendingReviews;
    return this;
  }

  /**
   * Reviews currently in queue.
   * @return pendingReviews
  */
  @NotNull   @Schema(name = "pendingReviews", example = "7", description = "Reviews currently in queue.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pendingReviews")
  public Integer getPendingReviews() {
    return pendingReviews;
  }

  public void setPendingReviews(Integer pendingReviews) {
    this.pendingReviews = pendingReviews;
  }

  public WorkloadReportEngineerBreakdownInner reviewsCompleted(Integer reviewsCompleted) {
    this.reviewsCompleted = reviewsCompleted;
    return this;
  }

  /**
   * Get reviewsCompleted
   * @return reviewsCompleted
  */
  @NotNull   @Schema(name = "reviewsCompleted", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reviewsCompleted")
  public Integer getReviewsCompleted() {
    return reviewsCompleted;
  }

  public void setReviewsCompleted(Integer reviewsCompleted) {
    this.reviewsCompleted = reviewsCompleted;
  }

  public WorkloadReportEngineerBreakdownInner reviewsRequested(Integer reviewsRequested) {
    this.reviewsRequested = reviewsRequested;
    return this;
  }

  /**
   * Get reviewsRequested
   * @return reviewsRequested
  */
    @Schema(name = "reviewsRequested", example = "51", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reviewsRequested")
  public Integer getReviewsRequested() {
    return reviewsRequested;
  }

  public void setReviewsRequested(Integer reviewsRequested) {
    this.reviewsRequested = reviewsRequested;
  }

  public WorkloadReportEngineerBreakdownInner avgResponseTimeMinutes(Integer avgResponseTimeMinutes) {
    this.avgResponseTimeMinutes = avgResponseTimeMinutes;
    return this;
  }

  /**
   * Get avgResponseTimeMinutes
   * @return avgResponseTimeMinutes
  */
  @NotNull   @Schema(name = "avgResponseTimeMinutes", example = "180", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("avgResponseTimeMinutes")
  public Integer getAvgResponseTimeMinutes() {
    return avgResponseTimeMinutes;
  }

  public void setAvgResponseTimeMinutes(Integer avgResponseTimeMinutes) {
    this.avgResponseTimeMinutes = avgResponseTimeMinutes;
  }

  public WorkloadReportEngineerBreakdownInner medianResponseTimeMinutes(Integer medianResponseTimeMinutes) {
    this.medianResponseTimeMinutes = medianResponseTimeMinutes;
    return this;
  }

  /**
   * Get medianResponseTimeMinutes
   * @return medianResponseTimeMinutes
  */
    @Schema(name = "medianResponseTimeMinutes", example = "95", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("medianResponseTimeMinutes")
  public Integer getMedianResponseTimeMinutes() {
    return medianResponseTimeMinutes;
  }

  public void setMedianResponseTimeMinutes(Integer medianResponseTimeMinutes) {
    this.medianResponseTimeMinutes = medianResponseTimeMinutes;
  }

  public WorkloadReportEngineerBreakdownInner slaCompliancePercent(Double slaCompliancePercent) {
    this.slaCompliancePercent = slaCompliancePercent;
    return this;
  }

  /**
   * Get slaCompliancePercent
   * @return slaCompliancePercent
  */
    @Schema(name = "slaCompliancePercent", example = "82.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slaCompliancePercent")
  public Double getSlaCompliancePercent() {
    return slaCompliancePercent;
  }

  public void setSlaCompliancePercent(Double slaCompliancePercent) {
    this.slaCompliancePercent = slaCompliancePercent;
  }

  public WorkloadReportEngineerBreakdownInner approvalRatePercent(Double approvalRatePercent) {
    this.approvalRatePercent = approvalRatePercent;
    return this;
  }

  /**
   * Get approvalRatePercent
   * @return approvalRatePercent
  */
    @Schema(name = "approvalRatePercent", example = "88.4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvalRatePercent")
  public Double getApprovalRatePercent() {
    return approvalRatePercent;
  }

  public void setApprovalRatePercent(Double approvalRatePercent) {
    this.approvalRatePercent = approvalRatePercent;
  }

  public WorkloadReportEngineerBreakdownInner changesRequestedRatePercent(Double changesRequestedRatePercent) {
    this.changesRequestedRatePercent = changesRequestedRatePercent;
    return this;
  }

  /**
   * Get changesRequestedRatePercent
   * @return changesRequestedRatePercent
  */
    @Schema(name = "changesRequestedRatePercent", example = "22.1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changesRequestedRatePercent")
  public Double getChangesRequestedRatePercent() {
    return changesRequestedRatePercent;
  }

  public void setChangesRequestedRatePercent(Double changesRequestedRatePercent) {
    this.changesRequestedRatePercent = changesRequestedRatePercent;
  }

  public WorkloadReportEngineerBreakdownInner fairnessScore(BigDecimal fairnessScore) {
    this.fairnessScore = fairnessScore;
    return this;
  }

  /**
   * Higher = more reviews taken relative to team.
   * @return fairnessScore
  */
  @NotNull @Valid   @Schema(name = "fairnessScore", example = "92.5", description = "Higher = more reviews taken relative to team.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fairnessScore")
  public BigDecimal getFairnessScore() {
    return fairnessScore;
  }

  public void setFairnessScore(BigDecimal fairnessScore) {
    this.fairnessScore = fairnessScore;
  }

  public WorkloadReportEngineerBreakdownInner fairnessDelta(BigDecimal fairnessDelta) {
    this.fairnessDelta = fairnessDelta;
    return this;
  }

  /**
   * Difference from team average (+ = more reviews).
   * @return fairnessDelta
  */
  @Valid   @Schema(name = "fairnessDelta", example = "10.5", description = "Difference from team average (+ = more reviews).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fairnessDelta")
  public BigDecimal getFairnessDelta() {
    return fairnessDelta;
  }

  public void setFairnessDelta(BigDecimal fairnessDelta) {
    this.fairnessDelta = fairnessDelta;
  }

  public WorkloadReportEngineerBreakdownInner burnoutRisk(BurnoutRiskEnum burnoutRisk) {
    this.burnoutRisk = burnoutRisk;
    return this;
  }

  /**
   * Get burnoutRisk
   * @return burnoutRisk
  */
    @Schema(name = "burnoutRisk", example = "MEDIUM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("burnoutRisk")
  public BurnoutRiskEnum getBurnoutRisk() {
    return burnoutRisk;
  }

  public void setBurnoutRisk(BurnoutRiskEnum burnoutRisk) {
    this.burnoutRisk = burnoutRisk;
  }

  public WorkloadReportEngineerBreakdownInner expertiseAreas(List<String> expertiseAreas) {
    this.expertiseAreas = expertiseAreas;
    return this;
  }

  public WorkloadReportEngineerBreakdownInner addExpertiseAreasItem(String expertiseAreasItem) {
    if (this.expertiseAreas == null) {
      this.expertiseAreas = new ArrayList<>();
    }
    this.expertiseAreas.add(expertiseAreasItem);
    return this;
  }

  /**
   * Get expertiseAreas
   * @return expertiseAreas
  */
    @Schema(name = "expertiseAreas", example = "[\"payments\",\"discount-logic\",\"refunds\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expertiseAreas")
  public List<String> getExpertiseAreas() {
    return expertiseAreas;
  }

  public void setExpertiseAreas(List<String> expertiseAreas) {
    this.expertiseAreas = expertiseAreas;
  }

  public WorkloadReportEngineerBreakdownInner availability(AvailabilityEnum availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
  */
    @Schema(name = "availability", example = "AVAILABLE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availability")
  public AvailabilityEnum getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkloadReportEngineerBreakdownInner workloadReportEngineerBreakdownInner = (WorkloadReportEngineerBreakdownInner) o;
    return Objects.equals(this.engineerId, workloadReportEngineerBreakdownInner.engineerId) &&
        Objects.equals(this.name, workloadReportEngineerBreakdownInner.name) &&
        Objects.equals(this.seniority, workloadReportEngineerBreakdownInner.seniority) &&
        Objects.equals(this.pendingReviews, workloadReportEngineerBreakdownInner.pendingReviews) &&
        Objects.equals(this.reviewsCompleted, workloadReportEngineerBreakdownInner.reviewsCompleted) &&
        Objects.equals(this.reviewsRequested, workloadReportEngineerBreakdownInner.reviewsRequested) &&
        Objects.equals(this.avgResponseTimeMinutes, workloadReportEngineerBreakdownInner.avgResponseTimeMinutes) &&
        Objects.equals(this.medianResponseTimeMinutes, workloadReportEngineerBreakdownInner.medianResponseTimeMinutes) &&
        Objects.equals(this.slaCompliancePercent, workloadReportEngineerBreakdownInner.slaCompliancePercent) &&
        Objects.equals(this.approvalRatePercent, workloadReportEngineerBreakdownInner.approvalRatePercent) &&
        Objects.equals(this.changesRequestedRatePercent, workloadReportEngineerBreakdownInner.changesRequestedRatePercent) &&
        Objects.equals(this.fairnessScore, workloadReportEngineerBreakdownInner.fairnessScore) &&
        Objects.equals(this.fairnessDelta, workloadReportEngineerBreakdownInner.fairnessDelta) &&
        Objects.equals(this.burnoutRisk, workloadReportEngineerBreakdownInner.burnoutRisk) &&
        Objects.equals(this.expertiseAreas, workloadReportEngineerBreakdownInner.expertiseAreas) &&
        Objects.equals(this.availability, workloadReportEngineerBreakdownInner.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineerId, name, seniority, pendingReviews, reviewsCompleted, reviewsRequested, avgResponseTimeMinutes, medianResponseTimeMinutes, slaCompliancePercent, approvalRatePercent, changesRequestedRatePercent, fairnessScore, fairnessDelta, burnoutRisk, expertiseAreas, availability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadReportEngineerBreakdownInner {\n");
    sb.append("    engineerId: ").append(toIndentedString(engineerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seniority: ").append(toIndentedString(seniority)).append("\n");
    sb.append("    pendingReviews: ").append(toIndentedString(pendingReviews)).append("\n");
    sb.append("    reviewsCompleted: ").append(toIndentedString(reviewsCompleted)).append("\n");
    sb.append("    reviewsRequested: ").append(toIndentedString(reviewsRequested)).append("\n");
    sb.append("    avgResponseTimeMinutes: ").append(toIndentedString(avgResponseTimeMinutes)).append("\n");
    sb.append("    medianResponseTimeMinutes: ").append(toIndentedString(medianResponseTimeMinutes)).append("\n");
    sb.append("    slaCompliancePercent: ").append(toIndentedString(slaCompliancePercent)).append("\n");
    sb.append("    approvalRatePercent: ").append(toIndentedString(approvalRatePercent)).append("\n");
    sb.append("    changesRequestedRatePercent: ").append(toIndentedString(changesRequestedRatePercent)).append("\n");
    sb.append("    fairnessScore: ").append(toIndentedString(fairnessScore)).append("\n");
    sb.append("    fairnessDelta: ").append(toIndentedString(fairnessDelta)).append("\n");
    sb.append("    burnoutRisk: ").append(toIndentedString(burnoutRisk)).append("\n");
    sb.append("    expertiseAreas: ").append(toIndentedString(expertiseAreas)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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

