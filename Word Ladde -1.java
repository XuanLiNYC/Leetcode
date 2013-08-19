public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashSet<String> map = new HashSet<String>();
        ArrayList<String> list = new ArrayList<String>();        
        list.add(start);
        int n = 1;
        
        while(list.size()!= 0) {
            int size = list.size();
            for(int i = 0 ; i < size; i++) {
                String temps = list.get(i);
                char[] tempa = temps.toCharArray();
                for( int m = 0 ; m < temps.length() ;m++) {
                    char c = tempa[m];
                    for(char x = 'a'; x <= 'z'; x++) {
                        if(c != x) {
                            tempa[m] = x;
                            String tempss = new String(tempa);
                            if(tempss.equals(end)) {
                                return(n+1);
                            }
                            if(dict.contains(tempss)) {
                                if(map.contains(tempss)){
                                    continue;
                                } else {
                                    map.add(tempss);
                                    list.add(tempss);
                                }
                                
                            }
                            
                        }
                    }
                    tempa[m] = c;
                }
                
            }
            
            list.subList(0,size).clear();
            n++;
        }
        
        return(0);
        
        
    }
}