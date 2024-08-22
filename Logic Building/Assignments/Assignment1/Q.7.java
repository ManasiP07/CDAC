/*Write a Java program that finds and prints the largest of three predefined
numbers using if-else statements. */
public class Aug20_Q7 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 5;
        if (a > b && a > c) {
            System.out.println("a is largest");
        } else if (b > c) {
            System.out.println("b is largest");
        }

        else {
            System.out.println("c is largest");
        }
    }

}

