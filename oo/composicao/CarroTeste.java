package oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        /*
         * Criada a instância Carro
         * e é feita a verificação para saber se o carro está ligado
         */
        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());

        // Carro ligado
        c1.ligar();
        System.out.println(c1.estaLigado());

        // Verifica a quantidade de giros do motor atualmente
        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println(c1.motor.giros());

        // Faltou encapsulamento (verei mais pra frente no curso)
        // c1.motor.fatorInjecao = -30;

        // Relação bidirecional
        System.out.println(c1.motor.carro.motor.carro.motor.giros());
    }
}
