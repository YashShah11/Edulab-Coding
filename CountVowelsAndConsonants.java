package com.demo.java;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String : ");
		String inputStr = sc.nextLine();
		inputStr =  inputStr.toLowerCase();
		int vowelCount = 0;
		int consonantsCount = 0;
		char[]  chrArr = inputStr.toCharArray();
		
		for(char ch : chrArr) {
			if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
			else {
				consonantsCount++;
			}
		}
		System.out.println("Count of Vowels is: "+ vowelCount+ " and Consonants is "+consonantsCount);

	}

}
