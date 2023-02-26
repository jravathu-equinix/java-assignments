import java.util.regex.*;
import java.util.*;

public class Person {
    String name;
    Address address;
    String email;
    String phoneNo;
    int salary;

    /**
     * This method is used to validate email.
     * Rules of below regular expressions:
     * Below regex checks for at least 1 dot(.) in the domain name only 3 letters after dot.
     * The top-level domain should have only two to six letters.
     * @param email
     * @return true or false
     */
    public boolean isEmailValid(String email)
    {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * This method is used validate phone number
     * @param phoneNo
     * @return true or false
     */
    public boolean isPhoneNumberValid(String phoneNo)
    {
        String regex = "(0/91)?[7-9][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNo);
        return (matcher.find() && matcher.group().equals(phoneNo));
    }
    Person(String name, Address add, int sal)
    {
        String email;
        String phNo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email, phone number of " + name + ":");

        System.out.println("Email: ");
        while(true)
        {
            email = sc.nextLine();
            if(isEmailValid(email))
                break;
            else
                System.out.println("enter valid email: ");
        }

        System.out.println("PhoneNo: ");
        while(true)
        {
            phNo = sc.nextLine();
            if(isPhoneNumberValid(phNo))
                break;
            else
                System.out.println("enter valid phone number: ");

        }

        this.name = name;
        this.email = email;
        this.phoneNo = phNo;
        this.salary = sal;
        this.address = add;
    }

    void getInfo(String gap)
    {
        System.out.println(gap + "EMAIL: " + this.email + " | ADDRESS: " + this.address.address1+", "+this.address.address2 + ", " + this.address.city + ", " + this.address.pincode + " | PH.NO:" + this.phoneNo + " | SALARY:" + this.salary);
    }



}
