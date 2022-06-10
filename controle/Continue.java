package controle;

public class Continue {

  public static void main(String[] args) {

      // Linha 9 refere que se o resultado for um valor ímpar, ele irá para o continue
      // Resumo de como funciona esse código:
      // O if vai fazer o cálculo e caso de ímpar, ele vai fazer o for
      // Caso o if dê par, ele vai ser considerado false e aí
      // ele vai sair do for para dar print no i da linha 17
      for (int i = 0; i < 10; i++) {
          if (i % 2 == 1) {
              continue;
          }

      System.out.println(i);
      }
  }
}
