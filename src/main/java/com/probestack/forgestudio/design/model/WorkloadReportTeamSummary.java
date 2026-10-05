package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WorkloadReportTeamSummary
 */
@JsonTypeName("WorkloadReport_teamSummary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T18:38:51.714426785Z[GMT]")public class WorkloadReportTeamSummary {

  private Integer totalPRs;

  private Integer totalReviews;

  private Integer avgResponseTimeMinutes;

  private Double avgTimeToMergeHours;

  private Double slaCompliancePercent;

  private Double reviewsPerEngineer;

  public WorkloadReportTeamSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkloadReportTeamSummary(Integer totalPRs, Integer totalReviews, Integer avgResponseTimeMinutes, Double slaCompliancePercent) {
    this.totalPRs = totalPRs;
    this.totalReviews = totalReviews;
    this.avgResponseTimeMinutes = avgResponseTimeMinutes;
    this.slaCompliancePercent = slaCompliancePercent;
  }

  public WorkloadReportTeamSummary totalPRs(Integer totalPRs) {
    this.totalPRs = totalPRs;
    return this;
  }

  /**
   * Get totalPRs
   * @return totalPRs
  */
  @NotNull   @Schema(name = "totalPRs", example = "245", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPRs")
  public Integer getTotalPRs() {
    return totalPRs;
  }

  public void setTotalPRs(Integer totalPRs) {
    this.totalPRs = totalPRs;
  }

  public WorkloadReportTeamSummary totalReviews(Integer totalReviews) {
    this.totalReviews = totalReviews;
    return this;
  }

  /**
   * Get totalReviews
   * @return totalReviews
  */
  @NotNull   @Schema(name = "totalReviews", example = "482", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalReviews")
  public Integer getTotalReviews() {
    return totalReviews;
  }

  public void setTotalReviews(Integer totalReviews) {
    this.totalReviews = totalReviews;
  }

  public WorkloadReportTeamSummary avgResponseTimeMinutes(Integer avgResponseTimeMinutes) {
    this.avgResponseTimeMinutes = avgResponseTimeMinutes;
    return this;
  }

  /**
   * Get avgResponseTimeMinutes
   * @return avgResponseTimeMinutes
  */
  @NotNull   @Schema(name = "avgResponseTimeMinutes", example = "145", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("avgResponseTimeMinutes")
  public Integer getAvgResponseTimeMinutes() {
    return avgResponseTimeMinutes;
  }

  public void setAvgResponseTimeMinutes(Integer avgResponseTimeMinutes) {
    this.avgResponseTimeMinutes = avgResponseTimeMinutes;
  }

  public WorkloadReportTeamSummary avgTimeToMergeHours(Double avgTimeToMergeHours) {
    this.avgTimeToMergeHours = avgTimeToMergeHours;
    return this;
  }

  /**
   * Get avgTimeToMergeHours
   * @return avgTimeToMergeHours
  */
    @Schema(name = "avgTimeToMergeHours", example = "18.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avgTimeToMergeHours")
  public Double getAvgTimeToMergeHours() {
    return avgTimeToMergeHours;
  }

  public void setAvgTimeToMergeHours(Double avgTimeToMergeHours) {
    this.avgTimeToMergeHours = avgTimeToMergeHours;
  }

  public WorkloadReportTeamSummary slaCompliancePercent(Double slaCompliancePercent) {
    this.slaCompliancePercent = slaCompliancePercent;
    return this;
  }

  /**
   * Get slaCompliancePercent
   * @return slaCompliancePercent
  */
  @NotNull   @Schema(name = "slaCompliancePercent", example = "91.2", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("slaCompliancePercent")
  public Double getSlaCompliancePercent() {
    return slaCompliancePercent;
  }

  public void setSlaCompliancePercent(Double slaCompliancePercent) {
    this.slaCompliancePercent = slaCompliancePercent;
  }

  public WorkloadReportTeamSummary reviewsPerEngineer(Double reviewsPerEngineer) {
    this.reviewsPerEngineer = reviewsPerEngineer;
    return this;
  }

  /**
   * Get reviewsPerEngineer
   * @return reviewsPerEngineer
  */
    @Schema(name = "reviewsPerEngineer", example = "40.2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reviewsPerEngineer")
  public Double getReviewsPerEngineer() {
    return reviewsPerEngineer;
  }

  public void setReviewsPerEngineer(Double reviewsPerEngineer) {
    this.reviewsPerEngineer = reviewsPerEngineer;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkloadReportTeamSummary workloadReportTeamSummary = (WorkloadReportTeamSummary) o;
    return Objects.equals(this.totalPRs, workloadReportTeamSummary.totalPRs) &&
        Objects.equals(this.totalReviews, workloadReportTeamSummary.totalReviews) &&
        Objects.equals(this.avgResponseTimeMinutes, workloadReportTeamSummary.avgResponseTimeMinutes) &&
        Objects.equals(this.avgTimeToMergeHours, workloadReportTeamSummary.avgTimeToMergeHours) &&
        Objects.equals(this.slaCompliancePercent, workloadReportTeamSummary.slaCompliancePercent) &&
        Objects.equals(this.reviewsPerEngineer, workloadReportTeamSummary.reviewsPerEngineer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPRs, totalReviews, avgResponseTimeMinutes, avgTimeToMergeHours, slaCompliancePercent, reviewsPerEngineer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadReportTeamSummary {\n");
    sb.append("    totalPRs: ").append(toIndentedString(totalPRs)).append("\n");
    sb.append("    totalReviews: ").append(toIndentedString(totalReviews)).append("\n");
    sb.append("    avgResponseTimeMinutes: ").append(toIndentedString(avgResponseTimeMinutes)).append("\n");
    sb.append("    avgTimeToMergeHours: ").append(toIndentedString(avgTimeToMergeHours)).append("\n");
    sb.append("    slaCompliancePercent: ").append(toIndentedString(slaCompliancePercent)).append("\n");
    sb.append("    reviewsPerEngineer: ").append(toIndentedString(reviewsPerEngineer)).append("\n");
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

