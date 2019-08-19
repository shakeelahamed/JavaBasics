package learn.java.basic;

public class LearnNumbers {
    public static void main (String[] args) {
        System.out.println("Hello World");

        String firstName = "Shakeel";
        String lastName = "Rahman";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        int x = 5, y = 6, z = 7;
        System.out.println(x+y+z);

        byte myNum = 100;
        System.out.println(myNum);

        char a = 65;
        System.out.println(a);

        int myNumber = 9;
        double assignNum = myNumber;
        System.out.println(myNumber);
        System.out.println(assignNum);

        double myDouble = 9.8;
        int assignInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(assignInt);

        System.out.println(++myNumber);
        System.out.println(myDouble += 3);
    }
}
