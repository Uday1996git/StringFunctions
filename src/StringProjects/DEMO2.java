package StringProjects;

import java.util.LinkedHashSet;

public class DEMO2 {
	public static void main(String[] args) {
		String str="UdayayU uday";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<str.length();i++) {
		set.add(str.charAt(i));
	}
		for(Character ch:set) {
			System.out.println(ch);
		}
	
	}

}


