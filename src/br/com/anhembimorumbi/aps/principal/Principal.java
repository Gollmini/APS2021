package br.com.anhembimorumbi.aps.principal;

public class Principal {

	public static void main(String[] args) {

		VetoresClass vetores = new VetoresClass();

		MedidoresEstudo medidoresEstudo = new MedidoresEstudo();

		// medidoresEstudo.selecionaTipo(1, );

		medidoresEstudo.medeTempo(1, vetores.preparaVetor(vetores.vetor10));
	//	medidoresEstudo.medeTempo(2, vetores.preparaVetor(vetores.vetor10));
		medidoresEstudo.medeTempo(3, vetores.preparaVetor(vetores.vetor10));
		medidoresEstudo.medeTempo(4, vetores.preparaVetor(vetores.vetor10));
		medidoresEstudo.medeTempo(5, vetores.preparaVetor(vetores.vetor10));
		medidoresEstudo.medeTempo(6, vetores.preparaVetor(vetores.vetor10));
		medidoresEstudo.medeTempo(7, vetores.preparaVetor(vetores.vetor10));
		medidoresEstudo.medeTempo(8, vetores.preparaVetor(vetores.vetor10));
		
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
	}
}