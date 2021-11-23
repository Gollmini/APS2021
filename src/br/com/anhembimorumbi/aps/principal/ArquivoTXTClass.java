package br.com.anhembimorumbi.aps.principal;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class ArquivoTXTClass {

	public static void gravarEmArquivo(String texto) {
		try {

			FileWriter fileWriter = new FileWriter("C:\\..\\arquivo6667772.txt");
			PrintWriter p = new PrintWriter(fileWriter);
			p.printf(texto);
		} catch (Exception exc) {
			System.out.println(exc.getCause());
		}

	}

	public static void escrever(String linha) {

		try {

			OutputStream outputStream = new FileOutputStream("C:\\Users\\Ale Roberto\\Desktop\\arq.txt"); 

			Writer writer = new OutputStreamWriter(outputStream); 
			BufferedWriter bufferWriter = new BufferedWriter(writer); 

			
			bufferWriter.write(linha);
			bufferWriter.newLine();
			
			bufferWriter.close();
		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
