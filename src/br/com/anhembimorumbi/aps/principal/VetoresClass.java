package br.com.anhembimorumbi.aps.principal;

import java.util.Random;

public class VetoresClass {
	final int [][] vetor5;
	
	
	public VetoresClass(){
		vetor5 = geradorArrayAletorio(50, 5);
		final int [][] vetor10 = geradorArrayAletorio(50, 10);
	}

	private int[][] geradorArrayAletorio(int tamanhoLinhas, int tamanhoColunas) {
		int vetorNovo[][] = new int[tamanhoLinhas][tamanhoColunas];

		for (int i = 0; i < vetorNovo.length; i++) {

			for (int j = 0; j < vetorNovo[i].length; j++) {
				vetorNovo[i][j] = new Random().nextInt(255);
				// System.out.println(vetorNovo[i][j]);

			}
		}
		return vetorNovo;

	}

	public int[] separaVetores(int[][] arrayArray) {
		int[] array = null;
		int numeroVetor = 0;
		for (int m = 0; m < arrayArray.length; m++) {
			System.out.println("Iniciada a leitura do vetor: " + ++numeroVetor);
			array = arrayArray[m];
			System.out.println("Contem: " + array.length + " elementos");
			System.out.println(" ");

		}
		final int arrayC[] = array;
		return arrayC;
	}

	public void imprimirVetores(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void cinquentaVetores() {
		for (int i = 0; i < 50; i++) {

		}

	}

}
