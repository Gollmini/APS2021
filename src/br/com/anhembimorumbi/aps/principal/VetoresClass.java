package br.com.anhembimorumbi.aps.principal;
import java.util.Scanner;

public class VetoresClass {

	Scanner scanner = new Scanner(System.in);

	public static int[] geradorArrayAletorio(int tamanhoArray) {
		int[] array = new int[tamanhoArray];

		for (int i = 0; i < tamanhoArray; i++) {
			array[i] = (int) Math.random() * tamanhoArray + 1;
		}
		return array;
	}

	public static void imprimirVetores(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
