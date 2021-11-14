package br.com.anhembimorumbi.aps.principal;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Roger Felisbino
 * @Descricao Gerar 50 vetores de inteiros aleatórios com cada um 
 * dos seguintes tamanhos: 5, 10, 50, 100, 1.000 e 10.000.
 *
 */

public class VetoresClass {

	Scanner scanner = new Scanner(System.in);

	public static int[] geradorArrayAletorio(int tamanhoArray) {
		int[] array = new int[tamanhoArray];

		for (int i = 0; i < tamanhoArray; i++) {
			array[i] =  new Random().nextInt(tamanhoArray);
		}
		return array;
	}

	public static void imprimirVetores(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
