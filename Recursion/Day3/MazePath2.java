package Recursion.Day3;

import java.util.Scanner;

public class MazePath2 {
    
    public static int path(int m,int n){
        if(m==1||n==1)return 1;
        int rightWay=path(m, n-1);
        int downWay=path(m-1, n);
        return rightWay+downWay;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter number of row: ");
        int m=sc.nextInt();
        System.out.print("enter number of colo: ");
        int n=sc.nextInt();
        System.out.println(path(m,n));
        sc.close();
    }
}
