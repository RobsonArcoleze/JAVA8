package br.com.Robson.java.io.exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;


public class TesteSocket {

      public static void main(String[] args) throws IOException {

              //Fluxo de Copia de arquivo com Arquivo
    	  

          //Fluxo de Copia de arquivo com Arquivo
	  
			/*
			 * A comunicação via rede se dá de forma análoga ao telefone, na parte em que
			 * ouvimos, seria localizado o OutputStream, enquanto que a extremidade por onde
			 * falamos pode ser considerada como a InputStream. O telefone, no caso do nosso
			 * código, se chama Socket.
			 */
	  
	  	  Socket s = new Socket();

    	  
              InputStream fis = s.getInputStream();
              Reader isr = new InputStreamReader(fis);
              BufferedReader br = new BufferedReader(isr);

              OutputStream fos = s.getOutputStream();
              Writer osw = new OutputStreamWriter(fos);
              BufferedWriter bw = new BufferedWriter(osw);

              String linha = br.readLine();

              while(linha != null) {
                  bw.write(linha);
                  bw.newLine();
                  bw.flush();
                  linha = br.readLine();
              }

              bw.close();
              br.close();
              s.close();
      }
}
