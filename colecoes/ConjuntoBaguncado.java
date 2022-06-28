package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        @SuppressWarnings({"rawtypes",})
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // Isso será convertido automaticamente para uma classe. double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> character

        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.add("Teste"); // continuará com 5 pois não aceita repetição.
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("teste")); // Retorna verdadeiro ou falso
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains('x')); // Retorna verdadeiro ou falso
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums); // Vai reter o único valor em comum entre as collections, no caso 1
    }
}
