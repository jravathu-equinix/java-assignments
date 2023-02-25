package calculations;

import history.History;

public class Division {
    History h = new History();
    public void division(int a, int b)
    {
//        try {
//            float temp = a / b;
//            h.addHistory(a + " / " + b + " = " + temp);
//            System.out.println(temp);
//        } catch(ArithmeticException ae) {
//            System.out.println("Error");
//        }
        if (b == 0)
        {
            System.out.println("ERROR - divided by 0");
            return;
        }
        float temp = (float) a / b;
        h.addHistory(a + " / " + b + " = " + temp);
        System.out.println(temp);
    }

    public void division(double a, double b)
    {

        if (b == 0.0)
        {
            System.out.println("ERROR - divided by 0");
            return;
        }
        double temp =  a / b;
        h.addHistory(a + " / " + b + " = " + temp);
        System.out.println(temp);
    }
}
