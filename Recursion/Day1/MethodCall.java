public class MethodCall{

    public static void mango(){
        System.out.println("in mango");
    }
    public static void banana(){
        System.out.println("in banana");
        mango();
    }
    public static void apple(){
        banana();
        System.out.println("in apple");
        mango();
    }
    public static void main(String[]args){
        System.out.println("in main function");
        apple();
    }
    
}

//output
//in main function 
// banana
// mango
// apple
// mango