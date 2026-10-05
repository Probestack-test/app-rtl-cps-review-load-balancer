package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Where reviews are getting stuck.
 */
@Schema(name = "WorkloadReport_bottleneckAnalysis", description = "Where reviews are getting stuck.")
@JsonTypeName("WorkloadReport_bottleneckAnalysis")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T18:38:51.714426785Z[GMT]")public class WorkloadReportBottleneckAnalysis {

  @Valid
  private List<String> slowestReviewers;

  private Integer mostBlockedPRs;

  private Integer avgWaitTimeForFirstReviewMinutes;

  @Valid
  private List<String> reviewersAtCapacity;

  public WorkloadReportBottleneckAnalysis slowestReviewers(List<String> slowestReviewers) {
    this.slowestReviewers = slowestReviewers;
    return this;
  }

  public WorkloadReportBottleneckAnalysis addSlowestReviewersItem(String slowestReviewersItem) {
    if (this.slowestReviewers == null) {
      this.slowestReviewers = new ArrayList<>();
    }
    this.slowestReviewers.add(slowestReviewersItem);
    return this;
  }

  /**
   * Get slowestReviewers
   * @return slowestReviewers
  */
    @Schema(name = "slowestReviewers", example = "[\"rahul.verma@forgesphere.example.com\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slowestReviewers")
  public List<String> getSlowestReviewers() {
    return slowestReviewers;
  }

  public void setSlowestReviewers(List<String> slowestReviewers) {
    this.slowestReviewers = slowestReviewers;
  }

  public WorkloadReportBottleneckAnalysis mostBlockedPRs(Integer mostBlockedPRs) {
    this.mostBlockedPRs = mostBlockedPRs;
    return this;
  }

  /**
   * Get mostBlockedPRs
   * @return mostBlockedPRs
  */
    @Schema(name = "mostBlockedPRs", example = "8", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mostBlockedPRs")
  public Integer getMostBlockedPRs() {
    return mostBlockedPRs;
  }

  public void setMostBlockedPRs(Integer mostBlockedPRs) {
    this.mostBlockedPRs = mostBlockedPRs;
  }

  public WorkloadReportBottleneckAnalysis avgWaitTimeForFirstReviewMinutes(Integer avgWaitTimeForFirstReviewMinutes) {
    this.avgWaitTimeForFirstReviewMinutes = avgWaitTimeForFirstReviewMinutes;
    return this;
  }

  /**
   * Get avgWaitTimeForFirstReviewMinutes
   * @return avgWaitTimeForFirstReviewMinutes
  */
    @Schema(name = "avgWaitTimeForFirstReviewMinutes", example = "240", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avgWaitTimeForFirstReviewMinutes")
  public Integer getAvgWaitTimeForFirstReviewMinutes() {
    return avgWaitTimeForFirstReviewMinutes;
  }

  public void setAvgWaitTimeForFirstReviewMinutes(Integer avgWaitTimeForFirstReviewMinutes) {
    this.avgWaitTimeForFirstReviewMinutes = avgWaitTimeForFirstReviewMinutes;
  }

  public WorkloadReportBottleneckAnalysis reviewersAtCapacity(List<String> reviewersAtCapacity) {
    this.reviewersAtCapacity = reviewersAtCapacity;
    return this;
  }

  public WorkloadReportBottleneckAnalysis addReviewersAtCapacityItem(String reviewersAtCapacityItem) {
    if (this.reviewersAtCapacity == null) {
      this.reviewersAtCapacity = new ArrayList<>();
    }
    this.reviewersAtCapacity.add(reviewersAtCapacityItem);
    return this;
  }

  /**
   * Get reviewersAtCapacity
   * @return reviewersAtCapacity
  */
    @Schema(name = "reviewersAtCapacity", example = "[\"amit.kumar@forgesphere.example.com\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reviewersAtCapacity")
  public List<String> getReviewersAtCapacity() {
    return reviewersAtCapacity;
  }

  public void setReviewersAtCapacity(List<String> reviewersAtCapacity) {
    this.reviewersAtCapacity = reviewersAtCapacity;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkloadReportBottleneckAnalysis workloadReportBottleneckAnalysis = (WorkloadReportBottleneckAnalysis) o;
    return Objects.equals(this.slowestReviewers, workloadReportBottleneckAnalysis.slowestReviewers) &&
        Objects.equals(this.mostBlockedPRs, workloadReportBottleneckAnalysis.mostBlockedPRs) &&
        Objects.equals(this.avgWaitTimeForFirstReviewMinutes, workloadReportBottleneckAnalysis.avgWaitTimeForFirstReviewMinutes) &&
        Objects.equals(this.reviewersAtCapacity, workloadReportBottleneckAnalysis.reviewersAtCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slowestReviewers, mostBlockedPRs, avgWaitTimeForFirstReviewMinutes, reviewersAtCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadReportBottleneckAnalysis {\n");
    sb.append("    slowestReviewers: ").append(toIndentedString(slowestReviewers)).append("\n");
    sb.append("    mostBlockedPRs: ").append(toIndentedString(mostBlockedPRs)).append("\n");
    sb.append("    avgWaitTimeForFirstReviewMinutes: ").append(toIndentedString(avgWaitTimeForFirstReviewMinutes)).append("\n");
    sb.append("    reviewersAtCapacity: ").append(toIndentedString(reviewersAtCapacity)).append("\n");
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

