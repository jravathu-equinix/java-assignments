package calculations;

import history.History;

public class Subtraction {
    History history = new History();
    public int subtraction(int a, int b)
    {
        int temp = a-b;
        history.addHistory(a + " - " + b + " = " + temp);
        return temp;
    }

    public double subtraction(double a, double b)
    {
        double temp = a-b;
        history.addHistory(a + " - " + b + " = " + temp);
        return temp;
    }
}
