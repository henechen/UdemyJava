package controle;

public class For1 {

    public static void main(String[] args) {

//        int counter = 0;
//        while (counter <= 20) {
//            System.out.printf("i = %d\n", counter);
//            counter += 2;
//        }

        // Migraçcão da estrutura while para for

        for (int counter = 0; counter <= 20; counter += 2) {
            System.out.printf("i = %d\n", counter);
        }

        // Outra possibilidade

        int x = 2;
        for (; x <10;) {
            System.out.println("x = " + x);
            x++;
        }

        // Outra possibilidade (laço infinito)

        for (;true;) {
            System.out.println("fim!");
        }
    }
}
