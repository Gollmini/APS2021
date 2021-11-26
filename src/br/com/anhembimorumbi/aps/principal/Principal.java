package br.com.anhembimorumbi.aps.principal;

public class Principal {

	public static final void exec() {

		VetoresClass v = new VetoresClass();
		for (int w = 0; w < 100; w++) {
			int array[] = v.separaVetores(v.vetor100);

			Estudo.medicaoExecucao(1, array);
		}

	}

	public static void main(String[] args) {

		new Principal().exec();

//		
//		v.imprimirVetores(array);
//		
//		int [] arrayOrdenado = new OrdenacaoClass().ordenacaoBublesort(array);
//		v.imprimirVetores(arrayOrdenado);
//
//		int array2[] = v.separaVetores(v.vetor5);
//		v.imprimirVetores(array2);
//		
//		
//		
//		

//		VetoresClass vetoresClass = new VetoresClass();
//		int[][] vetores = vetoresClass.geradorArrayAletorio(50, 5);
//
//		int[] umVetor = vetoresClass.separaVetores(vetores);
//		vetoresClass.imprimirVetores(umVetor);
//		System.out.println(umVetor);
//
//		new OrdenacaoClass().ordenacaoRadixSort(umVetor);
//		vetoresClass.imprimirVetores(umVetor);
//		System.out.println(umVetor);

		// new OrdenacaoClass().ordenacaoBublesort(umVetor);

	}

	/*
	 * 
	 * Scanner scanner = new Scanner(System.in);
	 * 
	 * String menu = "		Codigo 1: Ordenacao Buble Sort\r\n" +
	 * "		Codigo 2: Ordenacao Bucket Sort\r\n" +
	 * "		Codigo 3: Ordenacao Selection Sort\r\n" +
	 * "		Codigo 4: Ordenacao Merge Sort\r\n" +
	 * "		Codigo 5: Ordenacao Heap Sort\r\n" +
	 * "		Codigo 6: Ordenacao Insertion Sort\r\n" +
	 * "		Codigo 7: Ordenacao Radix Sort\r\n" +
	 * "		Codigo 8: Ordenacao Quick Sort";
	 * 
	 * System.out.println(menu);
	 * 
	 * System.out.println("digite o codigo correspondente:"); int codigo =
	 * scanner.nextInt(); // recebeCodidoeExecut(tamanhoVetor, codigo);
	 * scanner.close();
	 */

	/*
	 * public static void recebeCodidoeExecut(int[] tamanhoVetor, int codigo) { for
	 * (int i = 0; i < tamanhoVetor.length; i++) { final int vetor[] = new
	 * VetoresClass().geradorArrayAletorio(tamanhoVetor[i]); Estudo e = new
	 * Estudo();
	 * 
	 * System.out.println("Tempo de execucao: " + e.medicaoExecucao(codigo, vetor));
	 * System.out.println("Tamanho do vetor: " + tamanhoVetor[i]);
	 * System.out.println("Total de comparacoes: " + new
	 * OrdenacaoClass().comparacoes);
	 * 
	 * System.out.println("                   ");
	 * 
	 * 
	 * }}
	 */

}
