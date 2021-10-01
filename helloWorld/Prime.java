package myCaptain;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num = sc.nextInt();
        int fact = 0;
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                fact++;
            }
        }
        if(fact==2){
            System.out.println(num+" is a Prime Number!");
        }
        else
        {
            System.out.println(num+" is not a Prime number!");
        }
    }
}
