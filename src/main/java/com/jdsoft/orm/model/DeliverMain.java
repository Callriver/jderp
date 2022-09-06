package com.jdsoft.orm.model;

import java.io.Serializable;
import java.util.Date;

public class DeliverMain implements Serializable {
    private String deliverMainCode;

    private String customerId;

    private Boolean isReturn;

    private String warehouseId;

    private String currency;

    private String entryUser;

    private Date entryTime;

    private String issuedUser;

    private Date issuedTime;

    private String note;

    private static final long serialVersionUID = 1L;

    public String getDeliverMainCode() {
        return deliverMainCode;
    }

    public void setDeliverMainCode(String deliverMainCode) {
        this.deliverMainCode = deliverMainCode == null ? null : deliverMainCode.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public Boolean getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(Boolean isReturn) {
        this.isReturn = isReturn;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getEntryUser() {
        return entryUser;
    }

    public void setEntryUser(String entryUser) {
        this.entryUser = entryUser == null ? null : entryUser.trim();
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getIssuedUser() {
        return issuedUser;
    }

    public void setIssuedUser(String issuedUser) {
        this.issuedUser = issuedUser == null ? null : issuedUser.trim();
    }

    public Date getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(Date issuedTime) {
        this.issuedTime = issuedTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deliverMainCode=").append(deliverMainCode);
        sb.append(", customerId=").append(customerId);
        sb.append(", isReturn=").append(isReturn);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", currency=").append(currency);
        sb.append(", entryUser=").append(entryUser);
        sb.append(", entryTime=").append(entryTime);
        sb.append(", issuedUser=").append(issuedUser);
        sb.append(", issuedTime=").append(issuedTime);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}