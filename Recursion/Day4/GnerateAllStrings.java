import java.util.Scanner;

public class GnerateAllStrings {
    public static void print(int n,String s){
       if(s.length()==n){
        System.out.print(s);
        return;
       }
        if(s.length()==0 || s.charAt(s.length()-1)== 0 ){
            print(n, s+0);
            print(n, s+1);
        }
        else{
            print(n, s+0);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number: ");
        int n=sc.nextInt();
        sc.close();
        print(n,"");
    }
}