package practice;

import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter your mark out of 100\n");
        int mark=s.nextInt();

        if(mark > 90  ){
            System.out.println("Congragulations, You have Passed in your exam with A Grade\n");
        }   else if(mark > 80 ) {
            System.out.println("Congragulations, You have Passed in your exam with B Grade\n");
        } else if(mark > 70 ) {
            System.out.println("Congragulations, You have Passed in your exam with C Grade\n");
        } else if(mark > 60 ) {
            System.out.println("Congragulations, You have Passed in your exam with D Grade\n");
        } else if(mark > 50 ) {
            System.out.println("Congragulations, You have Passed in your exam with E Grade\n");
        } else {
            System.out.println("sorry, You have Failed\n");
        }

    }
}
