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
			System.out.println("Nome do metodo: Ordenacao Buble Sort");
			new OrdenacaoClass().ordenacaoBublesort(array);
			
		} else if (codigo == 2) {
			System.out.println("===== Ordenacao Bucket Sort =======");
			new OrdenacaoClass().ordenacaoBucketSort(array, array.length);
		
		} else if (codigo == 3) {
			System.out.println("===== Ordenacao Selection Sort =======");
			new OrdenacaoClass().ordenacaoSelectionSort(array);
		
		} else if (codigo == 4) {
			System.out.println("Nome do metodo: Ordenacao Merge Sort");
			new OrdenacaoClass().ordenacaoMergeSort(array, array.length);
			
		} else if (codigo == 5) {
			System.out.println("Nome do metodo: Ordenacao Heap Sort");
			new OrdenacaoClass().ordenacaoHeapSort(array);
			
		} else if (codigo == 6) {
			System.out.println("===== Ordenacao Insertion Sort =======");
			new OrdenacaoClass().ordenacaoInsertionSort(array);
			
		} else if (codigo == 7) {
			System.out.println("===== Ordenacao Radix Sort =======");
			new OrdenacaoClass().ordenacaoRadixSort(array);
			
		} else if (codigo == 8) {
			System.out.println("===== Ordenacao Quick Sort =======");
			new OrdenacaoClass().ordenacaoQuickSort(array, array[0], array.length);
			
		}
	}

}
