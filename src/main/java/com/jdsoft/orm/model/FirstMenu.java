package com.jdsoft.orm.model;

import java.io.Serializable;

public class FirstMenu implements Serializable {
    private String firstId;

    private String firstName;

    private Integer firstState;

    private static final long serialVersionUID = 1L;

    public String getFirstId() {
        return firstId;
    }

    public void setFirstId(String firstId) {
        this.firstId = firstId == null ? null : firstId.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public Integer getFirstState() {
        return firstState;
    }

    public void setFirstState(Integer firstState) {
        this.firstState = firstState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", firstId=").append(firstId);
        sb.append(", firstName=").append(firstName);
        sb.append(", firstState=").append(firstState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}