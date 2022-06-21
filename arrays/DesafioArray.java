package arrays;

import java.util.Scanner;

public class DesafioArray {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // O usuário deverá informar quantas notas deseja adicionar
    // e a partir do informe, gerar um array na quantidade informada
    System.out.print("Informe quantas notas deseja adicionar: ");
    int notasAdicionar = input.nextInt();
    double[] arrayNotasAdicionar = new double[notasAdicionar];

    // Adicionar as notas ao array utilizando o for
    for (int i = 0; i < notasAdicionar; i++)
    {
    System.out.print("Informe a nota: ");
    // Aqui eu poderia colocar o input.nextDouble() na própria linha 22
    double nota = input.nextDouble();
    arrayNotasAdicionar[i] = nota;
    }

    // Utilizar o foreach para somar as notas adicionadas no array
    double somatoria = 0;
    for (double notas: arrayNotasAdicionar)
    {
      somatoria += notas;
    }

    // Calcular a média
    // eu poderia colocar o cálculo dentro do print
    // e eu preciso confirmar se há diferença entre o uso de .length no cálculo
    double resultado = somatoria / notasAdicionar;

    // Printar o resultado
    System.out.println("O resultado é: " + resultado);

    input.close();
  }
}
