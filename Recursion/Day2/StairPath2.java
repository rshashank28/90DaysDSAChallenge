package Recursion.Day2;
import java.util.*;

public class StairPath2{

    public static int TotalWay(int n){
        if(n<=3&& n!=2)return n;
        return TotalWay(n-1)+TotalWay(n-3);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your no: ");
        int n=sc.nextInt();
        System.out.print(TotalWay(n));
        sc.close();
    }
}