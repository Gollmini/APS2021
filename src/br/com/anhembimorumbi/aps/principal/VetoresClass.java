package br.com.anhembimorumbi.aps.principal;

import java.util.Random;

public class VetoresClass {

	final int[][] vetor5 = geradorArrayAletorio(50, 5);
	final int[][] vetor10 = geradorArrayAletorio(50, 10);
	final int[][] vetor100 = geradorArrayAletorio(50, 100);
	final int[][] vetor1000 = geradorArrayAletorio(50, 1000);
	final int[][] vetor10000 = geradorArrayAletorio(50, 10000);

	private int[][] geradorArrayAletorio(int tamanhoLinhas, int tamanhoColunas) {
		int vetorNovo[][] = new int[tamanhoLinhas][tamanhoColunas];

		for (int i = 0; i < vetorNovo.length; i++) {

			for (int j = 0; j < vetorNovo[i].length; j++) {
				vetorNovo[i][j] = new Random().nextInt(255);
			}
		}
		return vetorNovo;
	}

	public int[] copiaVetor(int array[]) {
		int[] novoArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			novoArray[i] = array[i];
		}
		return novoArray;
	}

	public final int[] separaVetores1(int[][] arrayArray) {
		int[] array = null;
		for (int m = 0; m < arrayArray.length; m++) {
			array = arrayArray[m];
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
			OrdenacaoClass ordenacao = new OrdenacaoClass();
			int arrayOrdenado[] = ordenacao.ordenacaoBublesort(array);
			int posicao = 0;
			for (int h = 0; h < arrayOrdenado.length; h++) {

				System.out.println(
						"Vetor ordenado: " + numeroVetor + " Posicao: " + posicao++ + " Elemento: " + arrayOrdenado[h]);
			}
		}
		final int arrayC[] = array;
		return arrayC;
	}
}
