package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos: ");
        int quantidadeAlunos = input.nextInt();

        System.out.print("Quantas notas por aluno: ");
        int quantidadeNotasAlunos = input.nextInt();

        double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotasAlunos];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++)
        {
            for (int n = 0; n < notasDaTurma[a].length; n++)
            {
               System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
               notasDaTurma[a][n] = input.nextDouble();
               total += notasDaTurma[a][n]; // total aqui será o valor da média da turma (todos os valores somados)
            }
        }

        double media = total / (quantidadeAlunos * quantidadeNotasAlunos); // aqui se faz o cálculo da média
        System.out.println("A média da turma é: " + media);

        for(double[] notasDoAluno: notasDaTurma)
        {
            System.out.println(Arrays.toString(notasDoAluno));
        }


        input.close();
    }
}
