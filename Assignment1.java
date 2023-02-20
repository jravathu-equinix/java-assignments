// ABSTRACTION - using abstract class
abstract class Animal
{
    abstract void legs();
}

class Duck extends Animal
{
    void legs()
    {
        System.out.println("Duck has 2 legs!");
    }
}

class Cheetah extends Animal
{
    void legs()
    {
        System.out.println("Cheetah has 4 legs!");
    }
}

// POLYMORPHISM, INHERITANCE
class Parent 
{
    // ENCAPSULATION  
    String name = "Rob";
    private int salary;

    // getter
    public int getSalary()
    {
        return salary;
    }

    // setter
    public void setSalary(int sal)
    {
        this.salary = sal;
    }

    void numbers(int a, int b)
    {
        System.out.println(a+b);
    }

    void numbers(int a, int b, int c, int d)
    {
        System.out.println(a+b+c+d);
    }

    void msgP()
    {
        System.out.println("This is parent class");
    }

}

class Brother extends Parent
{
    void msgB()
    {
        System.out.println("This is Brother class");
    }
}

class BKid extends Brother
{
    void msgBk()
    {
        System.out.println("This is Bkid class");
    }
}

class Sister extends Parent
{
    void msgS()
    {
        System.out.println("This is Sister class");
    }
}

public class Assignment1 extends Parent
{
    void numbers(int a, int b)
    {
        System.out.println(a*b);
    }

    void msgA1()
    {
        System.out.println("This is Assignment1 class");
    }
    public static void main(String []args)
    {
        int a = 2;
        int b = 3;
        int c = 4; 
        int d = 5;

        Parent p = new Parent();
        Assignment1 a1 = new Assignment1();
        Brother b1 = new Brother();
        Sister s1 = new Sister();
        BKid bk = new BKid();

        //-------POLYMORPHISM---------

        // Method Overloading
        p.numbers(a,b);
        p.numbers(a,b,c,d);

        // Method Overriding
        p.numbers(a,b);
        a1.numbers(a,b);


        //--------INHERITANCE----------

        // Single Level Inheritance
        a1.msgP();
        a1.msgA1();

        // Multilevel Inheritance
        bk.msgBk();
        bk.msgB();
        bk.msgP();

        // Hierarchial Inheritance
        s1.msgP();
        b1.msgP();


        //--------ABSTRACTION----------

        Animal duck = new Duck();
        Animal cheetah = new Cheetah();

        duck.legs();
        cheetah.legs();


        //-------ENCAPSULATION--------

        // accesing public var
        System.out.println(p.name);
        // private var
        p.setSalary(10000000);
        int s = p.getSalary();
        System.out.println(s);
    }
}