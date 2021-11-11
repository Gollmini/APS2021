package br.com.anhembimorumbi.aps.principal;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		final int array[] = new VetoresClass().geradorArrayAletorio(5);

		System.out.println("array orginal");
		new VetoresClass().imprimirVetores(array);

	}

}
 