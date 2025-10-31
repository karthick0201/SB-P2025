package com.spring.dto;

import java.math.BigDecimal;

import java.util.Currency;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BillDTO {

	private BigDecimal amount;
	private CreditCardDTO creditCardDTO;
	private Currency currency;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date date;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public CreditCardDTO getCreditCardDTO() {
		return creditCardDTO;
	}

	public void setCreditCardDTO(CreditCardDTO creditCardDTO) {
		this.creditCardDTO = creditCardDTO;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
}
