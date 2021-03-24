package project.test.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	
	public static void main(String[] args) throws IOException {
		
		OutputStream ops = new FileOutputStream("testeEscrita1.txt");
		Writer ows = new OutputStreamWriter(ops,"UTF-8");
		//Não e preciso a aplica o utf-8 se estiver configurado

		BufferedWriter bw = new BufferedWriter(ows);
		
		bw.write("Primeiro teste de escrita com Java!");
		bw.newLine();
		bw.write("Salvar arquivo e fazer leitura.");
		
		bw.close();
		
		
		
		
		
		
		
	}

}
