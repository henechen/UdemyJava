package classe;

public class Equals {

    public static void main(String[] args) {
        Usuario user1 = new Usuario();
        user1.nome = "Pedro Silva";
        user1.email = "pedro.silva@ezemail.com";

        Usuario user2 = new Usuario();
        user2.nome = "Pedro Silva";
        user2.email = "pedro.silva@ezemail.com";

        System.out.println(user1 == user2); // False

        // Normalmente este método daria falso, tendo em vista que caso a forma
        // como o equals fosse adicionado, normalmente, ele somente faria uma
        // comparação de "==", mas, como esse equals puxa a fórmula do equals
        // criada no arquivo "Usuario", ele da um replace na forma como o equals
        // Funciona. Sendo assim, essas 2 linhas abaixo irão dar verdadeiro por
        // causa do equals criado em Usuario.java.

        System.out.println(user1.equals(user2)); // False
        System.out.println(user2.equals(user1)); // False

    }
}
