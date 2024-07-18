package com.example.citymanagement.entity;

import java.time.LocalDateTime;

public class CaseInfom {

    private int caseID;
    private byte[] photo;
    private String caseType;
    private String description;
    private String location;
    private String locationDescribe;
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime closedDate;
    private String reporter;
    private String reporterPhone;
    private boolean needResponse;
    private String infoCategory;
    private String handlingMethod;
    private boolean isVerified;
    private String severity;
    private int managerID;

    // Getters and Setters
    public int getCaseID() {
        return caseID;
    }

    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationDescribe() {
        return locationDescribe;
    }

    public void setLocationDescribe(String locationDescribe) {
        this.locationDescribe = locationDescribe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(LocalDateTime closedDate) {
        this.closedDate = closedDate;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getReporterPhone() {
        return reporterPhone;
    }

    public void setReporterPhone(String reporterPhone) {
        this.reporterPhone = reporterPhone;
    }

    public boolean isNeedResponse() {
        return needResponse;
    }

    public void setNeedResponse(boolean needResponse) {
        this.needResponse = needResponse;
    }

    public String getInfoCategory() {
        return infoCategory;
    }

    public void setInfoCategory(String infoCategory) {
        this.infoCategory = infoCategory;
    }

    public String getHandlingMethod() {
        return handlingMethod;
    }

    public void setHandlingMethod(String handlingMethod) {
        this.handlingMethod = handlingMethod;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int manager) {
        this.managerID = manager;
    }
}
