package br.com.anhembimorumbi.aps.principal;

public class Estudo {

	VetoresClass vetores = new VetoresClass();

	public static long medicaoExecucao(int codigo, int[] array) {
		long tempoInicial = System.currentTimeMillis();
		selecionaTipo(codigo, array);
		long tempoFinal = System.currentTimeMillis();
		long tempoTotal = tempoFinal - tempoInicial;

		return tempoTotal;

	}

	/*
	 * Quick , Count Sort, e Radix Sort
	 */
	@SuppressWarnings("static-access")
	static void selecionaTipo(int codigo, int[] array) {

		if (codigo == 1) {
			new OrdenacaoClass().ordenacaoBublesort(array);
			System.out.println("Buble Sort");
		} else if (codigo == 2) {
			new OrdenacaoClass().ordenacaoBucketSort(array, array.length);
			System.out.println("Bucket Sort");
		} else if (codigo == 3) {
			new OrdenacaoClass().ordenacaoSelectionSort(array);
			System.out.println("Selection Sort");
		} else if (codigo == 4) {
			new OrdenacaoClass().ordenacaoMergeSort(array, array.length);
		} else if (codigo == 5) {
			System.out.println("Heap Sort");
			new OrdenacaoClass().ordenacaoHeapSort(array);
		} else if (codigo == 6) {
			new OrdenacaoClass().ordenacaoInsertionSort(array);
		} else if (codigo == 7) {
			System.out.println("Radix Sort");
			new OrdenacaoClass().ordenacaoRadixSort(array);
		} else if (codigo == 8) {
			System.out.println("Quick Sort");
			new OrdenacaoClass().ordenacaoQuickSort(array, array[0], array.length);
		}
	}

}
