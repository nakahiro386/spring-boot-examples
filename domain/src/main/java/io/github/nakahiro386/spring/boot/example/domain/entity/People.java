package io.github.nakahiro386.spring.boot.example.domain.entity;

import io.github.nakahiro386.spring.boot.example.fw.domain.entity.AbstractAuditableEntity;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class People extends AbstractAuditableEntity {
    private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public People withFirstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public People withLastName(String lastName) {
        this.setLastName(lastName);
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}