// 注意 StringBuffer 一定要重新generate，否则传递的还是sbr,修改的还是sbr,不是一个新的

public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
    ArrayList<String> list = new ArrayList<String> ();
    StringBuffer sbr = new StringBuffer ();
    generate(list, 0, 0, n, sbr);
    return(list);
    }
    
    public void generate(ArrayList<String> list, int left, int right, int n, StringBuffer sbr) {
      StringBuffer sbrl= new StringBuffer (sbr);  // 注意这里一定要重新生成sbrl, 否则传递的是地址，不是值
      StringBuffer sbrr= new StringBuffer(sbr); 
      if (left < n) {
      sbrl.append('(');
        generate(list, left+1, right, n, sbrl);
      
      } 
      
      if(right < left ) {
          sbrr.append(')');
          generate(list, left, right+1,n,sbrr);
          
      }
      
      if ((left == right ) && ( left == n)) {
         String str= new String( sbr ); 
          list.add(str);
          return;
      }
      
        
    }
}