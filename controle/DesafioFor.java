package controle;

public class DesafioFor {

    public static void main(String[] args) {

        // Output
        String valor = "#";
        for(int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }

        // Versão desafio
        // Não pode usar valor numérico para controlar o laço.

        String valor1 = "#";
        for(;!valor1.equals("######");) {
            System.out.println(valor1);
            valor1 += "#";
        }

        // Resposta do professor
        for(String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }

    }
}
