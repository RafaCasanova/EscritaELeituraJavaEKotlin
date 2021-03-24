package project.test.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WriterAltoNivel {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter ps = new PrintWriter("textcomprint.txt","UTF-8");
		//Não e preciso a aplica o utf-8 se estiver configurado
		ps.println("Testando o PrintWriter");
		ps.println();
		ps.print("guardando aquivo!");
		
		ps.close();
	}

}
