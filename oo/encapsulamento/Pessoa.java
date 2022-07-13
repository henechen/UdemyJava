package oo.encapsulamento;

public class Pessoa {

    private int idade;
    private String nome;

    public Pessoa(String nome, int idade)
    {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter
    public int getIdade()
    {
        return idade;
    }

    // Setter
    public void setIdade(int novaIdade)
    {
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }
}
