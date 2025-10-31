package com.lovecal.util;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.lovecal.pojo.UserPojo;

public class LoveCalculatorUtil {

	public static UserPojo getUserPojoFromUserListMap(List<Map<String, Object>> userListMap) {
		
		Map<String, Object> map = userListMap.get(0);
		UserPojo user = new UserPojo();
		
		user.setId((Integer)map.get("id"));
		user.setName(String.valueOf(map.get("name")));
		user.setEmail(String.valueOf(map.get("email")));
		user.setPhone(String.valueOf(map.get("phone")));
		user.setPassword(String.valueOf(map.get("password")));
		user.setStatus(String.valueOf(map.get("status")));
		
		String timestamp = map.get("registered_at").toString(); // e.g. "2025-09-30T09:45:16"
		LocalDateTime registeredAt = LocalDateTime.parse(timestamp);
		user.setRegisteredAt(registeredAt);
		
		return user;
	}

	
	
}
