package it.buzzi.app;

import org.apache.commons.text.WordUtils;

/**
 * Hello world! Edited with a brand new sum function!
 * 
 * @author madx
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(WordUtils.capitalize("words with no upper letters"));
	}

	/**
	 * Computes the sum of two integers
	 * 
	 * @param a the first integer
	 * @param b the second integer
	 * @return (a+b)
	 */
	public static int sum(int a, int b) {
		return a + b;
	}
}

