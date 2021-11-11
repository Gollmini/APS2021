import java.util.Random;
import java.util.Scanner;

public class Principal {

	Scanner scanner = new Scanner(System.in);

	public int[] geradorArrayAletorio(int tamanhoArray) {
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

	public static void main(String[] args) {
		final int array[] = new Principal().geradorArrayAletorio(5);

		System.out.println("array orginal");
		imprimirVetores(array);
		
		
	}

}
