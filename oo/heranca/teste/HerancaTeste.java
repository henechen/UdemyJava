package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Lambo;

public class HerancaTeste {

    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari(350);

        Lambo lambo = new Lambo(250);

        System.out.println("Ferrari current speed: " + ferrari.currentSpeed);
        System.out.println("Lambo current speed: " + lambo.currentSpeed);

        ferrari.speedUp();
        lambo.speedUp();

        System.out.println("Ferrari current speed: " + ferrari.currentSpeed);
        System.out.println("Lambo current speed: " + lambo.currentSpeed);

        ferrari.speedDown();
        ferrari.speedDown();
        lambo.speedDown();
        lambo.speedDown();

        System.out.println("Ferrari current speed: " + ferrari.currentSpeed);
        System.out.println("Lambo current speed: " + lambo.currentSpeed);
    }
}
