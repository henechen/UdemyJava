package classe;

public class DataTeste {

  public static void main(String[] args) {

    Data d1 = new Data(6, 10, 1996);
    d1.imprimirDataFormatada();

    Data d2 = new Data();
    d2.imprimirDataFormatada();

    Data d3 = new Data();
    d3.dia = 17;
    d3.mes = 1;
    d3.ano = 1966;
    d3.imprimirDataFormatada();
  }
}