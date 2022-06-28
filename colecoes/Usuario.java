package colecoes;

import java.util.Objects;

public class Usuario {

    // A partir deste public String, quando for imprimido um objeto do tipo "Usuario"
    // ele irá retornar o conteúdo de "return"
    public String toString()
    {
        return "Meu nome é " + this.nome + ".";
    }
    Usuario(String nome)
    {
        this.nome = nome;
    }
    String nome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
