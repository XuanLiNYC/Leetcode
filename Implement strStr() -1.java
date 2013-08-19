public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
     
	// 题目的意思是找到needle存在的第一个位置，然后后面的都直接返回。
	// 返回的是 haystack.substring(i);  就是从i 到 末尾的所有长度
        String s = getStr(haystack, needle);
        return(s);
    }
    
    public String getStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) {
            return(null);
        }
        
        if(needle.length() == 0) {   // 注意这个要求。省去了很多 haystack ==""的情况讨论
            
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