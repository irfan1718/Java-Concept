package practice;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit\n");
        int limit=sc.nextInt();
        int[] a=new int[limit];
        System.out.println("Enter the array\n");
        for(int i=0;i<limit;i++){
            a[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<limit-1;i++){
            for(int j=i+1;j<limit;j++){
                if(a[i]>a[j]){
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
