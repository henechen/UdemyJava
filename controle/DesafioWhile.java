package controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        //Calcular média nota turma X alunos
        //User digita nota válida
        //Armazenar valor em "TOTAL"
        //Sempre que uma nota for adicionada ela vai somar ao "TOTAL"
        //Variável que decida quantas notas digitadas foram válidas
        //Gerar soma de notas válidas
        //Usar while? quando digitar "-1" ele para o programa

        Scanner input = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1) {
            System.out.print("Informe a nota: ");
            nota = input.nextDouble();

            if(nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;
            } else if(nota != -1) {
                System.out.println("Nota inválida!");
            }
        }

        double media = total / quantidadeDeNotas;
        System.out.println("Média = " + media);

        input.close();
    }
}
