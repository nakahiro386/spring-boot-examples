package io.github.nakahiro386.spring.boot.example.fw.domain.entity;

import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * AbstractAuditableEntity
 */
@ToString
@EqualsAndHashCode
public abstract class AbstractAuditableEntity implements AuditableEntity {

  private Long id;

  private int version;

  private String createdBy;

  private Date createdDate;

  private String lastModifiedBy;

  private Date lastModifiedDate;

  public AbstractAuditableEntity() {}

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public int getVersion() {
    return version;
  }

  @Override
  public void setVersion(int version) {
    this.version = version;
  }

  @Override
  public String getCreatedBy() {
    return createdBy;
  }

  @Override
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  @Override
  public Date getCreatedDate() {
    return createdDate;
  }

  @Override
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  @Override
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  @Override
  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  @Override
  public Date getLastModifiedDate() {
    return lastModifiedDate;
  }

  @Override
  public void setLastModifiedDate(Date lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  // @Override
  // public String toString() {
  // DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
  // StringBuilder sb = new StringBuilder();
  // sb.append(" [");
  // sb.append("id=").append(id).append(", ");
  // sb.append("version=").append(version).append(", ");
  // sb.append("createdBy=").append(createdBy).append(", ");
  // sb.append("createdDate=").append(formatter.format(createdDate)).append(",
  // ");
  // sb.append("lastModifiedBy=").append(lastModifiedBy).append(", ");
  // sb.append("lastModifiedDate=").append(formatter.format(lastModifiedDate));
  // sb.append("]");
  // return sb.toString();
  // }

}
