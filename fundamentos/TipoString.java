package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Salve";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("Sal"));
		System.out.println(s.endsWith("ve"));
		System.out.println(s.length());
		
		
		var nome = "Hene";
		var sobrenome = "Chen";
		var idade = 25;
		var salario = 12345.987;
		
		System.out.printf("O senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
	}
}
