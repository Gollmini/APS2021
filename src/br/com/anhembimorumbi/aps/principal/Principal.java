package br.com.anhembimorumbi.aps.principal;

import java.util.Scanner;

public class Principal {

	@SuppressWarnings("static-access")
	static void recebeCodidoeExecut(int[] tamanhoVetor, int codigo) {
		for (int i = 0; i < tamanhoVetor.length; i++) {
			final int vetor[] = new VetoresClass().geradorArrayAletorio(tamanhoVetor[i]);
			Estudo e = new Estudo();

			System.out.println("Tempo de execucao: " + e.medicaoExecucao(codigo, vetor));
			System.out.println("Tamanho do vetor: " + tamanhoVetor[i]);
			System.out.println("Total de comparacoes: " + new OrdenacaoClass().comparacoes);

			System.out.println("                   ");

		}
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tamanhoVetor[] = { 5, 10, 100, 1000, 10000, 100000, 2 };

		System.out.println("digite o codigo correspondente:");
		int codigo = scanner.nextInt();
		recebeCodidoeExecut(tamanhoVetor, codigo);
		scanner.close();

		// Codigo == 1 Ordenacao Buble Sort
		// Codigo == 2 Ordenacao Bucket Sort
		// Codigo == 3 Ordenacao Selection Sort
		// Codigo == 4 Ordenacao Merge Sort
		// Codigo == 5 Ordenacao Heap Sort
		// codigo == 6 Ordenacao Insertion Sort
		// codigo == 7 Ordenacao Radix Sort
		// codigo == 8 Ordenacao Quick Sort

	}

}
