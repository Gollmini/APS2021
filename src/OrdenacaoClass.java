
public class OrdenacaoClass {

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

	public static void ordenacaoSelectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int i_menor = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[i_menor])
					i_menor = j;
			int aux = array[i];
			array[i] = array[i_menor];
			array[i_menor] = aux;

		}
	}

	public static int[] ordenacaoInsertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {

			int j = i;

			while (j > 0 && array[j] < array[j - 1]) {
				int aux = array[j];
				array[j] = array[j - 1];
				array[j - 1] = aux;
				j -= 1;
			}
		}
		return array;
	}

}
