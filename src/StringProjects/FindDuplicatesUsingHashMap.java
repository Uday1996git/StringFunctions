package StringProjects;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class FindDuplicatesUsingHashMap {
	public static void FindDuplicates() {
		String str="UdayUaaaaaaaaaaaaa";
		char[] ch = str.toCharArray();
		HashMap<Character,Integer> count=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++) {
			if(count.containsKey(ch[i])) {
				count.put(ch[i], count.get(ch[i])+1);
				
			}
			else {
				count.put(ch[i], 1);
			}
		}
		Set<Character> value=count.keySet();
				System.out.println(count);
				for(int i=0;i<value.size();i++) {
					if(count.get(ch[i])>1) {
						System.out.println(ch[i]+" "+count.get(ch[i]));
					}
				}
	}
	public static void main(String[] args) {
		FindDuplicates();
	}
}
