package project.test.io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
public class TesteCopiaDeArquivo {
	public static void main(String[] args) throws IOException {
							//caso queira pegar a entrada do teclado
							//colocariamos System.in;
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
							//caso queira sair no terminal
							//colocariamos System.out;
		OutputStream fos = new FileOutputStream("copia.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		String linha = br.readLine();
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			//bw.flush();//Sai direto no terminal
			linha = br.readLine();	
		}
	
		
		bw.close();
		br.close();
	}

}
