package StringProjects;

import java.util.Arrays;

public class TestDemo {
	//Writing code for reverse a string
	public static void main(String[] args) {
		String str = "Udayayu";
		int index=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(ch[i]==ch[j]) {
					break;
				}
				
			}
			if(j==i) {
				ch[index++]=ch[i];
			}
			
		}
		System.out.println(String.valueOf(Arrays.copyOf(ch, ch.length)));
	}

}
