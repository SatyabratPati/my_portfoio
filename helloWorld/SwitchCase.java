package myCaptain;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        int option;
        System.out.println("Enter an option: ");
        Scanner s= new Scanner(System.in);
        option = s.nextInt();
        switch (option){
            case 1 :
                System.out.println("You've selected option'1'");
                break;
            case 2 :
                System.out.println("You've selected option'2'");
                break;
            case 3 :
                System.out.println("You've selected option'3'");
                break;
            default:
                System.out.println("You haven't selected any option!!");
        }
    }
}
