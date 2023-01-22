package practice;

import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array\n");
        int limit=s.nextInt();
        int[] a=new int[limit];
        int[] b=new int[limit];
        System.out.println("Enter the array 1\n");
        for(int i=0;i<limit;i++){
            a[i]=s.nextInt();
        }

        System.out.println("Enter the array 2\n");
        for(int i=0;i<limit;i++){
            b[i]=s.nextInt();
        }


        System.out.println("Array  before swap\n");
        for(int i=0;i<limit;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.print("\n");
        for(int i=0;i<limit;i++){
            System.out.print(b[i]+"\t");
        }

        System.out.println("\nArray After swap\n");
        int[] temp=new int[limit];
        for(int i=0;i<limit;i++){
            temp[i]=a[i];
            a[i]=b[i];
            b[i]=temp[i];
        }

        for(int i=0;i<limit;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.print("\n");
        for(int i=0;i<limit;i++){
            System.out.print(b[i]+"\t");
        }

        
        
    }
}
