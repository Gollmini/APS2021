package br.com.anhembimorumbi.aps.principal;

public class Principal {

	public static void main(String[] args) {
		VetoresClass vetores = new VetoresClass();
		MedidoresEstudo estudo = new MedidoresEstudo();
//
//		OrdenacaoClass ordenacao = new  OrdenacaoClass();
//		//ordenacao.vetores.vetor5;
		System.out.println(vetores.vetor5[0][0]);
		estudo.selecionaTipo(1, vetores.separaVetores1(vetores.vetor5));
		System.out.println(vetores.vetor5[0][0]);
		
//		System.out.println(vetores.vetor5[0][0]);
//		estudo.selecionaTipo(8, vetores.separaVetores1(vetores.vetor5));
//		System.out.println(vetores.vetor5[0][0]);

	}
}