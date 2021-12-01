package br.com.anhembimorumbi.aps.principal;

public class Principal {

	public static void main(String[] args) {
		VetoresClass vetores = new VetoresClass();
		MedidoresEstudo estudo = new MedidoresEstudo();

		System.out.println("b" + vetores.vetor5[0][0]);
		estudo.executaOrdenacoesVetores(vetores.vetor10000, 1);
		estudo.executaOrdenacoesVetores(vetores.vetor10000, 2);
		estudo.executaOrdenacoesVetores(vetores.vetor10000, 3);
		estudo.executaOrdenacoesVetores(vetores.vetor10000, 4);
		estudo.executaOrdenacoesVetores(vetores.vetor10000, 5);
		estudo.executaOrdenacoesVetores(vetores.vetor10000, 6);
		estudo.executaOrdenacoesVetores(vetores.vetor10000, 7);
	//	estudo.executaOrdenacoesVetores(vetores.vetor10, 8);
		System.out.println("a" + vetores.vetor5[0][0]);

//		System.out.println("------ Total de comparações ------");
//		System.out.println("Buble Sort: " + new OrdenacaoClass().comparacoesBubleSort);
//		System.out.println("Insertin Sort: " + new OrdenacaoClass().comparacoesInsertionSort);
//		System.out.println("Selection Sort: " + new OrdenacaoClass().comparacoesSelectionSort);
//		System.out.println("Quick Sort: " + new OrdenacaoClass().comparacoesQuickSort);
////		System.out.println(""+);
////		System.out.println(""+);

//		System.out.println(vetores.vetor5[0][0]);
//		estudo.selecionaTipo(8, vetores.separaVetores1(vetores.vetor5));
//		System.out.println(vetores.vetor5[0][0]);
		
		estudo.imprimeComparacoes();

	}
}