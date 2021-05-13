package io.github.nakahiro386.spring.boot.example.fw.domain.entity;

import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * AbstractAuditableEntity.
 */
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Setter(onMethod_ = {@Override})
@Getter(onMethod_ = {@Override})
public abstract class AbstractAuditableEntity implements AuditableEntity {

  private Long id;

  private int version;

  private String createdBy;

  private Date createdDate;

  private String lastModifiedBy;

  private Date lastModifiedDate;

}
