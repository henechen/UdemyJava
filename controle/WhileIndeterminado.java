package controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String valor = "";
        while (!valor.equalsIgnoreCase("sair")) {
            System.out.print("Você diz: ");
            valor = input.nextLine();
        }

        input.close();
    }
}
