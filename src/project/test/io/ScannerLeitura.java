package project.test.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerLeitura{
	
	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner scan = new Scanner(new File("lorem.txt"),"UTF-8");
		
		while(scan.hasNext()) {
			var linha = scan.nextLine();
			System.out.println(linha);
		}
	
	scan.close();
	
	}	
}
