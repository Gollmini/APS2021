package br.com.anhembimorumbi.aps.principal;

public class MedidoresEstudo {

	VetoresClass vetores = new VetoresClass();
	OrdenacaoClass ordenacao = new OrdenacaoClass();

	long tempoInicial;
	long tempoFinal;
	long tempoTotal;

	/*
	 * Quick , Count Sort, e Radix Sort void selecionaTipo(int codigo, int[] array)
	 * 
	 */

	/**
	 * Recebe um codigo (numero inteiro) e invoca um metodo de ordenacao
	 * 
	 * @param codigo --> numero do metodo de ordenacao a ser executado
	 * @param array  --> vetor de inteiros a ser ordenado
	 */

	public final void medeTempo(int codigo, int array[]) {
		tempoInicial = System.nanoTime();
		this.selecionaTipo(codigo, array);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		System.out.println("Tempo de execucao: " + tempoTotal);
	}

	public final void selecionaTipo(int codigo, int[] array) {
		if (codigo == 1) {
			System.out.println("Nome do metodo: Ordenacao Buble Sort");

			ordenacao.ordenacaoBublesort(array);

		} else if (codigo == 2) {
			System.out.println("===== Ordenacao Bucket Sort =======");
			ordenacao.ordenacaoBucketSort(array, array.length);

		} else if (codigo == 3) {
			System.out.println("===== Ordenacao Selection Sort =======");
			ordenacao.ordenacaoSelectionSort(array);

		} else if (codigo == 4) {
			System.out.println("Nome do metodo: Ordenacao Merge Sort");
			ordenacao.ordenacaoMergeSort(array, array.length);

		} else if (codigo == 5) {
			System.out.println("Nome do metodo: Ordenacao Heap Sort");
			ordenacao.ordenacaoHeapSort(array);

		} else if (codigo == 6) {
			System.out.println("===== Ordenacao Insertion Sort =======");
			ordenacao.ordenacaoInsertionSort(array);

		} else if (codigo == 7) {
			System.out.println("===== Ordenacao Radix Sort =======");
			new OrdenacaoClass().ordenacaoRadixSort(array);

		} else if (codigo == 8) {
			System.out.println("===== Ordenacao Quick Sort =======");
			new OrdenacaoClass().ordenacaoQuickSort(array, array[0], array.length);
		}
	}

}
