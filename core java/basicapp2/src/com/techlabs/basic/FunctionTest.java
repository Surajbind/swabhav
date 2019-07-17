package com.techlabs.basic;

public class FunctionTest {
	static String getMyName() {
		return  "Suraj";
	}

	public static void main(String[] args) {
		printMyName();
		String word = getMyName();
		System.out.println(word);
	}
	static void printMyName() {
		System.out.println("Hello Hamesworth");
	}
}
