package Colecciones;

import java.util.Arrays;

public class Array_estatico_enteros_2 {

	public static void main(String[] args) {

		// int[] numeros = new int[] {40, 20, 50, 70, 10};

		int[] numeros = new int[6];
		numeros[0] = 40;
		numeros[1] = 20;
		numeros[2] = 50;
		numeros[3] = 70;
		numeros[4] = 10;

		Arrays.sort(numeros);
		for (int temp : numeros) {
			System.out.println(temp);
		}

	}

}
