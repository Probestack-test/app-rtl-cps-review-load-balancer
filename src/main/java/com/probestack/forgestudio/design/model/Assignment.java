package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.AssignmentFilesChangedInner;
import com.probestack.forgestudio.design.model.AssignmentReviewersInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Assignment
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-05T18:38:51.714426785Z[GMT]")public class Assignment {

  private UUID assignmentId;

  private String repoId;

  private Integer pullRequestId;

  private String pullRequestUrl;

  private String author;

  @Valid
  private List<@Valid AssignmentReviewersInner> reviewers = new ArrayList<>();

  private Integer requiredReviewerCount;

  /**
   * Gets or Sets priority
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
  private PriorityEnum priority;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OPEN("OPEN"),
    
    PARTIALLY_REVIEWED("PARTIALLY_REVIEWED"),
    
    FULLY_REVIEWED("FULLY_REVIEWED"),
    
    MERGED("MERGED"),
    
    CLOSED("CLOSED");

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
  private OffsetDateTime slaDeadline;

  /**
   * Gets or Sets slaStatus
   */
  public enum SlaStatusEnum {
    ON_TRACK("ON_TRACK"),
    
    AT_RISK("AT_RISK"),
    
    BREACHED("BREACHED");

    private String value;

    SlaStatusEnum(String value) {
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
    public static SlaStatusEnum fromValue(String value) {
      for (SlaStatusEnum b : SlaStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SlaStatusEnum slaStatus;

  @Valid
  private List<@Valid AssignmentFilesChangedInner> filesChanged;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime assignedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime firstReviewAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime completedAt;

  private Integer totalReviewTimeMinutes;

  public Assignment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Assignment(UUID assignmentId, String repoId, Integer pullRequestId, String author, List<@Valid AssignmentReviewersInner> reviewers, PriorityEnum priority, StatusEnum status, OffsetDateTime assignedAt) {
    this.assignmentId = assignmentId;
    this.repoId = repoId;
    this.pullRequestId = pullRequestId;
    this.author = author;
    this.reviewers = reviewers;
    this.priority = priority;
    this.status = status;
    this.assignedAt = assignedAt;
  }

  public Assignment assignmentId(UUID assignmentId) {
    this.assignmentId = assignmentId;
    return this;
  }

  /**
   * Get assignmentId
   * @return assignmentId
  */
  @NotNull @Valid   @Schema(name = "assignmentId", example = "9c8f1a3b-6d7e-4a12-8f5e-123456789abc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignmentId")
  public UUID getAssignmentId() {
    return assignmentId;
  }

  public void setAssignmentId(UUID assignmentId) {
    this.assignmentId = assignmentId;
  }

  public Assignment repoId(String repoId) {
    this.repoId = repoId;
    return this;
  }

  /**
   * Get repoId
   * @return repoId
  */
  @NotNull   @Schema(name = "repoId", example = "forgesphere/payment-service", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("repoId")
  public String getRepoId() {
    return repoId;
  }

  public void setRepoId(String repoId) {
    this.repoId = repoId;
  }

  public Assignment pullRequestId(Integer pullRequestId) {
    this.pullRequestId = pullRequestId;
    return this;
  }

  /**
   * Get pullRequestId
   * @return pullRequestId
  */
  @NotNull   @Schema(name = "pullRequestId", example = "4821", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pullRequestId")
  public Integer getPullRequestId() {
    return pullRequestId;
  }

  public void setPullRequestId(Integer pullRequestId) {
    this.pullRequestId = pullRequestId;
  }

  public Assignment pullRequestUrl(String pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
    return this;
  }

  /**
   * Get pullRequestUrl
   * @return pullRequestUrl
  */
    @Schema(name = "pullRequestUrl", example = "https://github.com/forgesphere/payment-service/pull/4821", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pullRequestUrl")
  public String getPullRequestUrl() {
    return pullRequestUrl;
  }

  public void setPullRequestUrl(String pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
  }

  public Assignment author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @NotNull   @Schema(name = "author", example = "amit.kumar@forgesphere.example.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Assignment reviewers(List<@Valid AssignmentReviewersInner> reviewers) {
    this.reviewers = reviewers;
    return this;
  }

  public Assignment addReviewersItem(AssignmentReviewersInner reviewersItem) {
    if (this.reviewers == null) {
      this.reviewers = new ArrayList<>();
    }
    this.reviewers.add(reviewersItem);
    return this;
  }

  /**
   * Assigned reviewers with reasoning.
   * @return reviewers
  */
  @NotNull @Valid   @Schema(name = "reviewers", description = "Assigned reviewers with reasoning.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reviewers")
  public List<@Valid AssignmentReviewersInner> getReviewers() {
    return reviewers;
  }

  public void setReviewers(List<@Valid AssignmentReviewersInner> reviewers) {
    this.reviewers = reviewers;
  }

  public Assignment requiredReviewerCount(Integer requiredReviewerCount) {
    this.requiredReviewerCount = requiredReviewerCount;
    return this;
  }

  /**
   * Get requiredReviewerCount
   * @return requiredReviewerCount
  */
    @Schema(name = "requiredReviewerCount", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requiredReviewerCount")
  public Integer getRequiredReviewerCount() {
    return requiredReviewerCount;
  }

  public void setRequiredReviewerCount(Integer requiredReviewerCount) {
    this.requiredReviewerCount = requiredReviewerCount;
  }

  public Assignment priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  */
  @NotNull   @Schema(name = "priority", example = "HIGH", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("priority")
  public PriorityEnum getPriority() {
    return priority;
  }

  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  public Assignment status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "PARTIALLY_REVIEWED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Assignment slaDeadline(OffsetDateTime slaDeadline) {
    this.slaDeadline = slaDeadline;
    return this;
  }

  /**
   * When the review should be completed by.
   * @return slaDeadline
  */
  @Valid   @Schema(name = "slaDeadline", example = "2026-10-06T18:00Z", description = "When the review should be completed by.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slaDeadline")
  public OffsetDateTime getSlaDeadline() {
    return slaDeadline;
  }

  public void setSlaDeadline(OffsetDateTime slaDeadline) {
    this.slaDeadline = slaDeadline;
  }

  public Assignment slaStatus(SlaStatusEnum slaStatus) {
    this.slaStatus = slaStatus;
    return this;
  }

  /**
   * Get slaStatus
   * @return slaStatus
  */
    @Schema(name = "slaStatus", example = "ON_TRACK", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slaStatus")
  public SlaStatusEnum getSlaStatus() {
    return slaStatus;
  }

  public void setSlaStatus(SlaStatusEnum slaStatus) {
    this.slaStatus = slaStatus;
  }

  public Assignment filesChanged(List<@Valid AssignmentFilesChangedInner> filesChanged) {
    this.filesChanged = filesChanged;
    return this;
  }

  public Assignment addFilesChangedItem(AssignmentFilesChangedInner filesChangedItem) {
    if (this.filesChanged == null) {
      this.filesChanged = new ArrayList<>();
    }
    this.filesChanged.add(filesChangedItem);
    return this;
  }

  /**
   * Get filesChanged
   * @return filesChanged
  */
  @Valid   @Schema(name = "filesChanged", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filesChanged")
  public List<@Valid AssignmentFilesChangedInner> getFilesChanged() {
    return filesChanged;
  }

  public void setFilesChanged(List<@Valid AssignmentFilesChangedInner> filesChanged) {
    this.filesChanged = filesChanged;
  }

  public Assignment assignedAt(OffsetDateTime assignedAt) {
    this.assignedAt = assignedAt;
    return this;
  }

  /**
   * Get assignedAt
   * @return assignedAt
  */
  @NotNull @Valid   @Schema(name = "assignedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignedAt")
  public OffsetDateTime getAssignedAt() {
    return assignedAt;
  }

  public void setAssignedAt(OffsetDateTime assignedAt) {
    this.assignedAt = assignedAt;
  }

  public Assignment firstReviewAt(OffsetDateTime firstReviewAt) {
    this.firstReviewAt = firstReviewAt;
    return this;
  }

  /**
   * Get firstReviewAt
   * @return firstReviewAt
  */
  @Valid   @Schema(name = "firstReviewAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstReviewAt")
  public OffsetDateTime getFirstReviewAt() {
    return firstReviewAt;
  }

  public void setFirstReviewAt(OffsetDateTime firstReviewAt) {
    this.firstReviewAt = firstReviewAt;
  }

  public Assignment completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Get completedAt
   * @return completedAt
  */
  @Valid   @Schema(name = "completedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedAt")
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public Assignment totalReviewTimeMinutes(Integer totalReviewTimeMinutes) {
    this.totalReviewTimeMinutes = totalReviewTimeMinutes;
    return this;
  }

  /**
   * Get totalReviewTimeMinutes
   * @return totalReviewTimeMinutes
  */
    @Schema(name = "totalReviewTimeMinutes", example = "42", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalReviewTimeMinutes")
  public Integer getTotalReviewTimeMinutes() {
    return totalReviewTimeMinutes;
  }

  public void setTotalReviewTimeMinutes(Integer totalReviewTimeMinutes) {
    this.totalReviewTimeMinutes = totalReviewTimeMinutes;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assignment assignment = (Assignment) o;
    return Objects.equals(this.assignmentId, assignment.assignmentId) &&
        Objects.equals(this.repoId, assignment.repoId) &&
        Objects.equals(this.pullRequestId, assignment.pullRequestId) &&
        Objects.equals(this.pullRequestUrl, assignment.pullRequestUrl) &&
        Objects.equals(this.author, assignment.author) &&
        Objects.equals(this.reviewers, assignment.reviewers) &&
        Objects.equals(this.requiredReviewerCount, assignment.requiredReviewerCount) &&
        Objects.equals(this.priority, assignment.priority) &&
        Objects.equals(this.status, assignment.status) &&
        Objects.equals(this.slaDeadline, assignment.slaDeadline) &&
        Objects.equals(this.slaStatus, assignment.slaStatus) &&
        Objects.equals(this.filesChanged, assignment.filesChanged) &&
        Objects.equals(this.assignedAt, assignment.assignedAt) &&
        Objects.equals(this.firstReviewAt, assignment.firstReviewAt) &&
        Objects.equals(this.completedAt, assignment.completedAt) &&
        Objects.equals(this.totalReviewTimeMinutes, assignment.totalReviewTimeMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentId, repoId, pullRequestId, pullRequestUrl, author, reviewers, requiredReviewerCount, priority, status, slaDeadline, slaStatus, filesChanged, assignedAt, firstReviewAt, completedAt, totalReviewTimeMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assignment {\n");
    sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
    sb.append("    pullRequestId: ").append(toIndentedString(pullRequestId)).append("\n");
    sb.append("    pullRequestUrl: ").append(toIndentedString(pullRequestUrl)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
    sb.append("    requiredReviewerCount: ").append(toIndentedString(requiredReviewerCount)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    slaDeadline: ").append(toIndentedString(slaDeadline)).append("\n");
    sb.append("    slaStatus: ").append(toIndentedString(slaStatus)).append("\n");
    sb.append("    filesChanged: ").append(toIndentedString(filesChanged)).append("\n");
    sb.append("    assignedAt: ").append(toIndentedString(assignedAt)).append("\n");
    sb.append("    firstReviewAt: ").append(toIndentedString(firstReviewAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    totalReviewTimeMinutes: ").append(toIndentedString(totalReviewTimeMinutes)).append("\n");
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

