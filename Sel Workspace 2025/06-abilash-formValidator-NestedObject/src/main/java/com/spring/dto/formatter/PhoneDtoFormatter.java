package com.spring.dto.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.spring.dto.PhoneDTO;

public class PhoneDtoFormatter implements Formatter<PhoneDTO>{

	@Override
	public String print(PhoneDTO phone, Locale locale) { 
		// Converts Object to String
		String phoneNumberStr = phone.getCountryCode() + "-" + phone.getPhoneNo();
		
		return phoneNumberStr;
	}

	@Override
	public PhoneDTO parse(String str, Locale locale) throws ParseException { 
		// Converts String to Object
		
		/* WE CONVERT String to Object
		 91-987654321
		 * Split using "-"
		 * Set to PhoneDTO Object
		 * Return PhoneDTO Object
		 
		 While submitting the form, before setting DTO - this method call and
		 	converts String to Object
		  
		 * */
		/*String[] phoneString = str.split("-");
		PhoneDTO dto = new PhoneDTO();
		dto.setCountryCode(phoneString[0]);
		dto.setPhoneNo(phoneString[1]);
		*/
		String defaultCountryCode = "91";
		boolean isHypenContains = str.contains("-");
		String[] phoneString = str.split("-");
		PhoneDTO dto = new PhoneDTO();
		
		if(isHypenContains) {
			dto.setCountryCode(phoneString[0]);
			dto.setPhoneNo(phoneString[1]);
		}else {
			dto.setCountryCode(defaultCountryCode);
			dto.setPhoneNo(phoneString[0]);
		}
		
		return dto;
	}

}
