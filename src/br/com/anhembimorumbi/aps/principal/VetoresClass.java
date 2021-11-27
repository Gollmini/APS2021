package br.com.anhembimorumbi.aps.principal;

import java.util.Random;

public class VetoresClass {
	final int[][] vetor5;
	final int[][] vetor10;
	final int[][] vetor100;
	final int[][] vetor1000;
	final int[][] vetor10000;

	public VetoresClass() {
		vetor5 = geradorArrayAletorio(50, 5);
		vetor10 = geradorArrayAletorio(50, 10);
		vetor100 = geradorArrayAletorio(50, 100);
		vetor1000 = geradorArrayAletorio(50, 1000);
		vetor10000 = geradorArrayAletorio(50, 10000);
	}

	private int[][] geradorArrayAletorio(int tamanhoLinhas, int tamanhoColunas) {
		int vetorNovo[][] = new int[tamanhoLinhas][tamanhoColunas];

		for (int i = 0; i < vetorNovo.length; i++) {

			for (int j = 0; j < vetorNovo[i].length; j++) {
				vetorNovo[i][j] = new Random().nextInt(255);

			}
		}
		return vetorNovo;

	}

	/**
	 * Separa vetores para o metodo de ordenacao poder trabalhar com cada vetor ;;
	 * Imprime o numero do vetor, a quantidade de elementos, a posicao e o conteudo (elemento)
	 * @param arrayArray --> um vetor de Vetores a ser separado 
	 * @return array --> vetor de inteiros para passagem aos métodos de ordenacao
	 */
	public int[] separaImprimeNumeroPosicaoElemento(int[][] arrayArray) {
		int[] array = null;
		int numeroVetor = 0;
		for (int m = 0; m < arrayArray.length; m++) {
			System.out.println("Iniciada a leitura do vetor: " + ++numeroVetor);
			array = arrayArray[m];
			System.out.println("Contem: " + array.length + " elementos");
			int posicao = 0;
			for (int h = 0; h < array.length; h++) {

				System.out.println("Vetordesordenado : " + numeroVetor + " Posicao: " + posicao++ + " Elemento: " + array[h]);
			}

		}
		final int arrayC[] = array;
		return arrayC;
	}

	
	public final int[] separaVetores1(int[][] arrayArray) {
		int[] array = null;
		int numeroVetor = 0;
		for (int m = 0; m < arrayArray.length; m++) {
			System.out.println("Iniciada a leitura do vetor: " + ++numeroVetor);
			array = arrayArray[m];
			new OrdenacaoClass();
			int arrayOrdenado[] = OrdenacaoClass.ordenacaoBublesort(array);
			int posicao = 0;
			for (int h = 0; h < arrayOrdenado.length; h++) {

				System.out
						.println("Vetor ordenado: " + numeroVetor + " Posicao: " + posicao++ + " Elemento: " + arrayOrdenado[h]);
			}

		}
		final int arrayC[] = array;
		return arrayC;
	}
	
	public final int[] executaOrdenacaoMedeTempo(int[][] arrayArray) {
		int[] array = null;
		int numeroVetor = 0;
		for (int m = 0; m < arrayArray.length; m++) {
			System.out.println("Iniciada a leitura do vetor: " + ++numeroVetor);
			array = arrayArray[m];
			new OrdenacaoClass();
			int arrayOrdenado[] = OrdenacaoClass.ordenacaoBublesort(array);
			int posicao = 0;
			for (int h = 0; h < arrayOrdenado.length; h++) {

				System.out
						.println("Vetor ordenado: " + numeroVetor + " Posicao: " + posicao++ + " Elemento: " + arrayOrdenado[h]);
			}

		}
		final int arrayC[] = array;
		return arrayC;
	}

	public void imprimirVetores(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
