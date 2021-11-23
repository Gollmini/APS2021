package br.com.anhembimorumbi.aps.principal;

import java.util.Random;

public class VetoresClass {

//	public static int[][] tamanhoArray = new int[][]{ 5, 10, 50, 100, 1000, 10000 }{5,20};
	public static int[][] vetor;// = new int [] [];
	public static int[] vetorTamanho1000;
	public static int[] vetorTamanho10000;

	public static int[][] geradorArrayAletorio(int tamanhoLinhas, int tamanhoColunas) {

		int[][] vetorNovo = new int[tamanhoLinhas][tamanhoColunas];

		for (int i = 0; i < vetorNovo[i].length; i++) {
			vetorNovo[i][i] = new Random().nextInt(255);

			for (int j = 0; j < vetorNovo[j].length; j++) {
				vetorNovo[i][j] = new Random().nextInt(255);

			}
		}
		return vetorNovo;

	}

	public static void imprimirVetores(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void cinquentaVetores() {
		for (int i = 0; i < 50; i++) {

		}

	}

}
