package StringProjects;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {
	public void PrintTheDups(String str) {
		 boolean ifPresent = false;
		ArrayList<Character> list=new ArrayList<Character>();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			list.add(ch[i]);
		}
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<list.size();i++) {
			set.addAll(list);
		}
		list.clear();
		list.addAll(set);
		System.out.println(list);
	}
	public static void main(String[] args) {
		PrintDuplicates p = new PrintDuplicates();
		p.PrintTheDups("UdayUayUUdayUdayUday");
	}

}
