package practice;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number for its multiplication table\n");
        int n=s.nextInt();
        for(int i=1;i<=10;i++){
            int mul=n*i;
            System.out.println(n+"*"+i+"="+mul+"\n"); 
        }
    }
}
