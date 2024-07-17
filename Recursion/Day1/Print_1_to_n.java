import java.util.Scanner;

public class Print_1_to_n {

public static void print(int n){
    if(n==0)return;
    print(n-1);
    System.out.println(n);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your last number: ");
        int n=sc.nextInt();
        System.out.println();
        sc.close();
        print(n);
    }
}
