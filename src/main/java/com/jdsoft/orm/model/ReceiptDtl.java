package com.jdsoft.orm.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ReceiptDtl implements Serializable {
    private String receiptMainCode;

    private Integer sequence;

    private String item;

    private Integer num;

    private String unit;

    private BigDecimal unitPrice;

    private BigDecimal price;

    private String note;

    private static final long serialVersionUID = 1L;

    public String getReceiptMainCode() {
        return receiptMainCode;
    }

    public void setReceiptMainCode(String receiptMainCode) {
        this.receiptMainCode = receiptMainCode == null ? null : receiptMainCode.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item == null ? null : item.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
        sb.append(", receiptMainCode=").append(receiptMainCode);
        sb.append(", sequence=").append(sequence);
        sb.append(", item=").append(item);
        sb.append(", num=").append(num);
        sb.append(", unit=").append(unit);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", price=").append(price);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}