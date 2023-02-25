package calculations;

import history.History;

public class Multiplication {
    History history = new History();
    public long multiplication(int a, int b)
    {
        int temp = a*b;
        history.addHistory(a + " * " + b + " = " + temp);
        return temp;
    }

    public double multiplication(double a, double b)
    {
        double temp = a*b;
        history.addHistory(a + " * " + b + " = " + temp);
        return temp;
    }
}
