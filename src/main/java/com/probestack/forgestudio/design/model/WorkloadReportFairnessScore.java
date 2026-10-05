package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WorkloadReportFairnessScore
 */
@JsonTypeName("WorkloadReport_fairnessScore")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T18:38:51.714426785Z[GMT]")public class WorkloadReportFairnessScore {

  private BigDecimal overall;

  /**
   * Gets or Sets grade
   */
  public enum GradeEnum {
    EXCELLENT("EXCELLENT"),
    
    GOOD("GOOD"),
    
    FAIR("FAIR"),
    
    UNFAIR("UNFAIR"),
    
    CRITICAL("CRITICAL");

    private String value;

    GradeEnum(String value) {
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
    public static GradeEnum fromValue(String value) {
      for (GradeEnum b : GradeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private GradeEnum grade;

  private BigDecimal standardDeviation;

  public WorkloadReportFairnessScore() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkloadReportFairnessScore(BigDecimal overall, GradeEnum grade) {
    this.overall = overall;
    this.grade = grade;
  }

  public WorkloadReportFairnessScore overall(BigDecimal overall) {
    this.overall = overall;
    return this;
  }

  /**
   * 100 = perfectly balanced review load.
   * minimum: 0
   * maximum: 100
   * @return overall
  */
  @NotNull @Valid @DecimalMin("0") @DecimalMax("100")   @Schema(name = "overall", example = "82", description = "100 = perfectly balanced review load.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("overall")
  public BigDecimal getOverall() {
    return overall;
  }

  public void setOverall(BigDecimal overall) {
    this.overall = overall;
  }

  public WorkloadReportFairnessScore grade(GradeEnum grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Get grade
   * @return grade
  */
  @NotNull   @Schema(name = "grade", example = "GOOD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("grade")
  public GradeEnum getGrade() {
    return grade;
  }

  public void setGrade(GradeEnum grade) {
    this.grade = grade;
  }

  public WorkloadReportFairnessScore standardDeviation(BigDecimal standardDeviation) {
    this.standardDeviation = standardDeviation;
    return this;
  }

  /**
   * Lower is better.
   * @return standardDeviation
  */
  @Valid   @Schema(name = "standardDeviation", example = "3.8", description = "Lower is better.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("standardDeviation")
  public BigDecimal getStandardDeviation() {
    return standardDeviation;
  }

  public void setStandardDeviation(BigDecimal standardDeviation) {
    this.standardDeviation = standardDeviation;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkloadReportFairnessScore workloadReportFairnessScore = (WorkloadReportFairnessScore) o;
    return Objects.equals(this.overall, workloadReportFairnessScore.overall) &&
        Objects.equals(this.grade, workloadReportFairnessScore.grade) &&
        Objects.equals(this.standardDeviation, workloadReportFairnessScore.standardDeviation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overall, grade, standardDeviation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadReportFairnessScore {\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    standardDeviation: ").append(toIndentedString(standardDeviation)).append("\n");
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

