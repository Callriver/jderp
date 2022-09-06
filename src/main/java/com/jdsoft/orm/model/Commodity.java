package com.jdsoft.orm.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Commodity implements Serializable {
    private String commodityId;

    private String commodityName;

    private BigDecimal purchasePrice;

    private BigDecimal salesPrice;

    private String commodityImage;

    private String operationUser;

    private Date operationDate;

    private static final long serialVersionUID = 1L;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId == null ? null : commodityId.trim();
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getCommodityImage() {
        return commodityImage;
    }

    public void setCommodityImage(String commodityImage) {
        this.commodityImage = commodityImage == null ? null : commodityImage.trim();
    }

    public String getOperationUser() {
        return operationUser;
    }

    public void setOperationUser(String operationUser) {
        this.operationUser = operationUser == null ? null : operationUser.trim();
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commodityId=").append(commodityId);
        sb.append(", commodityName=").append(commodityName);
        sb.append(", purchasePrice=").append(purchasePrice);
        sb.append(", salesPrice=").append(salesPrice);
        sb.append(", commodityImage=").append(commodityImage);
        sb.append(", operationUser=").append(operationUser);
        sb.append(", operationDate=").append(operationDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}