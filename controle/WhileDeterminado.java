package controle;

public class WhileDeterminado {

    public static void main(String[] args) {

        int counter = 1;

        while (counter <= 10) {
            System.out.printf("i = %d\n", counter);
            counter++;
        }

        int counter2 = 0;

        while (counter2 <= 20) {
            System.out.printf("a = %d\n", counter2);
            counter2 += 2;
        }
    }
}
