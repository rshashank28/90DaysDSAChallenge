package Recursion.Day2;

import java.util.Scanner;

//power function logrithmic T.C=O(log b);
public class PowerInLog {
    public static int pow(int a,int b){

        if(b==0)return 1;
        int ans =pow(a,b/2);
        if(b%2==0)return ans *ans;
        else
            return ans*ans*a;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your base: ");
        int a=sc.nextInt();
        System.out.print("enter your power: ");
        int b= sc.nextInt();
        System.out.println(pow(a,b));
        sc.close();
    }
}
