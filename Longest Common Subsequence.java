import java.util.ArrayList;


public class LongestCommonSubsequence {

	/**
	 * �뷨���ѣ���DP, ���Ŀǰ��character ��� s1.charAt(m) == s1.charAt(n), �������char,Ȼ��check(m+1,n+1)
	 * ����check(m+1,n) �� check(m,n+1) ��ĩβ�Ļ��ж�һ��Ŀǰ�ҵ���������������ıȽϼ��ɡ�
	 * �����п��Լ򻯵ĵط�. ע���м�StringBuffer Ҳ��Ҫ�½�һ���Ų��ᵼ�����ݻ��ҡ�
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
			StringBuffer sbrtemp = new StringBuffer(sbr);  // ע������һ��Ҫ�½�һ�����������ݻᱻ�ı��
			sbrtemp.append(s1.charAt(m));
			LCS(s1, s2, m+1, n+1, sbrtemp,list);		
		} else {
			LCS(s1, s2, m+1, n, sbr,list);	
			LCS(s1, s2, m, n+1, sbr,list);	
		}
	
	}
	

}
