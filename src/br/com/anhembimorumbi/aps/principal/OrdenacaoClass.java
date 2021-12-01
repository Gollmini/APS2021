package br.com.anhembimorumbi.aps.principal;

public class OrdenacaoClass {
	static long comparacoesBubleSort;
	static long comparacoesSelectionSort;
	static long comparacoesInsertionSort;
	static long comparacoesQuickSort;
	static long comparacoesMergeSort;
	static long comparacoesRadixSort;
	static long comparacoesHeapSort;
	static long comparacoesBucketSort;

	private int[] numbers;
	private int number;
	VetoresClass vetores;

	/**
	 * cria um vetor novo com elementos de outro vetor
	 * 
	 * @param array --> vetor a ser copiado
	 * @return --> novo array
	 */
	public int[] obterVetor(int array[]) {
		int[] novoArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			novoArray[i] = array[i];
		}

		return novoArray;
	}

	public final int[] ordenacaoBublesort(int[] arrayParam1) {
		int array[] = obterVetor(arrayParam1);

		comparacoesBubleSort = 0;
		int aux = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
					comparacoesBubleSort++;
				}
			}
		}
		return array;
	}

	public final int[] ordenacaoSelectionSort(int[] arrayParam2) {
		int array[] = obterVetor(arrayParam2);
		comparacoesSelectionSort = 0;
		for (int i = 0; i < array.length; i++) {
			int i_menor = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[i_menor])
					i_menor = j;
			int aux = array[i];
			array[i] = array[i_menor];
			array[i_menor] = aux;
			comparacoesSelectionSort++;
		}
		return array;
	}

	public final int[] ordenacaoInsertionSort(int[] arrayParam3) {
		int array[] = obterVetor(arrayParam3);
		comparacoesInsertionSort = 0;
		for (int i = 1; i < array.length; i++) {

			int j = i;

			while (j > 0 && array[j] < array[j - 1]) {
				int aux = array[j];
				array[j] = array[j - 1];
				array[j - 1] = aux;
				j -= 1;
				comparacoesInsertionSort++;
			}
		}
		return array;
	}

	public final void ordenacaoHeapSort(int[] arrayParam4) {
		int array[] = obterVetor(arrayParam4);
		comparacoesHeapSort = 0;
		int tamanho = array.length;
		int i = tamanho / 2, pai, filho, t;

		while (true) {
			if (i > 0) {
				i--;
				t = array[i];
				comparacoesHeapSort++;
			} else {
				tamanho--;
				if (tamanho <= 0) {
					return;
				}
				t = array[tamanho];
				array[tamanho] = array[0];
			}
			pai = i;
			filho = ((i * 2) + 1);
			while (filho < tamanho) {
				if ((filho + 1 < tamanho) && (array[filho + 1] > array[filho])) {
					filho++;
					comparacoesHeapSort++;
				}
				if (array[filho] > t) {
					array[pai] = array[filho];
					pai = filho;
					filho = pai * 2 + 1;
					comparacoesHeapSort++;
				} else {
					break;
				}

			}
			array[pai] = t;

		}

	}

	public final void ordenacaoMergeSort(int[] arrayParam9, int n) {
		int array[] = obterVetor(arrayParam9);
		comparacoesMergeSort = 0;

		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = array[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = array[i];
			comparacoesMergeSort++;
		}
		ordenacaoMergeSort(l, mid);
		ordenacaoMergeSort(r, n - mid);

		merge(array, l, r, mid, n - mid);
	}

	public final void merge(int[] array, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				array[k++] = l[i++];
			} else {
				array[k++] = r[j++];
			}
		}
		while (i < left) {
			array[k++] = l[i++];
			comparacoesMergeSort++;
		}
		while (j < right) {
			array[k++] = r[j++];
			comparacoesMergeSort++;
		}
	}

	public final void qordenacaoQuickSort(int[] array, int inicio, int fim) {
		if (inicio < fim) {
			comparacoesQuickSort++;
			int posicaoPivo = separarOrdenacaoQuickSort(array, inicio, fim);
			qordenacaoQuickSort(array, inicio, posicaoPivo - 1);
			qordenacaoQuickSort(array, posicaoPivo + 1, fim);
		}
	}

	private final int separarOrdenacaoQuickSort(int[] array, int inicio, int fim) {
		int pivo = array[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			comparacoesQuickSort++;
			if (array[i] <= pivo) {
				i++;
				comparacoesQuickSort++;
			} else if (pivo < array[f]) {
				f--;
				comparacoesQuickSort++;
			} else {
				int troca = array[i];
				array[i] = array[f];
				array[f] = troca;
				i++;
				f--;
				comparacoesQuickSort++;
			}
		}
		array[inicio] = array[f];
		array[f] = pivo;
		return f;
	}

	public final void ordenacaoRadixSort(int arrayParam5[]) {
		int totalComparacoes;
		int[] array = obterVetor(arrayParam5);
		comparacoesRadixSort = 0;
		for (int digit = 0; digit < 3; digit++) {
			int power = (int) Math.pow(10, digit + 1);
			comparacoesRadixSort++;
			int z[][] = new int[array.length][10];
			int n[] = new int[10];

			for (int i = 0; i < array.length; i++) {
				int num = array[i];
				z[n[(num % power) / (power / 10)]][(num % power) / (power / 10)] = num;
				n[(num % power) / (power / 10)]++;
				comparacoesRadixSort++;

			}
			int c = 0;
			for (int i = 0; i < 10; i++) {

				for (int j = 0; j < array.length; j++) {
					if (j < n[i]) {
						array[c] = z[j][i];
						c++;
						comparacoesRadixSort++;
					} else {
						break;
					}
				}
			}

		}
	}

	public final void ordenacaoBucketSort(int[] arrayParam6) {
		comparacoesBucketSort = 0;
		int[] array = obterVetor(arrayParam6);

		int max = array[0];
		int min = array[0];

		// Find the maximim and minimum integers in the array.
		for (int index = 0; index < array.length; index++) {
			if (array[index] > max)
				max = array[index];
			comparacoesBucketSort++;
			if (array[index] < min)
				min = array[index];
			comparacoesBucketSort++;
		}

		int[] buckets = new int[(max - min) + 1];

		// Initialize each bucket with the values of the array.
		for (int index = 0; index < array.length; index++) {
			buckets[array[index] - min]++;
			comparacoesBucketSort++;
		}

		int pointer = 0;

		// Dump the bucket values into the array.
		for (int index = 0; index < array.length; index++) {
			if (buckets[pointer] != 0) {
				array[index] = pointer + min;
				buckets[pointer]--;
				comparacoesBucketSort++;
			} else {
				index--;
				pointer++;
				comparacoesBucketSort++;
			}
		}

	}

	public final void ordenacaoQuickSort(int[] arrayParam7) {
		int[] array = obterVetor(arrayParam7);

		if (array == null || array.length == 0) {
			return;
		}

		this.numbers = array;
		number = array.length;
		quicksort(0, number - 1);
	}

	private void quicksort(int low, int high) {
		int i = low, j = high;
		int pivot = numbers[low + (high - low) / 2];

		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;
			}

			while (numbers[j] > pivot) {
				j--;
			}

			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	public void ordenacaoCountSort(int[] arrayParam8) {
		int[] array = obterVetor(arrayParam8);
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		int[] temp = new int[max + 1];
		for (int i = 0; i < array.length; i++) {
			temp[array[i]] = temp[array[i]] + 1;
		}
		int indice = 0;
		for (int i = 0; i < temp.length; i++) {
			while (temp[i] > 0) {
				array[indice] = i;
				indice++;
				temp[i]--;
			}

		}

	}

}
