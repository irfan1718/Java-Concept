package practice;

import java.util.Scanner;

public class OddSum {
   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a limit");
        int num=s.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            if(i%2==1){
                sum=sum+i;
            }
        }
        System.out.println("result:"+sum);
   }

}
