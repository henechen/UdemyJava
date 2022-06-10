package controle;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma nota de 0 a 10: ");
        double nota = input.nextDouble();

        if(nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } else if(nota >= 8.1) {
            System.out.println("Conceito A");
        } else if(nota >= 6.1) {
            System.out.println("Conceito B");
        }

        input.close();
    }
}
