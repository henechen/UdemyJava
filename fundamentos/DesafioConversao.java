package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário: ");
		Double salario1 = Double.parseDouble(input.nextLine().replaceAll(",", "."));
		
		System.out.print("\nInforme o segundo salário: ");
		Double salario2 = Double.parseDouble(input.nextLine().replaceAll(",", "."));
		
		System.out.print("\nInforme o terceiro salário: ");
		Double salario3 = Double.parseDouble(input.nextLine().replaceAll(",", "."));
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A média dos salários é: " + media);
		
		input.close();
	}
}
