package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe"); // Retorna um booleano caso add ou não.
        livros.push("Don Quixote"); // Normalmente não retorna nada, porém, retorna uma exception caso tente adicionar um elemento dentro de algo com capacidade cheia
        livros.push("O Hobbit");

        System.out.println(livros.peek()); // Retornará "O Hobbit" por utilizar o método LIFO
        System.out.println(livros.element()); // Semelhanças entre peek e element: um retorna nulo e o outro retorna excessão.

        System.out.println(livros.poll()); // Remove da pilha, quando tenta remover algo que não existe dentro de uma pilha, retorna null
        System.out.println(livros.remove()); // Remove da pilha, quando tenta remover algo que não existe dentro de uma pilha, retorna exception.
    }
}
