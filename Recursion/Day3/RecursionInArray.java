package Recursion.Day3;

public class RecursionInArray {

    public static void print(int i,int[] arr){
        if(i==arr.length)return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int [] arr={4,5,6,5,4,6,7,9,87,12,12,6};
        print(0,arr);
        // for(int ele:arr){
        //     System.out.print(ele+" ");
        // }
    }
    
}
