package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AssignReviewersRequestFilesChangedInner
 */
@JsonTypeName("assignReviewers_request_filesChanged_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T18:38:51.714426785Z[GMT]")public class AssignReviewersRequestFilesChangedInner {

  private String path;

  private Integer linesAdded;

  private Integer linesRemoved;

  public AssignReviewersRequestFilesChangedInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AssignReviewersRequestFilesChangedInner(String path, Integer linesAdded, Integer linesRemoved) {
    this.path = path;
    this.linesAdded = linesAdded;
    this.linesRemoved = linesRemoved;
  }

  public AssignReviewersRequestFilesChangedInner path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  @NotNull   @Schema(name = "path", example = "src/main/java/com/forgesphere/payment/DiscountService.java", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public AssignReviewersRequestFilesChangedInner linesAdded(Integer linesAdded) {
    this.linesAdded = linesAdded;
    return this;
  }

  /**
   * Get linesAdded
   * @return linesAdded
  */
  @NotNull   @Schema(name = "linesAdded", example = "145", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("linesAdded")
  public Integer getLinesAdded() {
    return linesAdded;
  }

  public void setLinesAdded(Integer linesAdded) {
    this.linesAdded = linesAdded;
  }

  public AssignReviewersRequestFilesChangedInner linesRemoved(Integer linesRemoved) {
    this.linesRemoved = linesRemoved;
    return this;
  }

  /**
   * Get linesRemoved
   * @return linesRemoved
  */
  @NotNull   @Schema(name = "linesRemoved", example = "32", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("linesRemoved")
  public Integer getLinesRemoved() {
    return linesRemoved;
  }

  public void setLinesRemoved(Integer linesRemoved) {
    this.linesRemoved = linesRemoved;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignReviewersRequestFilesChangedInner assignReviewersRequestFilesChangedInner = (AssignReviewersRequestFilesChangedInner) o;
    return Objects.equals(this.path, assignReviewersRequestFilesChangedInner.path) &&
        Objects.equals(this.linesAdded, assignReviewersRequestFilesChangedInner.linesAdded) &&
        Objects.equals(this.linesRemoved, assignReviewersRequestFilesChangedInner.linesRemoved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, linesAdded, linesRemoved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignReviewersRequestFilesChangedInner {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    linesAdded: ").append(toIndentedString(linesAdded)).append("\n");
    sb.append("    linesRemoved: ").append(toIndentedString(linesRemoved)).append("\n");
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

