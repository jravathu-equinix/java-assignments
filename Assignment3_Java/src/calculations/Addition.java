package calculations;
import history.History;

public class Addition {
    History h = new History();
    public long addition(int a, int b)
    {
        long temp =  a+b;
        h.addHistory(a + " + " + b + " = " + temp);
        return temp;
    }
    public double addition(double a, double b)
    {
        double temp = a+b;
        h.addHistory(a + " + " + b + " = " + temp);
        return temp;
    }
}
