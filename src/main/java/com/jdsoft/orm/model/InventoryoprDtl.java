package com.jdsoft.orm.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InventoryoprDtl implements Serializable {
    private String inventoryoprMainCode;

    private Integer sequence;

    private String item;

    private Integer num;

    private String unit;

    private BigDecimal unitPrice;

    private BigDecimal price;

    private String warehouseId;

    private String opsiteWarehouseId;

    private String departmentId;

    private String customerId;

    private String inventoryoprType;

    private String originalCode;

    private Date handleTime;

    private String handleUser;

    private static final long serialVersionUID = 1L;

    public String getInventoryoprMainCode() {
        return inventoryoprMainCode;
    }

    public void setInventoryoprMainCode(String inventoryoprMainCode) {
        this.inventoryoprMainCode = inventoryoprMainCode == null ? null : inventoryoprMainCode.trim();
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

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId == null ? null : warehouseId.trim();
    }

    public String getOpsiteWarehouseId() {
        return opsiteWarehouseId;
    }

    public void setOpsiteWarehouseId(String opsiteWarehouseId) {
        this.opsiteWarehouseId = opsiteWarehouseId == null ? null : opsiteWarehouseId.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getInventoryoprType() {
        return inventoryoprType;
    }

    public void setInventoryoprType(String inventoryoprType) {
        this.inventoryoprType = inventoryoprType == null ? null : inventoryoprType.trim();
    }

    public String getOriginalCode() {
        return originalCode;
    }

    public void setOriginalCode(String originalCode) {
        this.originalCode = originalCode == null ? null : originalCode.trim();
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public String getHandleUser() {
        return handleUser;
    }

    public void setHandleUser(String handleUser) {
        this.handleUser = handleUser == null ? null : handleUser.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inventoryoprMainCode=").append(inventoryoprMainCode);
        sb.append(", sequence=").append(sequence);
        sb.append(", item=").append(item);
        sb.append(", num=").append(num);
        sb.append(", unit=").append(unit);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", price=").append(price);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", opsiteWarehouseId=").append(opsiteWarehouseId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", customerId=").append(customerId);
        sb.append(", inventoryoprType=").append(inventoryoprType);
        sb.append(", originalCode=").append(originalCode);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", handleUser=").append(handleUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}