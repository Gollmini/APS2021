package br.com.anhembimorumbi.aps.principal;

public class Principal {

	@SuppressWarnings("static-access")
	static
	void recebeCodidoeExecut(int[] tamanhoVetor, int codigo) {
		for (int i = 0; i < tamanhoVetor.length; i++) {
			final int vetor[] = new VetoresClass().geradorArrayAletorio(tamanhoVetor[i]);
			Estudo e = new Estudo();
			System.out.println(tamanhoVetor[i]);
			System.out.println(e.medicaoExecucao(codigo, vetor));

		}
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		
		int tamanhoVetor[] = { 5, 10, 100, 1000, 10000, 100000 };
		//Buble Sort
		recebeCodidoeExecut(tamanhoVetor, 1);
		
		//BucketSort
		recebeCodidoeExecut(tamanhoVetor, 2);
		
	}

}
