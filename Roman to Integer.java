public class Solution {
    public int romanToInt(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        
        char[] cs = s.toCharArray();
        int sum = 0;
        int pre = -1;
        int cur = -1;
        
        
        for(int i = 0 ; i < cs.length ; i++) {
            if(pre == -1) {
            if(map.containsKey(cs[i])) {
            pre = map.get(cs[i]);
            continue;
             } }
             
           
            if(map.containsKey(cs[i])) {   // ע������ĸ�ֵ����ʼ��ʱ��������
                cur = map.get(cs[i]);                
            }
             
             if(cur != -1 && pre < cur ) {
                 sum -= pre;
                 pre = cur;
             } else if(cur != -1 && pre >= cur) {
                 sum += pre;
                 pre = cur;
             } else if(cur == -1) {
                 continue;
             }
  
            }
            
            sum += pre;
            return(sum);
            
        
    }
}