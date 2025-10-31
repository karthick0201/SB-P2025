package com.lc.service.lclogic;

import org.springframework.stereotype.Service;

@Service
public class LoveCalServiceImp implements LoveCalService {
	private final String[] FLAMES = { "FRIENDS", "LOVERS", "AFFECTIONATE", "MARRIAGE", "ENEMIES", "SIBLING" };

	@Override
	public String calculateLogic(String name, String crushName) {
		// Bussiness Logic
		int letterCount = name.length() + crushName.length();
		int flamesCount = FLAMES.length;
		int index = letterCount % flamesCount;

		String result = FLAMES[index];

//		String s=name + " and " + crushName + " calculation Result is " + result;
		return result;
	}

}
