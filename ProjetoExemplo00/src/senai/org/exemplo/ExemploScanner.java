package senai.org.exemplo;
import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		
		String nome = myObj.nextLine();
		System.out.println("Bem vindo: "+nome);
		myObj.close();
	}

}
