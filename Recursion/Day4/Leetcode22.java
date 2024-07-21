// class Solution {
//     static ArrayList<String> arr=new ArrayList<>();
//     public void helper(int open,int close,int n,String ans){
//      if(ans.length()==n*2){
//          arr.add(ans);
//          return;
//      }
//      if(open<n)helper(open+1,close,n,ans+"(");
//      if(close<open)helper(open,close+1,n,ans+")");
//     }
 
//      public List<String> generateParenthesis(int n) {
//          int open=0;
//          int close=0;
//          arr=new ArrayList();
//          helper(open,close,n,"");
//          return arr;
//      }
//  }