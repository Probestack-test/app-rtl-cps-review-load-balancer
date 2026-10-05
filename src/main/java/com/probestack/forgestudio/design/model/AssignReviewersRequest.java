package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.AssignReviewersRequestFilesChangedInner;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AssignReviewersRequest
 */
@JsonTypeName("assignReviewers_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T18:38:51.714426785Z[GMT]")public class AssignReviewersRequest {

  private String repoId;

  private Integer pullRequestId;

  private String author;

  @Valid
  private List<@Valid AssignReviewersRequestFilesChangedInner> filesChanged = new ArrayList<>();

  private Integer requiredReviewerCount = 2;

  /**
   * PR urgency — affects assignment speed.
   */
  public enum PriorityEnum {
    LOW("LOW"),
    
    NORMAL("NORMAL"),
    
    HIGH("HIGH"),
    
    URGENT("URGENT");

    private String value;

    PriorityEnum(String value) {
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
    public static PriorityEnum fromValue(String value) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private PriorityEnum priority = PriorityEnum.NORMAL;

  @Valid
  private List<String> requiredExpertise;

  @Valid
  private List<String> excludeReviewers;

  public AssignReviewersRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AssignReviewersRequest(String repoId, Integer pullRequestId, String author, List<@Valid AssignReviewersRequestFilesChangedInner> filesChanged) {
    this.repoId = repoId;
    this.pullRequestId = pullRequestId;
    this.author = author;
    this.filesChanged = filesChanged;
  }

  public AssignReviewersRequest repoId(String repoId) {
    this.repoId = repoId;
    return this;
  }

  /**
   * Repository containing the PR.
   * @return repoId
  */
  @NotNull   @Schema(name = "repoId", example = "forgesphere/payment-service", description = "Repository containing the PR.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("repoId")
  public String getRepoId() {
    return repoId;
  }

  public void setRepoId(String repoId) {
    this.repoId = repoId;
  }

  public AssignReviewersRequest pullRequestId(Integer pullRequestId) {
    this.pullRequestId = pullRequestId;
    return this;
  }

  /**
   * Pull request number.
   * @return pullRequestId
  */
  @NotNull   @Schema(name = "pullRequestId", example = "4821", description = "Pull request number.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pullRequestId")
  public Integer getPullRequestId() {
    return pullRequestId;
  }

  public void setPullRequestId(Integer pullRequestId) {
    this.pullRequestId = pullRequestId;
  }

  public AssignReviewersRequest author(String author) {
    this.author = author;
    return this;
  }

  /**
   * PR author (excluded from reviewers).
   * @return author
  */
  @NotNull   @Schema(name = "author", example = "amit.kumar@forgesphere.example.com", description = "PR author (excluded from reviewers).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public AssignReviewersRequest filesChanged(List<@Valid AssignReviewersRequestFilesChangedInner> filesChanged) {
    this.filesChanged = filesChanged;
    return this;
  }

  public AssignReviewersRequest addFilesChangedItem(AssignReviewersRequestFilesChangedInner filesChangedItem) {
    if (this.filesChanged == null) {
      this.filesChanged = new ArrayList<>();
    }
    this.filesChanged.add(filesChangedItem);
    return this;
  }

  /**
   * List of changed files with complexity.
   * @return filesChanged
  */
  @NotNull @Valid   @Schema(name = "filesChanged", description = "List of changed files with complexity.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("filesChanged")
  public List<@Valid AssignReviewersRequestFilesChangedInner> getFilesChanged() {
    return filesChanged;
  }

  public void setFilesChanged(List<@Valid AssignReviewersRequestFilesChangedInner> filesChanged) {
    this.filesChanged = filesChanged;
  }

  public AssignReviewersRequest requiredReviewerCount(Integer requiredReviewerCount) {
    this.requiredReviewerCount = requiredReviewerCount;
    return this;
  }

  /**
   * How many reviewers needed.
   * minimum: 1
   * maximum: 5
   * @return requiredReviewerCount
  */
  @Min(1) @Max(5)   @Schema(name = "requiredReviewerCount", example = "2", description = "How many reviewers needed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requiredReviewerCount")
  public Integer getRequiredReviewerCount() {
    return requiredReviewerCount;
  }

  public void setRequiredReviewerCount(Integer requiredReviewerCount) {
    this.requiredReviewerCount = requiredReviewerCount;
  }

  public AssignReviewersRequest priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

  /**
   * PR urgency — affects assignment speed.
   * @return priority
  */
    @Schema(name = "priority", example = "HIGH", description = "PR urgency — affects assignment speed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public PriorityEnum getPriority() {
    return priority;
  }

  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  public AssignReviewersRequest requiredExpertise(List<String> requiredExpertise) {
    this.requiredExpertise = requiredExpertise;
    return this;
  }

  public AssignReviewersRequest addRequiredExpertiseItem(String requiredExpertiseItem) {
    if (this.requiredExpertise == null) {
      this.requiredExpertise = new ArrayList<>();
    }
    this.requiredExpertise.add(requiredExpertiseItem);
    return this;
  }

  /**
   * Optional. Required domain knowledge.
   * @return requiredExpertise
  */
    @Schema(name = "requiredExpertise", example = "[\"payments\",\"discount-logic\"]", description = "Optional. Required domain knowledge.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requiredExpertise")
  public List<String> getRequiredExpertise() {
    return requiredExpertise;
  }

  public void setRequiredExpertise(List<String> requiredExpertise) {
    this.requiredExpertise = requiredExpertise;
  }

  public AssignReviewersRequest excludeReviewers(List<String> excludeReviewers) {
    this.excludeReviewers = excludeReviewers;
    return this;
  }

  public AssignReviewersRequest addExcludeReviewersItem(String excludeReviewersItem) {
    if (this.excludeReviewers == null) {
      this.excludeReviewers = new ArrayList<>();
    }
    this.excludeReviewers.add(excludeReviewersItem);
    return this;
  }

  /**
   * Reviewers to explicitly exclude.
   * @return excludeReviewers
  */
    @Schema(name = "excludeReviewers", example = "[\"rahul.verma@forgesphere.example.com\"]", description = "Reviewers to explicitly exclude.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excludeReviewers")
  public List<String> getExcludeReviewers() {
    return excludeReviewers;
  }

  public void setExcludeReviewers(List<String> excludeReviewers) {
    this.excludeReviewers = excludeReviewers;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignReviewersRequest assignReviewersRequest = (AssignReviewersRequest) o;
    return Objects.equals(this.repoId, assignReviewersRequest.repoId) &&
        Objects.equals(this.pullRequestId, assignReviewersRequest.pullRequestId) &&
        Objects.equals(this.author, assignReviewersRequest.author) &&
        Objects.equals(this.filesChanged, assignReviewersRequest.filesChanged) &&
        Objects.equals(this.requiredReviewerCount, assignReviewersRequest.requiredReviewerCount) &&
        Objects.equals(this.priority, assignReviewersRequest.priority) &&
        Objects.equals(this.requiredExpertise, assignReviewersRequest.requiredExpertise) &&
        Objects.equals(this.excludeReviewers, assignReviewersRequest.excludeReviewers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoId, pullRequestId, author, filesChanged, requiredReviewerCount, priority, requiredExpertise, excludeReviewers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignReviewersRequest {\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
    sb.append("    pullRequestId: ").append(toIndentedString(pullRequestId)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    filesChanged: ").append(toIndentedString(filesChanged)).append("\n");
    sb.append("    requiredReviewerCount: ").append(toIndentedString(requiredReviewerCount)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requiredExpertise: ").append(toIndentedString(requiredExpertise)).append("\n");
    sb.append("    excludeReviewers: ").append(toIndentedString(excludeReviewers)).append("\n");
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

