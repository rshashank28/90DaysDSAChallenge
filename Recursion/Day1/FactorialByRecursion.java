import java.util.Scanner;

public class FactorialByRecursion {
    
    public static int Fact(int n){
        if(n==1)return 1;
        int ans=n*Fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your number: ");
        int n=sc.nextInt();
        System.out.println();
        System.out.println(Fact(n));
        sc.close();
    }
}
