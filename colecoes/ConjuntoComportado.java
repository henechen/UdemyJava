package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        // Set não respeita ordem de inserção (não tem ordenação)
        // no caso desse set os nomes sairão em ordem diferente no console
        Set<String> listaAprovados = new HashSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for(String candidato: listaAprovados)
        {
            System.out.println(candidato);
        }

        // Neste caso, ao invés de usarmos HashSet, usamos TreeSet
        // que é um set que respeita a ordem de inserção, logo
        // Suas adições serão printadas de forma linear

        // TreeSet faz parte do SortedSet que são conjuntos ordenados
        // o critério para a ordem de sessão pode ser qualquer um definido
        // no lugar de "SortedSet" pode ser colocado também "TreeSet"
        // para ficar algo mais simplista, depende de cada pessoa

        // Quando declarado dentro de <> um tipo, induz que obrigatoriamente aquele (neste caso o SortedSet) será do tipo X
        // nesse caso tipo String
        SortedSet<String> listaAprovados2 = new TreeSet<>();
        listaAprovados2.add("Ana");
        listaAprovados2.add("Carlos");
        listaAprovados2.add("Luca");
        listaAprovados2.add("Pedro");

        for(String candidato2: listaAprovados2)
        {
            System.out.println(candidato2);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        for(int n: nums)
        {
            System.out.println(n);
        }

    }
}
