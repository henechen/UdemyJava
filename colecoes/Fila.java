package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        // Queue do tipo String, LinkedList é uma fila que aceita todos os métodos de fila
        Queue<String> fila = new LinkedList<>();

        // Método add: Tem a mesma lógica, porém, ao invés de retornar true ou false, ele pode
        // retornar uma exception, gerando um erro
        fila.add("Ana");

        // Método offer: Retorna true ou false caso consiga ou não adicionar um elemento a fila
        // supondo que a fila tenha um limite de por exemplo 100 pessoas, caso seja usado offer
        // para adicionar o elemento 101, ele irá retornar false e não adicionará o elemento
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Tanto peek quanto element retornam o primeiro elemento da tabela, sem removê-los.
        // A diferença consiste na forma como agem quando a fila está vazia.
        // O peek irá retornar nulo, não gerará problema.
        // No caso do element, ele irá jogar a exception "NoSuchElementExcepetion"
        // que no caso seria usado pra posteriormente a exception ser tratada de alguma forma
        // tratada = corrigida a partir da existência da exception
        System.out.println(fila.peek());
        System.out.println(fila.element());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();

        // fila.poll() // retorna o primeiro elemento da fila já o removendo, no caso de lista vazia retorna null
        // fila.remove() // no caso de lista vazia, retorna exception
    }
}
