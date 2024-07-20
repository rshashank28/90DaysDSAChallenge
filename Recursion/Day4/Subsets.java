import java.util.*;

public class Subsets {
    static  ArrayList<String> arr =new ArrayList<>();
    public static void subsets(int i,String s,String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        char ch=s.charAt(i);
        subsets(i+1, s, ans+ch);//take
        subsets(i+1, s, ans);//not take
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your string: ");
         String s=sc.nextLine();
       
         subsets(0,s,"");

        System.out.print(arr);

        sc.close();

    }
}
