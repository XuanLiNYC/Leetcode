// Type your Java code and click the "Run Code" button!
// Your code output will be shown on the left.
// Click on the "Show input" button to enter input data to be read (from stdin).
import java.util.ArrayList;
public class Subset {
    public static void main(String[] args) {
        // Start typing your code here...
        System.out.println("Hello world!");
        
        int[] array={1,2,3,4,5};  // �����ʼ����{1,2}������[]
        ArrayList<ArrayList<Integer>> list=subset(array);
        for(int i=0;i< list.size();i++)
        {
            ArrayList<Integer> templist=list.get(i);
            for(int j=0;j< templist.size();j++)
                System.out.print(templist.get(j));
                System.out.println("");          
            
        }
    }
    
    public static ArrayList<ArrayList<Integer>> subset(int[] array)
    {
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        list.add(new ArrayList<Integer>());
        ArrayList<ArrayList<Integer>> templist=new ArrayList<ArrayList<Integer>>();
	//��������ԭ����ArrayList ��ǳ���������⡣
	

        for(int i=0;i< array.length;i++) // array ������ array.length û�� length()����÷�
        {
		
            for(int j=0;j< list.size();j++)
            {
              	ArrayList<Integer> newlist=new ArrayList<Integer>();
		 for(int m=0;m< list.get(j).size();m++)
			newlist.add(list.get(j).get(m));
		
		 templist.add(newlist);
                list.get(j).add(array[i]);
            }
	
            list.addAll(templist);	
	    templist.clear();

            
        }
        
        
        return(list);
        
    }
}