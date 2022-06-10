package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Objetivo: Pegar argumentos ou do terminal ou do JOptionPane
		// Ler o número 1
		// Ler o número 2
		// Perguntar ao usuário qual operação ele deseja realizar (+ - * / %)
		// Entregar o resultado
		
		Scanner input = new Scanner(System.in);
		
		String valor1 = JOptionPane.showInputDialog("Insira o primeiro valor");
		double numero1 = Double.parseDouble(valor1);
		
		String valor2 = JOptionPane.showInputDialog("Insira o segundo valor");
		double numero2 = Double.parseDouble(valor2);
		
		String operacao = JOptionPane.showInputDialog("Informe a operação que deseja realizar");
		
		String resultado = "";
		
		boolean somar = operacao.equals("+");
		resultado = somar ? Double.toString(numero1 + numero2) : resultado;
		
		boolean subtrair = operacao.equals("-");
		resultado = subtrair ? Double.toString(numero1 - numero2) : resultado;
		
		boolean multiplicar = operacao.equals("*");
		resultado = multiplicar ? Double.toString(numero1 * numero2) : resultado;
		
		boolean modular = operacao.equals("%");
		resultado = modular ? Double.toString(numero1 % numero2) : resultado;
		
		JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
		
		input.close();
	}
}
