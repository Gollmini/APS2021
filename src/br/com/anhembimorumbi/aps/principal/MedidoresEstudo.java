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


	@SuppressWarnings("static-access")
	public void executaOrdenacoesVetores(int[][] arrayArray, int codigo) {
		imprimeNomeMetodo(codigo);

		long tempoInicial;
		long tempoFinal;
		long tempoTotal;

		int[] array = null;
		tempoInicial = System.currentTimeMillis();

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
		tempoFinal = System.currentTimeMillis();
		tempoTotal = tempoFinal - tempoInicial;
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
			System.out.println("===== Nome do metodo: Ordenacao Buble Sort =====");
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
			ordenacao.ordenacaoBublesort(array);
		} else if (codigo == 2) {
			ordenacao.ordenacaoBucketSort(array);
		} else if (codigo == 3) {
			ordenacao.ordenacaoSelectionSort(array);
		} else if (codigo == 4) {
			ordenacao.ordenacaoMergeSort(array, array.length);
		} else if (codigo == 5) {
			ordenacao.ordenacaoHeapSort(array);
		} else if (codigo == 6) {
			ordenacao.ordenacaoInsertionSort(array);
		} else if (codigo == 7) {
			new OrdenacaoClass().ordenacaoRadixSort(array);
		} else if (codigo == 8) {
			new OrdenacaoClass().qordenacaoQuickSort(array, array[0], array.length);
		} else {
			System.out.println("Codigo invalido");
		}
	}
}
