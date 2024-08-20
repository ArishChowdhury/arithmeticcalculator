import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = s.nextInt();

        System.out.println("Enter second number");
        int b = s.nextInt();

        int addition;
        int subtraction;
        int multiplication;
        double power;


        addition = a+b;
        subtraction = a-b;
        multiplication = a*b;
        power = Math.pow(a,b);


        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(power);


        }
    }
