package com.jdsoft.orm.model;

import java.io.Serializable;

public class SecondMenu implements Serializable {
    private String secondId;

    private String secondSuperior;

    private String secondName;

    private Integer secondState;

    private static final long serialVersionUID = 1L;

    public String getSecondId() {
        return secondId;
    }

    public void setSecondId(String secondId) {
        this.secondId = secondId == null ? null : secondId.trim();
    }

    public String getSecondSuperior() {
        return secondSuperior;
    }

    public void setSecondSuperior(String secondSuperior) {
        this.secondSuperior = secondSuperior == null ? null : secondSuperior.trim();
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName == null ? null : secondName.trim();
    }

    public Integer getSecondState() {
        return secondState;
    }

    public void setSecondState(Integer secondState) {
        this.secondState = secondState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", secondId=").append(secondId);
        sb.append(", secondSuperior=").append(secondSuperior);
        sb.append(", secondName=").append(secondName);
        sb.append(", secondState=").append(secondState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}