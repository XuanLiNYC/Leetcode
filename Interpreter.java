// Type your Java code and click the "Run Code" button!
// Your code output will be shown on the left.
// Click on the "Show input" button to enter input data to be read (from stdin).
    
 import java.util.Hashtable;
import java.util.ArrayList;
public class Interpreter {
    public static void main(String[] args) {
        // Start typing your code here...
        System.out.println("Hello world!");
      
      String S="aa";
      String T="aa";
      System.out.println(minWindow(S,T));
        
        
    }


    public static String minWindow(String S, String T) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if ((T.length() == 0) || (T.length()> S.length ())) {
            return (new String());
        }

        int min = -1;
        int start = -1;
        int end = -1;
        
        Hashtable<Character, Integer> table = new Hashtable<Character, Integer>() ;
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i = 0 ; i < T.length(); i ++){
            table.put(T.charAt(i), -1);
        }
        
        for(int i = 0 ; i < S.length(); i ++) {
            if(table.containsKey(S.charAt(i))){
                table.put(S.charAt(i), i);
                
                if(start == -1) {
                    start = i;
                }
                
                if (list.size() == table.size()) {
                    list.remove(S.charAt(i));
                    list.add(S.charAt(i));
                    int temp = i-table.get(list.get(0));
                    if(min == -1) {
                        min = temp;
                        end = i;
                    } else if(min > temp ){
                        min = temp;
                        start = table.get(list.get(0));
                        end = i;
                    }
                } else {
                    if(list.contains(S.charAt(i))){
                        list.remove(S.charAt(i));
                        list.add(S.charAt(i));
                    } else {
                         list.add(S.charAt(i));
                    }
                }
            }
        }
        
        if((start == -1) || (end == -1) ) {
            return(new String());
        }
        return(S.substring(start, end+1));
        
    }

}