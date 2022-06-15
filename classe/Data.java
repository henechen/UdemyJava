package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    // Valores padrões dos tipos primitivos:
    // byte, short, int, long = 0;
    // float, double = 0.0;
    // char = '\u0000';
    // boolean = false;


    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    String obterDataFormatadaDois()
    {
        String formato = "%d/%d/%d";
        return String.format(formato, dia, mes, ano);
    }


    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Neste exercício, caso a data não fosse passada
    // O construtor deveria retornar a data abaixo.
    Data() {
        dia = 6;
        mes = 4;
        ano = 1977;
    }

    void imprimirDataFormatada() {
        System.out.printf("%d/%d/%d%n", dia, mes, ano);
    }

    static void teste()
    {
        // Dentro de um método estático não é possível utilizar o método this.
        // O método estático é associado a classe, enquanto o this é uma instância
        //
    }
}

