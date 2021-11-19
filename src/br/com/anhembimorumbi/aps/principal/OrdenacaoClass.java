package br.com.anhembimorumbi.aps.principal;

import java.util.Arrays;

/**
 * 
 * @author Roger Felisbino
 * @Descricao Ordenar todos os vetores através de cada um dos métodos de
 *            ordenação propostos e contar o número de comparações entre os
 *            elementos em cada ordenação realizada.
 *
 */

/*
 * Bubble Sort, Selection Sort, Insertion Sort, Heap Sort, Merge Sort, Quick
 * Sort, Count Sort, Bucket Sort e Radix Sort
 */
public class OrdenacaoClass {
	static long comparacoes;

	public static int[] ordenacaoBublesort(int[] array) {
		comparacoes = 0;
		int aux = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
					comparacoes++;
				}
			}
		}
		return array;
	}

	public static int[] ordenacaoSelectionSort(int[] array) {
		comparacoes = 0;
		for (int i = 0; i < array.length; i++) {
			int i_menor = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[i_menor])
					i_menor = j;
			int aux = array[i];
			array[i] = array[i_menor];
			array[i_menor] = aux;
			comparacoes++;
		}
		return array;
	}

	public static int[] ordenacaoInsertionSort(int[] array) {
		comparacoes = 0;
		for (int i = 1; i < array.length; i++) {

			int j = i;

			while (j > 0 && array[j] < array[j - 1]) {
				int aux = array[j];
				array[j] = array[j - 1];
				array[j - 1] = aux;
				j -= 1;
				comparacoes++;
			}
		}
		return array;
	}

	public static void ordenacaoHeapSort(int[] array) {
		comparacoes = 0;

		int tamanho = array.length;
		int i = tamanho / 2, pai, filho, t;

		while (true) {
			if (i > 0) {
				i--;
				t = array[i];
				comparacoes++;
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
					comparacoes++;
				}
				if (array[filho] > t) {
					array[pai] = array[filho];
					pai = filho;
					filho = pai * 2 + 1;
					comparacoes++;
				} else {
					break;
				}

			}
			array[pai] = t;

		}

	}

	public static void ordenacaoMergeSort(int[] array, int n) {
		comparacoes = 0;

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
		}
		ordenacaoMergeSort(l, mid);
		ordenacaoMergeSort(r, n - mid);

		odenacaoMerge(array, l, r, mid, n - mid);
	}

	public static void odenacaoMerge(int[] array, int[] l, int[] r, int left, int right) {

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
		}
		while (j < right) {
			array[k++] = r[j++];
		}
	}

	public static void ordenacaoQuickSort(int[] array, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separarOrdenacaoQuickSort(array, inicio, fim);
			ordenacaoQuickSort(array, inicio, posicaoPivo - 1);
			ordenacaoQuickSort(array, posicaoPivo + 1, fim);
		}
	}

	private static int separarOrdenacaoQuickSort(int[] array, int inicio, int fim) {
		int pivo = array[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (array[i] <= pivo)
				i++;
			else if (pivo < array[f])
				f--;
			else {
				int troca = array[i];
				array[i] = array[f];
				array[f] = troca;
				i++;
				f--;
			}
		}
		array[inicio] = array[f];
		array[f] = pivo;
		return f;
	}

	public void ordenacaoRadixSort(int array[]) {
		comparacoes = 0;
		for (int digit = 0; digit < 3; digit++) {
			int power = (int) Math.pow(10, digit + 1);

			int z[][] = new int[array.length][10];
			int n[] = new int[10];

			for (int i = 0; i < array.length; i++) {
				int num = array[i];
				z[n[(num % power) / (power / 10)]][(num % power) / (power / 10)] = num;
				n[(num % power) / (power / 10)]++;

			}
			int c = 0;
			for (int i = 0; i < 10; i++) {

				for (int j = 0; j < array.length; j++) {
					if (j < n[i]) {
						array[c] = z[j][i];
						c++;
					} else {
						break;
					}
				}
			}

		}
	}

	public static void ordenacaoBucketSort(int[] array, int max) {
		comparacoes = 0;
		int[] bucket = new int[max + 1];

		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}

		for (int i = 0; i < array.length; i++) {
			bucket[array[i]]++;
		}

		int x = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				array[x++] = i;
			}
		}
	}
}
