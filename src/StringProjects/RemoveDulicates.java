package StringProjects;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDulicates {
	public static void Duplicates(String str) {
		Set<Character> s = new LinkedHashSet<Character>();
		char[] seq = str.toCharArray();
		for(int i=0; i<seq.length;i++) {
			s.add(seq[i]);	
			
		}
		System.out.println(s);
		String stri = String.valueOf(s);
		System.out.println(stri);
		
	}
	public static void StringDuplicates(String sq) {
		
		
	}
	
	public static void CountDuplicate() {
		String str = "UdayUUUU";
		StringBuilder sb=new StringBuilder(str);
		//char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=i+1; j<str.length();j++) {
				int value = Character.compare(str.charAt(i), str.charAt(j));
				
				if(value==0) {
					sb.deleteCharAt(j);
					count++;
					}
			}
			sb.deleteCharAt(i);
		//	str=sb.toString();
			System.out.println("The count of"+str.charAt(i)+" "+count);
	
		}
	}
	public static void main(String[] args) {
		CountDuplicate();
	}

}
