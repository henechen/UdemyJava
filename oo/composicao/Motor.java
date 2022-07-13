package oo.composicao;

public class Motor {

    Carro carro;
    boolean estaLigado = false;
    double fatorInjecao = 1;

    Motor (Carro carro)
    {
        this.carro = carro;
    }

    /**
     * @return
     * Retorna quantos giros o motor está fazendo no momento
     * linha 26 é feito um cast e é usado a lib Math por conta do fatorInjeção ser um double
     * aí é feito um casto para se possibilitar o cálculo de um double que vira int com outro int que é o 3000
     */
    int giros()
    {
        if(!estaLigado)
        {
            return 0; // Retorna 0 pois o carro está desligado.
        }
            else
            {
                return (int) Math.round(fatorInjecao * 3000);
            }
    }
}
