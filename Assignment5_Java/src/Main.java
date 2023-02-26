public class Main {
    public static void main(String[] args) {

        Address a1 = new Address("100", "A1 Apartment", "City1", 100100);
        Person p1 = new Person("Person1", a1, 78000);

        Address a2 = new Address("200", "A2 Apartment", "City2", 200200);
        Person p2 = new Person("Person2", a2, 78000);

        Address a3 = new Address("300", "A3 Apartment", "City3", 300300);
        Person p3 = new Person("Person3", a3,  78000);

        Address a4 = new Address("400", "A4 Apartment", "City4", 400400);
        Person p4 = new Person("Person4", a4,  78000);

        // Adding person and their manager as (person, manager) to hierarchy
        Hierarchy h = new Hierarchy();
        h.addToHierarchy(p2,p1); //p2 under p1
        h.addToHierarchy(p3,p2); //p3 under p2
        h.addToHierarchy(p4,p3); //p4 under p3

        // Printing hierarchy from current person to the end.
        h.getHierarchy(p1);
        h.getHierarchy(p3);
    }
}