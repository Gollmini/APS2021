package br.com.anhembimorumbi.aps.principal;

/**
 * 
 * @author Roger Felisbino
 * @Descricao: Estudo comparativo entre os algoritmos de ordenação
 */

public class Principal {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		final int array[] = new VetoresClass().geradorArrayAletorio(10);

		System.out.println("array orginal");
		new VetoresClass().imprimirVetores(array);

		System.out.println("array ordenado");
		new OrdenacaoClass().ordenacaoBucketSort(array, array.length);
		new VetoresClass().imprimirVetores(array);

	}

}
