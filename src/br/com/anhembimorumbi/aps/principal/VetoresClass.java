package br.com.anhembimorumbi.aps.principal;

import java.util.Random;

public class VetoresClass {

	public static int[] geradorArrayAletorio(int tamanhoArray) {
		int[] array = new int[tamanhoArray];

		for (int i = 0; i < tamanhoArray; i++) {
			array[i] = new Random().nextInt(tamanhoArray);
		}
		return array;
	}

	public static void imprimirVetores(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
