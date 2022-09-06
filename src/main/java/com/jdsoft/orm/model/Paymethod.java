package com.jdsoft.orm.model;

import java.io.Serializable;

public class Paymethod implements Serializable {
    private Integer paymethodId;

    private String paymethodName;

    private static final long serialVersionUID = 1L;

    public Integer getPaymethodId() {
        return paymethodId;
    }

    public void setPaymethodId(Integer paymethodId) {
        this.paymethodId = paymethodId;
    }

    public String getPaymethodName() {
        return paymethodName;
    }

    public void setPaymethodName(String paymethodName) {
        this.paymethodName = paymethodName == null ? null : paymethodName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paymethodId=").append(paymethodId);
        sb.append(", paymethodName=").append(paymethodName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}