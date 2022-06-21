package arrays;

import java.util.Arrays;

public class Exercicio {

  public static void main(String[] args) {

    double[] notasAlunoA = new double[4];

    notasAlunoA[0] = 7.9;
    notasAlunoA[1] = 8;
    notasAlunoA[2] = 6.7;
    notasAlunoA[3] = 9.7;

    Arrays.toString(notasAlunoA);
    // ou
    System.out.println(Arrays.toString(notasAlunoA));

    // Como percorrer o array
    double totalAlunoA = 0;
    for (int i = 0; i < notasAlunoA.length; i++) {
      totalAlunoA += notasAlunoA[i];
    }

    System.out.println(totalAlunoA / notasAlunoA.length);

    // Outra forma para inicializar um array
    final double notaArmazenada = 5.9;
    double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};

    double totalAlunoB = 0;
    for (int i = 0; i < notasAlunoB.length; i++)
    {
      totalAlunoB += notasAlunoB[i];
    }

    System.out.println(totalAlunoB / notasAlunoB.length);
  }
}
