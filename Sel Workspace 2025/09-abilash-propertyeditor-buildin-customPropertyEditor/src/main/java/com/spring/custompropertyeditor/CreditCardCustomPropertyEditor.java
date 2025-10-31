package com.spring.custompropertyeditor;

import java.beans.PropertyEditorSupport;

import com.spring.dto.CreditCardDTO;

public class CreditCardCustomPropertyEditor extends PropertyEditorSupport{
	
	
	@Override
	public String getAsText() {
		
		CreditCardDTO value = (CreditCardDTO)getValue();
		
		return value + "";
		
	}
	
	@Override
	public void setAsText(String str) throws IllegalArgumentException {
		
		
		String[] splitted = str.split("-");
		
		CreditCardDTO ccd = new CreditCardDTO();
		ccd.setFirstFourDigits(splitted[0]);
		ccd.setSecondFourDigits(splitted[1]);
		ccd.setThirdFourDigits(splitted[2]);
		ccd.setFourthFourDigits(splitted[3]);
		
		setValue(ccd);
			
		
	}
	

}
