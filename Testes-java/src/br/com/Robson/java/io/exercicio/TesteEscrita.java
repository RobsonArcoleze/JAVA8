package br.com.Robson.java.io.exercicio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		
		
		//FLUXO DE ESCRITA COM ARQUIVO
		
		OutputStream os = new FileOutputStream("lorem2.txt");
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(wr);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod \r\n"
				+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
		bw.newLine();
		bw.newLine();
		
		bw.write("Minha String de teste");
		
		bw.close();
	}

}
