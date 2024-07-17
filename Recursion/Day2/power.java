package Recursion.Day2;

//time complexity will be O(b).

import java.util.Scanner;

public class power {

    public static int pow(int a,int b){
        if(b==0)return 1;
        return a*pow(a, b-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your base number: ");
        int a=sc.nextInt();
        System.out.print("enter your power");
        int b=sc.nextInt();
        sc.close();
        System.out.println(pow(a,b));
    }
    
}
