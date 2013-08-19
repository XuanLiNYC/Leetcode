public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        if(numbers.length == 0){
            return(result);
        } 
        
        for(int i = 0 ; i < numbers.length; i ++){
            map.put(numbers[i], i);
        }
        
        for(int i = 0 ; i <numbers.length; i ++ ){
            int value = target - numbers[i];
            if(map.containsKey(value)){
                int v1 = map.get(value);
                int v2 = i;
                
                if(v1 > v2){
                    result[0] = v2+1;
                    result[1] = v1+1;
                } else{
                    result[0] = v1+1;
                    result[1] = v2+1;
                }
                
                return(result);
            }
        }
        
        return(result);
        
    }
}