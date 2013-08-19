import java.util.ArrayList;


public class LongestCommonSubsequence {

	/**
	 * 想法不难，用DP, 如果目前的character 相等 s1.charAt(m) == s1.charAt(n), 存下这个char,然后check(m+1,n+1)
	 * 否者check(m+1,n) 与 check(m,n+1) 到末尾的话判断一下目前找到的最长的与这个结果的比较即可。
	 * 程序还有可以简化的地方. 注意中间StringBuffer 也需要新建一个才不会导致内容混乱。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s1 = "asdfergt";
		String s2 = "dserft";
		ArrayList<String> list = new ArrayList<String>();
		if(s1.length() == 0 || s2.length() == 0) {
			list.add(new String());
		} else {
			
			StringBuffer sbr = new StringBuffer();
			LCS(s1,s2,0,0,sbr,list);			
			
		}

		String result = list.get(0);
		System.out.println(result);
		
	}
	
	public static void LCS(String s1, String s2, int m, int n, StringBuffer sbr, ArrayList<String> list){
		if(m == s1.length()) {
			if(list.size() == 0){
				list.add(new String(sbr));	
			} else {
				if(list.get(0).length() < sbr.length()){
					list.remove(0);
					list.add(new String(sbr));	
				}	
			}

			return;
		} 
		if(n == s2.length()) {
			if(list.size() == 0){
				list.add(new String(sbr));	
			} else {
				if(list.get(0).length() < sbr.length()){
					list.remove(0);
					list.add(new String(sbr));	
				}	
			}
			return;
		}
		
		if(s1.charAt(m)==s2.charAt(n)){
			StringBuffer sbrtemp = new StringBuffer(sbr);  // 注意这里一定要新建一个，否则内容会被改变的
			sbrtemp.append(s1.charAt(m));
			LCS(s1, s2, m+1, n+1, sbrtemp,list);		
		} else {
			LCS(s1, s2, m+1, n, sbr,list);	
			LCS(s1, s2, m, n+1, sbr,list);	
		}
	
	}
	

}
