package Recursion.Day3;

import java.util.Scanner;

public class SkipCharacter {

    public static void skip(String s,char n,String ans,int i){
        if(i==s.length()){
            System.out.print(ans);
            return;
        }
        if(s.charAt(i)!=n)ans+=s.charAt(i);
        skip(s, n, ans, i+1);
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string: ");
        String s=sc.nextLine();
        System.out.println();
        System.out.print("enter charscter to skip: ");
        char n = sc.next().charAt(0);
        skip(s,n,"",0);
        sc.close();
    }


}
