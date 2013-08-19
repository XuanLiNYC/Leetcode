public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
     
	// ��Ŀ����˼���ҵ�needle���ڵĵ�һ��λ�ã�Ȼ�����Ķ�ֱ�ӷ��ء�
	// ���ص��� haystack.substring(i);  ���Ǵ�i �� ĩβ�����г���
        String s = getStr(haystack, needle);
        return(s);
    }
    
    public String getStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) {
            return(null);
        }
        
        if(needle.length() == 0) {   // ע�����Ҫ��ʡȥ�˺ܶ� haystack ==""���������
            
            return(haystack);
        }
        
        
        int h = haystack.length();
        int n = needle.length();
        
        for(int i = 0 ; i <= h-n; i++) {
            if(checkEqual(haystack, needle, i)){
                return(haystack.substring(i));    
            }
    
        }
        return(null);
    }
    
    public boolean checkEqual(String haystack, String needle, int i) {
        int n = needle.length();
        String subh = haystack.substring(i, i+n);
        if(subh.equals(needle)) {
            return(true);
        } else {
            return(false);
        }
    }
    
    
}