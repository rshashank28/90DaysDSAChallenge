package Recursion.Day2;
import java.util.*;

// total number of step to reach top of stair ,you can only jump 1 or 2 stairs at a time
public class StairPath {
    public static int stair(int n){
        if(n<=2)return n;
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of stairs: ");
        int n=sc.nextInt();
        System.out.println(stair(n));
        sc.close();
    }
    
}
