import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Variavel para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		String officeDesk = "Office Desk";
		String computer = "Computer";
		String nome;
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double messure = 53.234567;
				
/*			
		System.out.println("Products");
		System.out.printf("%s, which price is $ %.2f%n", computer, price1);
		System.out.printf("%s, which price is $ %.2f%n%n", officeDesk, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", messure);
		System.out.printf("Rouded (three decimal places: %.3f%n", messure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", messure);
*/		
		// para passar o valor de uma variavel para outra, sendo elas de tipos diferentes
		code = (int) price1;
		
		// Para pegar numero inteiro
		age = sc.nextInt();
		if (age >= 30) {		// testando o if
			System.out.println("Sua Idade: " + age);
			sc.nextLine(); // para limpar o buffer se voce for ler uma outra linha depois
		}
//		System.out.println(code);

		nome = sc.next(); // le só a primeira palavra digitada
		System.out.println("Seu nome é: " + nome);

		nome = sc.nextLine(); // le a frase toda
		System.out.println("Seu nome é: " + nome);	
		sc.close();
		
		switch (age) {
		case 18:
			System.out.println("Menor de idade");
			break;
		case 30:
			System.out.println("Adulto");
			break;
		case 65:
			System.out.println("Idoso");
			break;
		
		}
		
		
		
	}

}
