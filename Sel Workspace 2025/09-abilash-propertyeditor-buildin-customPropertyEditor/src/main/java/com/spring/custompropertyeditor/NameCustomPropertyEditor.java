package com.spring.custompropertyeditor;

import java.beans.PropertyEditorSupport;


public class NameCustomPropertyEditor extends PropertyEditorSupport{
/*
 * Convert Lower Case to UpperCase and Store in to DTO Object
 * */	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(text.toUpperCase());
	}

}
