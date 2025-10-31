package com.lovecal.pojo;

import java.time.LocalDateTime;

public class UserPojo {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String status; // ACTIVE, INACTIVE, DELETED
    private LocalDateTime registeredAt;

    public UserPojo() {
	}
    public UserPojo(String name, String email, String phone, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.status = "ACTIVE";
	}
	@Override
	public String toString() {
		return "UserPojo [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password="
				+ password + ", status=" + status + ", registeredAt=" + registeredAt + "]";
	}
	// Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getRegisteredAt() { return registeredAt; }
    public void setRegisteredAt(LocalDateTime registeredAt) { this.registeredAt = registeredAt; }
}