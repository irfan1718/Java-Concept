package practice;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter the limit\n");
        int limit=s.nextInt();
        System.out.println("Enter the array\n");
        for(int i=0;i<limit;i++){
            a[i]=s.nextInt();
        }
        int temp;
        for(int i=0;i<limit-1;i++){
            for(int j=i+1;j<limit;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("\nSorted Array: \n");
        for(int i=0;i<limit;i++){
            System.out.println(a[i]);
        }
    }
}
