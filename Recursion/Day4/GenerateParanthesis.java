//Leetcode:- 22;

import java.util.Scanner;


public class GenerateParanthesis {

    public static void printParentheses(int open,int close,int n,String s){
        if(s.length()==2*n){
            System.out.print(s+" ,");
            return;
        }
        if(open<n)  printParentheses(open+1, close, n, s+"(");//open
        if(close<open)  printParentheses(open, close+1, n, s+")");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your number: ");
        int n=sc.nextInt();
        printParentheses(0,0,n,"");
        sc.close();
    }
}
