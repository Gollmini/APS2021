import java.util.Random;
import java.util.Scanner;

public class Principal {

	Scanner scanner = new Scanner(System.in);

	public int[] geradorArrayAletorio(int tamanhoArray) {
		int[] array = new int[tamanhoArray];

		for (int i = 0; i < tamanhoArray; i++) {
			array[i] = new Random().nextInt(50000);
		}
		return array;
	}

	public int[] ordenacaoBublesort(int[] array) {
		int aux = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
		return array;
	}

	public static void ordenacaoSelectionSort(int[] v) {
		for (int i = 0; i < v.length; i++) {
			int i_menor = i;
			for (int j = i + 1; j < v.length; j++)
				if (v[j] < v[i_menor])
					i_menor = j;
			int aux = v[i];
			v[i] = v[i_menor];
			v[i_menor] = aux;

		}
	}

	public static int[] ordenacaoInsertionSort(int[] arrayValues) {
		for (int i = 1; i < arrayValues.length; i++) {

			int j = i;

			while (j > 0 && arrayValues[j] < arrayValues[j - 1]) {
				int aux = arrayValues[j];
				arrayValues[j] = arrayValues[j - 1];
				arrayValues[j - 1] = aux;
				j -= 1;
			}
		}
		return arrayValues;
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
		
		System.out.println("array bubleSort");
		final int[] arrayOrdenadoBubleSort = new Principal().ordenacaoBublesort(array);
		imprimirVetores(arrayOrdenadoBubleSort);
		
		System.out.println("array orginal");
		imprimirVetores(array);
		
		final int[] arrayOrdenadoInsertSort = new Principal().ordenacaoInsertionSort(array);
	}

}
