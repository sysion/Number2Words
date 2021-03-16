package com.sysionng.numbertowords;

import java.io.OutputStream;
import com.sysionng.numbertowords.Number2Words;
import com.sysionng.numbertowords.Number2WordsUtility;


public class Number2WordsApp {

	public static void main(String[] args) {

		Number2Words mNumber2Words = new Number2Words(Number2WordsUtility.GetNumber());
		String mNumberInWords = mNumber2Words.ConvertNumber2Words();

		String firstLetterCapital = mNumberInWords.substring(0, 1).toUpperCase() + mNumberInWords.substring(1);
		System.out.println(firstLetterCapital);
	}


}