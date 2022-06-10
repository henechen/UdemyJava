package controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.print("Quer sair? ");
            text = input.nextLine();
        } while (!text.equalsIgnoreCase("Por favor"));

        System.out.println("Obrigado!");
        input.close();
    }
}
