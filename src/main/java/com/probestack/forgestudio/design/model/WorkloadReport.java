package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.WorkloadReportBottleneckAnalysis;
import com.probestack.forgestudio.design.model.WorkloadReportEngineerBreakdownInner;
import com.probestack.forgestudio.design.model.WorkloadReportFairnessScore;
import com.probestack.forgestudio.design.model.WorkloadReportTeamSummary;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WorkloadReport
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T18:38:51.714426785Z[GMT]")public class WorkloadReport {

  private String teamName;

  private Integer windowDays;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime generatedAt;

  private WorkloadReportFairnessScore fairnessScore;

  private WorkloadReportTeamSummary teamSummary;

  @Valid
  private List<@Valid WorkloadReportEngineerBreakdownInner> engineerBreakdown = new ArrayList<>();

  private WorkloadReportBottleneckAnalysis bottleneckAnalysis;

  @Valid
  private List<String> recommendations = new ArrayList<>();

  public WorkloadReport() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkloadReport(String teamName, Integer windowDays, OffsetDateTime generatedAt, WorkloadReportFairnessScore fairnessScore, WorkloadReportTeamSummary teamSummary, List<@Valid WorkloadReportEngineerBreakdownInner> engineerBreakdown, List<String> recommendations) {
    this.teamName = teamName;
    this.windowDays = windowDays;
    this.generatedAt = generatedAt;
    this.fairnessScore = fairnessScore;
    this.teamSummary = teamSummary;
    this.engineerBreakdown = engineerBreakdown;
    this.recommendations = recommendations;
  }

  public WorkloadReport teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * Get teamName
   * @return teamName
  */
  @NotNull   @Schema(name = "teamName", example = "payments-team", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("teamName")
  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public WorkloadReport windowDays(Integer windowDays) {
    this.windowDays = windowDays;
    return this;
  }

  /**
   * Get windowDays
   * @return windowDays
  */
  @NotNull   @Schema(name = "windowDays", example = "30", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("windowDays")
  public Integer getWindowDays() {
    return windowDays;
  }

  public void setWindowDays(Integer windowDays) {
    this.windowDays = windowDays;
  }

  public WorkloadReport generatedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
    return this;
  }

  /**
   * Get generatedAt
   * @return generatedAt
  */
  @NotNull @Valid   @Schema(name = "generatedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generatedAt")
  public OffsetDateTime getGeneratedAt() {
    return generatedAt;
  }

  public void setGeneratedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
  }

  public WorkloadReport fairnessScore(WorkloadReportFairnessScore fairnessScore) {
    this.fairnessScore = fairnessScore;
    return this;
  }

  /**
   * Get fairnessScore
   * @return fairnessScore
  */
  @NotNull @Valid   @Schema(name = "fairnessScore", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fairnessScore")
  public WorkloadReportFairnessScore getFairnessScore() {
    return fairnessScore;
  }

  public void setFairnessScore(WorkloadReportFairnessScore fairnessScore) {
    this.fairnessScore = fairnessScore;
  }

  public WorkloadReport teamSummary(WorkloadReportTeamSummary teamSummary) {
    this.teamSummary = teamSummary;
    return this;
  }

  /**
   * Get teamSummary
   * @return teamSummary
  */
  @NotNull @Valid   @Schema(name = "teamSummary", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("teamSummary")
  public WorkloadReportTeamSummary getTeamSummary() {
    return teamSummary;
  }

  public void setTeamSummary(WorkloadReportTeamSummary teamSummary) {
    this.teamSummary = teamSummary;
  }

  public WorkloadReport engineerBreakdown(List<@Valid WorkloadReportEngineerBreakdownInner> engineerBreakdown) {
    this.engineerBreakdown = engineerBreakdown;
    return this;
  }

  public WorkloadReport addEngineerBreakdownItem(WorkloadReportEngineerBreakdownInner engineerBreakdownItem) {
    if (this.engineerBreakdown == null) {
      this.engineerBreakdown = new ArrayList<>();
    }
    this.engineerBreakdown.add(engineerBreakdownItem);
    return this;
  }

  /**
   * Get engineerBreakdown
   * @return engineerBreakdown
  */
  @NotNull @Valid   @Schema(name = "engineerBreakdown", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("engineerBreakdown")
  public List<@Valid WorkloadReportEngineerBreakdownInner> getEngineerBreakdown() {
    return engineerBreakdown;
  }

  public void setEngineerBreakdown(List<@Valid WorkloadReportEngineerBreakdownInner> engineerBreakdown) {
    this.engineerBreakdown = engineerBreakdown;
  }

  public WorkloadReport bottleneckAnalysis(WorkloadReportBottleneckAnalysis bottleneckAnalysis) {
    this.bottleneckAnalysis = bottleneckAnalysis;
    return this;
  }

  /**
   * Get bottleneckAnalysis
   * @return bottleneckAnalysis
  */
  @Valid   @Schema(name = "bottleneckAnalysis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bottleneckAnalysis")
  public WorkloadReportBottleneckAnalysis getBottleneckAnalysis() {
    return bottleneckAnalysis;
  }

  public void setBottleneckAnalysis(WorkloadReportBottleneckAnalysis bottleneckAnalysis) {
    this.bottleneckAnalysis = bottleneckAnalysis;
  }

  public WorkloadReport recommendations(List<String> recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  public WorkloadReport addRecommendationsItem(String recommendationsItem) {
    if (this.recommendations == null) {
      this.recommendations = new ArrayList<>();
    }
    this.recommendations.add(recommendationsItem);
    return this;
  }

  /**
   * Get recommendations
   * @return recommendations
  */
  @NotNull   @Schema(name = "recommendations", example = "[\"Amit has 7 pending reviews vs team avg of 4 — pause new assignments for 48h.\",\"Priya's SLA compliance dropped to 82% — consider rebalancing her queue.\",\"3 junior engineers have taken <10 reviews in 30 days — assign more for growth.\",\"Average time to first review is 4h — consider enabling 'review hours' blocks.\"]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommendations")
  public List<String> getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(List<String> recommendations) {
    this.recommendations = recommendations;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkloadReport workloadReport = (WorkloadReport) o;
    return Objects.equals(this.teamName, workloadReport.teamName) &&
        Objects.equals(this.windowDays, workloadReport.windowDays) &&
        Objects.equals(this.generatedAt, workloadReport.generatedAt) &&
        Objects.equals(this.fairnessScore, workloadReport.fairnessScore) &&
        Objects.equals(this.teamSummary, workloadReport.teamSummary) &&
        Objects.equals(this.engineerBreakdown, workloadReport.engineerBreakdown) &&
        Objects.equals(this.bottleneckAnalysis, workloadReport.bottleneckAnalysis) &&
        Objects.equals(this.recommendations, workloadReport.recommendations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamName, windowDays, generatedAt, fairnessScore, teamSummary, engineerBreakdown, bottleneckAnalysis, recommendations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadReport {\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    windowDays: ").append(toIndentedString(windowDays)).append("\n");
    sb.append("    generatedAt: ").append(toIndentedString(generatedAt)).append("\n");
    sb.append("    fairnessScore: ").append(toIndentedString(fairnessScore)).append("\n");
    sb.append("    teamSummary: ").append(toIndentedString(teamSummary)).append("\n");
    sb.append("    engineerBreakdown: ").append(toIndentedString(engineerBreakdown)).append("\n");
    sb.append("    bottleneckAnalysis: ").append(toIndentedString(bottleneckAnalysis)).append("\n");
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
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

