// ע�� StringBuffer һ��Ҫ����generate�����򴫵ݵĻ���sbr,�޸ĵĻ���sbr,����һ���µ�

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
      StringBuffer sbrl= new StringBuffer (sbr);  // ע������һ��Ҫ��������sbrl, ���򴫵ݵ��ǵ�ַ������ֵ
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