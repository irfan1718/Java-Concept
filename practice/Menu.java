package practice;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("HOTEL MENU\nPress the Number to order the food\n1.Chicken Biriyani\n2.Chichen Mandhi\n3.Alfam combo\n4.Broast Combo\n");
        int item=s.nextInt();

        switch (item) {
            case 1:
                System.out.println("Chicken Biriyani will be ready in 10 mins");
                break;
            case 2: 
                System.out.println("Chicken Mandhi will be ready in 10 mins");
                break;
            case 3: 
                System.out.println("Alfam Combo will be ready in 10 mins");
                break;
            case 4: 
                System.out.println("Broast Combo will be ready in 10 mins");
                break;
            default:
                 System.out.println("Please Enter a valid option");
                break;
        }
    }
}
