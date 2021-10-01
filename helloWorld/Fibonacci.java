package myCaptain;
import java.util.Scanner;

public class Fibonacci {
    static void Fib(int n)
    {
        int num1 = 0, num2 = 1;
        int c = 0;
        while (c < n) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            c = c + 1;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci terms to be displayed: ");
        int n = sc.nextInt();
        Fib(n);
    }
}
