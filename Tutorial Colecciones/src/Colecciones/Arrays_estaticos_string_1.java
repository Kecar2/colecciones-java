package Colecciones;

import java.util.Arrays;

public class Arrays_estaticos_string_1 {

	public static void main(String[] args) {

		// String[] fruits = new String[] {"Pineapple", "Apple", "Orange", "Banana"};

		String[] fruits = new String[5];
		fruits[0] = "Pineapple";
		fruits[1] = "Apple";
		fruits[2] = "Orange";
		fruits[3] = "Banana";
		fruits[4] = "";

		/*
		 * for(int i = 0; i<fruits.length; i++) { // clasico
		 * System.out.println(fruits[i]); }
		 */

		Arrays.sort(fruits); // Ordena alfabéticamente
		for (String temp : fruits) { // foreach desde java 8
			System.out.println(temp);
		}

	}

}
