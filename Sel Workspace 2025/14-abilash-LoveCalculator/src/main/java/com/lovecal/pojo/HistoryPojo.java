package com.lovecal.pojo;

import java.time.LocalDateTime;

public class HistoryPojo {
    private int id;
    private int userId;
    private String yourName;
    private String crushName;
    private int result; // percentage
    private String relationType; // Crush, Marriage, etc.
    private String status = "VISIBLE"; // VISIBLE, HIDDEN, FLAGGED
    private LocalDateTime timestamp;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    @Override
	public String toString() {
		return "HistoryPojo [id=" + id + ", userId=" + userId + ", yourName=" + yourName + ", crushName=" + crushName
				+ ", result=" + result + ", relationType=" + relationType + ", status=" + status + ", timestamp="
				+ timestamp + "]";
	}
	public void setUserId(int userId) { this.userId = userId; }

    public String getYourName() { return yourName; }
    public void setYourName(String yourName) { this.yourName = yourName; }

    public String getCrushName() { return crushName; }
    public void setCrushName(String crushName) { this.crushName = crushName; }

    public int getResult() { return result; }
    public void setResult(int result) { this.result = result; }

    public String getRelationType() { return relationType; }
    public void setRelationType(String relationType) { this.relationType = relationType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}