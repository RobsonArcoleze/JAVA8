package br.com.Robson.java.io.exercicio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteEntrada {

	public static void main(String[] args) throws IOException {
		
		//TESTTANDO A ENTRADA DE UM ARQUIVO
		
		FileInputStream fip = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fip);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha =br.readLine();
		}
		System.out.println(linha);
		br.close();
		

	}

}
