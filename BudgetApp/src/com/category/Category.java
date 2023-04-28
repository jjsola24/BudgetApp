package com.category;

public class Category {

    private String name;
    private Double assignedAmount;
    private Double usedAmount;
    private Double availableAmount;

    public Category(String name) {
        this.name = name;
        this.assignedAmount = 0.0;
        this.usedAmount = 0.0;
        this.availableAmount = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAssignedAmount() {
        return assignedAmount;
    }

    public Double getUsedAmount() {
        return usedAmount;
    }

    public Double getAvailableAmount() {
        return availableAmount;
    }

    public void setAssignedAmount(Double assignedAmount) {
        this.assignedAmount = assignedAmount;
    }

    public void setAvailableAmount(Double availableAmount) {
        this.availableAmount = availableAmount;
    }

    public Double assignAmount(Double amount) {
        this.assignedAmount += amount;
        this.availableAmount += amount;
        return this.assignedAmount;
    }

    public void setUsedAmount(Double usedAmount) {
        this.usedAmount = usedAmount;
    }
}
