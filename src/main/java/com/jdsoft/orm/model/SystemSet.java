package com.jdsoft.orm.model;

import java.io.Serializable;

public class SystemSet implements Serializable {
    private String customerId;

    private String costYear;

    private String costMonth;

    private static final long serialVersionUID = 1L;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCostYear() {
        return costYear;
    }

    public void setCostYear(String costYear) {
        this.costYear = costYear == null ? null : costYear.trim();
    }

    public String getCostMonth() {
        return costMonth;
    }

    public void setCostMonth(String costMonth) {
        this.costMonth = costMonth == null ? null : costMonth.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", customerId=").append(customerId);
        sb.append(", costYear=").append(costYear);
        sb.append(", costMonth=").append(costMonth);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}