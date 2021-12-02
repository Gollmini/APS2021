package br.com.anhembimorumbi.aps.principal;

public class Principal {

	public static void main(String[] args) {
		VetoresClass vetores = new VetoresClass();
		MedidoresEstudo estudo = new MedidoresEstudo();

		estudo.executaOrdenacoesVetores(vetores.vetor10000, 1);
		estudo.executaOrdenacoesVetores(vetores.vetor10000, 2);
		estudo.executaOrdenacoesVetores(vetores.vetor10000, 3);
		estudo.executaOrdenacoesVetores(vetores.vetor10000, 4);
		estudo.executaOrdenacoesVetores(vetores.vetor10000, 5);
		estudo.executaOrdenacoesVetores(vetores.vetor10000, 6);
		estudo.executaOrdenacoesVetores(vetores.vetor10000, 7);

		estudo.imprimeComparacoes();

	}
}