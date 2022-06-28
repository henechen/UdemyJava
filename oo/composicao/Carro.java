package oo.composicao;

public class Carro {

    /**
     * Motor inicializado
     */
    Motor motor;

    Carro()
    {
        this.motor = new Motor(this);
    }

    /**
     * Cada vez que esse método for chamada, ele adiciona +0.4 ao valor total de motor.fatorInjecao
     * Igual ao método frear, ele verifica se está ok o caso x para realizar a operação
     */
    void acelerar()
    {
        if(motor.fatorInjecao < 2.6)
        {
            motor.fatorInjecao += 0.4;
        }
    }

    /**
     * Faz a verificação do fatorInjecao atual, previne que vá para um valor negativo
     * caso bata x caso, e executa a operação de diminuição dos giros
     */
    void frear()
    {
        if(motor.fatorInjecao > 0.5)
        {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar()
    {
        motor.estaLigado = true;
    }

    void desligar()
    {
        motor.estaLigado = false;
    }

    boolean estaLigado()
    {
        return motor.estaLigado;
    }
}
