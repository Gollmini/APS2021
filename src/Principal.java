import java.util.Random;
import java.util.Scanner;

public class Principal {

	Scanner scanner = new Scanner(System.in);

	public void geradorArrayAletorio(int tamanhoArray){
				int [] array = new int[tamanhoArray];

				for(int i = 0 ; i < tamanhoArray ; i++){
				//	array[i] = new Random().nextInt();
					System.out.println(array[i]);
				}
				
				long timeInicio = System.currentTimeMillis();
				ordenacaoBublesort(array);
				System.out.println("-------------------");
				long timeFinal = System.currentTimeMillis();
				
				System.out.println("ini: " + timeInicio);
				System.out.println("fim : " + timeFinal);

				for(int i = 0 ; i < tamanhoArray ; i++){
					System.out.println(array[i]);
				}
			}

	public void ordenacaoBublesort(int[] array) {
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
	}

	public static void selectionSort(int[] v) {
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

	public static void insertionSort(int[] values) {
		for (int i = 1; i < values.length; i++) {

			int j = i;

			while (j > 0 && values[j] < values[j - 1]) {
				int aux = values[j];
				values[j] = values[j - 1];
				values[j - 1] = aux;
				j -= 1;
			}

		}
	}

	public static void main(String[] args) {
		new Principal().geradorArrayAletorio(2);
	}

}


