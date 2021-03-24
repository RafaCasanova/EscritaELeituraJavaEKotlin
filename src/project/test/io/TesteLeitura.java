package project.test.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
	
	public static void main(String[] args)/*caso nao faça o try/catch, colocar o IOException aqui */{
		//fluxo de entrada de arquivo. 
		try {	
			FileInputStream fis = new FileInputStream("lorem.txt");//Faz a entrada do arquivo mas de forma binaria
			//InputStreamReader isr = new InputStreamReader(fis,"UTF-8"); //Faz a leitura dos caracteres do arquivos
			//Não e preciso a aplica o utf-8 se estiver configurado

			BufferedReader br = new BufferedReader(new InputStreamReader(fis));//apos a leitura dos caracteres, transforma em texto.
			
			String linha = br.readLine();
			while (linha != null) {
				System.out.print(linha);
				System.out.println();
				linha = br.readLine();
			}
			
			br.close();
				
			}catch	(IOException e){ //nescessario fazer o tratamento de erro lidando com arquivos
			System.out.println("Erro ao tentar ler o arquivo");
		}
		
		
		
		
		
		
		
	}
}
