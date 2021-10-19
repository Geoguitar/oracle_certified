import java.util.Scanner;

public class LendoDadosDoTeclado {
	public static void main (String[]args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite um numero inteiro:  ");
	//Aguarde o usuario digitar um numero inteiro
	int inteiro = scanner.nextInt();
	System.out.println("Inteiro digitado: " + inteiro);

	System.out.println("Digite um numero decimal:  ");
	double decimal = scanner.nextDouble();
	System.out.println("Decimal digitado: " + decimal);

	System.out.println("Digite seu nome:  ");
	String nome = scanner.next();
	System.out.println("Nome fornecido: " + nome);

	}
}

	

