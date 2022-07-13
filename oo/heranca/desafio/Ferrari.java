package oo.heranca.desafio;

public class Ferrari extends Carro{


    public int currentSpeed = 0;

     public Ferrari(int maxSpeed) {
        super(maxSpeed);
    }

    public void speedUp()
    {
        if (currentSpeed < 300)
        {
            currentSpeed += 15;
        }
    }

    public void speedDown()
    {
        if (currentSpeed > 0)
        {
            currentSpeed -= 15;
        }
    }
}
