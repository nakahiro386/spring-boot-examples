package io.github.nakahiro386.spring.boot.example.fw.domain.entity;

import java.io.Serializable;
import java.util.Date;

public interface AuditableEntity extends Serializable {

    Long getId();

    void setId(Long id);

    int getVersion();

    void setVersion(int version);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedDate();

    void setCreatedDate(Date createdDate);

    String getLastModifiedBy();

    void setLastModifiedBy(String lastModifiedBy);

    Date getLastModifiedDate();

    void setLastModifiedDate(Date lastModifiedDate);

}
