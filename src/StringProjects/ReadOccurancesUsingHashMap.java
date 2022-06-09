package StringProjects;

import java.util.HashMap;

public class ReadOccurancesUsingHashMap {
	public void ReadOccurance() {
		String str = "Prudhvi Kumar Uday Kumar";
		HashMap<Character,Integer> count=new HashMap<>();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				continue;
			}
			if(count.containsKey(ch[i])) {
				count.put(ch[i],count.get(ch[i])+1);
			}
			else {
					count.put(ch[i], 1);
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		ReadOccurancesUsingHashMap hm= new ReadOccurancesUsingHashMap();
		hm.ReadOccurance();
	}

}
