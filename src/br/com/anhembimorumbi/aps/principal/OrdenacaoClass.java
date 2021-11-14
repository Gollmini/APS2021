package br.com.anhembimorumbi.aps.principal;


/**
 * 
 * @author Roger Felisbino
 * @Descricao Ordenar todos os vetores através de cada 
 * um dos métodos de ordenação propostos e contar o 
 * número de comparações entre os elementos em cada 
 * ordenação realizada.
 *
 */



/* Bubble Sort, Selection Sort, Insertion Sort, Heap Sort, 
* Merge Sort, Quick Sort, Count Sort, Bucket Sort e Radix Sort 
*/
public class OrdenacaoClass {
	

	public static int[] ordenacaoBublesort(int[] array) {
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

	public static int[] ordenacaoSelectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int i_menor = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[i_menor])
					i_menor = j;
			int aux = array[i];
			array[i] = array[i_menor];
			array[i_menor] = aux;

		}
		return array;
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

	public static int[] ordenacaoQuickSort(int[] array) {
		return array;
	}
	
	  public static void ordenacaoHeapSort(int[] vetor){
	        int tamanho = vetor.length;
	        int i = tamanho / 2, pai, filho, t;
	        while (true){
	            if (i > 0){
	                i--; t = vetor[i];
	            }else{
	                tamanho--;
	                if (tamanho <= 0) {return;}
	                t = vetor[tamanho];
	                vetor[tamanho] = vetor[0];
	            }
	            pai = i;
	            filho = ((i * 2) + 1);
	            while (filho < tamanho){
	                if ((filho + 1 < tamanho) && (vetor[filho + 1] > vetor[filho])) {filho++;}
	                if (vetor[filho] > t){
	                    vetor[pai] = vetor[filho];
	                    pai = filho;
	                    filho = pai * 2 + 1;
	                }else {break;}
	            }
	            vetor[pai] = t;
	        }
	    }

}
