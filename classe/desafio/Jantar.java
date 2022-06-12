package classe.desafio;

public class Jantar {

  public static void main(String[] args) {
    Comida comida1 = new Comida("Arroz", 0.223);
    Comida comida2 = new Comida("Feijao", 0.300);

    Pessoa Fellipe = new Pessoa("Fellipe", 150.0);

    System.out.println(Fellipe.apresentar());
    Fellipe.comer(comida1);

    System.out.println(Fellipe.apresentar());
    Fellipe.comer(comida2);

    System.out.println(Fellipe.apresentar());
  }
}
