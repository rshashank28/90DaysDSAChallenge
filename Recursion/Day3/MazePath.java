package Recursion.Day3;

import java.util.Scanner;

public class MazePath {
    public static int path(int row,int col,int n,int m){
        if(row==m||col==n)return 1;
      
        int rightWay = path(row, col+1, n, m);
        int downWay =path(row+1, col, n, m);
        return rightWay+downWay;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter  number of row: ");
        int n=sc.nextInt();
        System.out.print("enter number of col: ");
        int m=sc.nextInt();
        System.out.println(path(1,1,n,m));
        sc.close();
    }
    
}
