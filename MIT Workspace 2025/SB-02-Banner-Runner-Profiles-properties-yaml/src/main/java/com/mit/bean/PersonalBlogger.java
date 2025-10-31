package com.mit.bean;

import java.util.Arrays;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "blogger")
public class PersonalBlogger {
	
	private String name;
	
	private String[] category;
	
	private int followersCount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getCategory() {
		return category;
	}

	public void setCategory(String[] category) {
		this.category = category;
	}

	public int getFollowersCount() {
		return followersCount;
	}

	public void setFollowersCount(int followersCount) {
		this.followersCount = followersCount;
	}

	@Override
	public String toString() {
		return "PersonalBlogger [name=" + name + ", category=" + Arrays.toString(category) + ", followersCount="
				+ followersCount + "]";
	}
	
	public void display() {
		System.out.println(">-------| Social Info |-------<");
		String str = String.format("Name : %s", name);
		System.out.println(str);
		str = String.format("Categories : %s", Arrays.toString(category));
		System.out.println(str);
		str = String.format("Followers Count : %s", followersCount);
		System.out.println(str);
		System.out.println(">------------------------------<");
		
	}
	
	

}
