package br.com.anhembimorumbi.aps.principal;

public class MedidoresEstudo {

	VetoresClass vetores = new VetoresClass();
	OrdenacaoClass ordenacao = new OrdenacaoClass();

	long totalComparacoesBubleSort = 0;
	long totalComparacoesSelectionSort = 0;
	long totalComparacoesInsertionSort = 0;
	long totalComparacoesQuickSort = 0;
	long totalComparacoesMergeSort = 0;
	long totalComparacoesRadixSort = 0;
	long totalComparacoesHeapSort = 0;
	long totalComparacoesBucketSort = 0;

	/**
	 * Recebe um codigo (numero inteiro) e invoca um metodo de ordenacao
	 * 
	 * @param codigo --> numero do metodo de ordenacao a ser executado
	 * @param array  --> vetor de inteiros a ser ordenado
	 */

	@SuppressWarnings("static-access")
	public void executaOrdenacoesVetores(int[][] arrayArray, int codigo) {
		imprimeNomeMetodo(codigo);

		long tempoInicial;
		long tempoFinal;
		long tempoTotal;

		int[] array = null;
		tempoInicial = System.nanoTime();

		for (int m = 0; m < arrayArray.length; m++) {
			array = arrayArray[m];
			selecionaTipo(codigo, array);

			totalComparacoesBubleSort += ordenacao.comparacoesBubleSort;
			totalComparacoesSelectionSort += ordenacao.comparacoesSelectionSort;
			totalComparacoesInsertionSort += ordenacao.comparacoesInsertionSort;
			totalComparacoesQuickSort += ordenacao.comparacoesQuickSort;
			totalComparacoesMergeSort += ordenacao.comparacoesMergeSort;
			totalComparacoesRadixSort += ordenacao.comparacoesRadixSort;
			totalComparacoesHeapSort += ordenacao.comparacoesHeapSort;
			totalComparacoesBucketSort += ordenacao.comparacoesBubleSort;

		}

		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;

		// System.out.println("Contem: " + array.length + " elementos");
		System.out.println("Tempo total: " + tempoTotal + " nanosegundos");

	}

	public void imprimeComparacoes() {
		System.out.println("------- Total de comparacoes ----------");
		System.out.println("total de comparacoes: BUBLE SORT : " + totalComparacoesBubleSort);
		System.out.println("total de comparacoes: SELECTION SORT : " + totalComparacoesSelectionSort);
		System.out.println("total de comparacoes: INSERTION SORT : " + totalComparacoesInsertionSort);
		System.out.println("total de comparacoes: QUICK SORT : " + totalComparacoesQuickSort);
		System.out.println("total de comparacoes: MERGE SORT : " + totalComparacoesMergeSort);
		System.out.println("total de comparacoes: RADIX SORT : " + totalComparacoesRadixSort);
		System.out.println("total de comparacoes: HEAP SORT :  " + totalComparacoesHeapSort);
		System.out.println("total de comparacoes: BUCKET SORT : " + totalComparacoesBucketSort);

	}

	public void imprimirVetores(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public void imprimeNomeMetodo(int codigo) {

		if (codigo == 1) {
			System.out.println("Nome do metodo: Ordenacao Buble Sort");

		} else if (codigo == 2) {
			System.out.println("===== Ordenacao Bucket Sort =======");
		} else if (codigo == 3) {
			System.out.println("===== Ordenacao Selection Sort =======");
		} else if (codigo == 4) {
			System.out.println("Nome do metodo: Ordenacao Merge Sort  =======");
		} else if (codigo == 5) {
			System.out.println("Nome do metodo: Ordenacao Heap Sort  =======");
		} else if (codigo == 6) {
			System.out.println("===== Ordenacao Insertion Sort =======");
		} else if (codigo == 7) {
			System.out.println("===== Ordenacao Radix Sort =======");
		} else if (codigo == 8) {
			System.out.println("===== Ordenacao Quick Sort =======");
		} else {
			System.out.println("Codigo invalido");
		}

	}

	public final void selecionaTipo(int codigo, int array[]) {
		if (codigo == 1) {
			// System.out.println("Nome do metodo: Ordenacao Buble Sort");

			ordenacao.ordenacaoBublesort(array);

		} else if (codigo == 2) {
			// System.out.println("===== Ordenacao Bucket Sort =======");

			ordenacao.ordenacaoBucketSort(array);

		} else if (codigo == 3) {
			// System.out.println("===== Ordenacao Selection Sort =======");

			ordenacao.ordenacaoSelectionSort(array);

		} else if (codigo == 4) {
			// System.out.println("Nome do metodo: Ordenacao Merge Sort");

			ordenacao.ordenacaoMergeSort(array, array.length);

		} else if (codigo == 5) {
			// System.out.println("Nome do metodo: Ordenacao Heap Sort");
			ordenacao.ordenacaoHeapSort(array);

		} else if (codigo == 6) {
			// System.out.println("===== Ordenacao Insertion Sort =======");
			ordenacao.ordenacaoInsertionSort(array);

		} else if (codigo == 7) {
			// System.out.println("===== Ordenacao Radix Sort =======");
			new OrdenacaoClass().ordenacaoRadixSort(array);

		} else if (codigo == 8) {
			// System.out.println("===== Ordenacao Quick Sort =======");
			new OrdenacaoClass().qordenacaoQuickSort(array, array[0], array.length);
		} else {
			System.out.println("Codigo invalido");
		}
	}

}
