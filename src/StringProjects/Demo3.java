package StringProjects;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo3 {
	public static void main(String[] args) {
		Set<Character> set = new LinkedHashSet<Character>();
		String str = "UUDDAAYY";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
		set.add(ch[i]);
		}
		for(Character s:set) {
			System.out.println(s);
		}
	}

}
