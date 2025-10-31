package com.spring.controller;

import java.beans.PropertyEditorSupport;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;

import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.custompropertyeditor.CreditCardCustomPropertyEditor;
import com.spring.custompropertyeditor.NameCustomPropertyEditor;
import com.spring.dto.BillDTO;
import com.spring.dto.CreditCardDTO;

import jakarta.validation.Valid;

@Controller
public class BillAppController {

	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/bill-page")
	public String billPage(@ModelAttribute("billDTO")BillDTO billDto) {
		CreditCardDTO cc=new CreditCardDTO();
		cc.setFirstFourDigits("1111");
		cc.setSecondFourDigits("2222");
		cc.setThirdFourDigits("3333");
		cc.setFourthFourDigits("4444");
		billDto.setCreditCardDTO(cc);
		return "bill-page";
	}
	
	@RequestMapping("/result-page")
	public String resultPage(@Valid @ModelAttribute("billDTO")BillDTO billDto,BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "bill-page";
		}
		
		
		
		return "result-page";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		
		CreditCardCustomPropertyEditor ccPropertyEditor = new CreditCardCustomPropertyEditor();

		webDataBinder.registerCustomEditor(CreditCardDTO.class,
											"creditCardDTO", 
											ccPropertyEditor);

		webDataBinder.registerCustomEditor(Currency.class, new PropertyEditorSupport() {
			@Override
			public void setAsText(String text) throws IllegalArgumentException {
				System.out.println("CUrrency Text : " + text);
				setValue(Currency.getInstance(text.toUpperCase()));
			}
		});
		//Decimal --> 12000 instead of 12,000
		
		NumberFormat nf = new DecimalFormat("##,###.00");
		CustomNumberEditor cne = new CustomNumberEditor(BigDecimal.class,nf,true);
		
		webDataBinder.registerCustomEditor(BigDecimal.class, "amount",cne);
		
		// 3. Lower case to Upper Case
		
		NameCustomPropertyEditor nameUpperCaseProperty = new NameCustomPropertyEditor();
		
		webDataBinder.registerCustomEditor(String.class, 
											"name",
											nameUpperCaseProperty);
		
		
		
		
		

	}
	
}
