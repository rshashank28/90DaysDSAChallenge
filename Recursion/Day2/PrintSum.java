package Recursion.Day2;
import java.util.*;
public class PrintSum {
    public static int sum(int n){
        if(n==1)return 1;
        int ans =n+sum(n-1);
        return ans;

    }
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number");
    int n=sc.nextInt();
    sc.close();
    System.out.println(sum(n));
}
    
}
