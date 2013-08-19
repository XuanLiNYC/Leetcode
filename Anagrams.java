import java.util.Iterator;
public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> list = new ArrayList<String>();
     if(strs.length == 0){
         return(list);
     }
   //  int[] tag = new int[strs.length];
     HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
     
     for(int i = 0 ; i < strs.length; i++){
         String s = strs[i];
         char[] cs = s.toCharArray();
         Arrays.sort(cs);
         String news = new String(cs);
         
         if(map.containsKey(news)){
            ArrayList<String> templist = map.get(news);
            templist.add(s);
          } else {
             ArrayList<String> templist = new  ArrayList<String>();
             templist.add(s);
             map.put(news, templist);        
          }          
     }
    
        Iterator it = map.values().iterator();
        while(it.hasNext()){           
              ArrayList<String> templist =( ArrayList<String>) it.next();
              if(templist.size() >1){
                  list.addAll(templist);
              }
        }
     
     
     return(list);
     
     
    }
    
   
}