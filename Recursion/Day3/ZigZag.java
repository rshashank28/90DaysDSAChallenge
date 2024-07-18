package Recursion.Day3;

import java.util.Scanner;

public class ZigZag {
    
    public static void zag(int n){
        if(n==0)return;
        System.out.println(n); 
        zag(n-1);
        System.out.println(n);
        zag(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number: ");
        int n=sc.nextInt();
        zag(n);
        sc.close();
    }
}
