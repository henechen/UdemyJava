package oo.heranca.desafio;

public class Carro {

    final int MAX_SPEED;
    public int currentSpeed = 0;
    int delta = 5;

    protected Carro(int maxSpeed)
    {
        MAX_SPEED = maxSpeed;
    }

    public void speedUp()
    {
        if (currentSpeed + delta > MAX_SPEED)
        {
            currentSpeed = MAX_SPEED;
        } else {
            currentSpeed += delta;
        }
    }

    public void speedDown()
    {
        if (currentSpeed >= 0)
        {
            currentSpeed -= 5;
        } else {
            currentSpeed = 0;
        }
    }
}
