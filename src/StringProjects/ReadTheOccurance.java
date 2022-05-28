package StringProjects;

public class ReadTheOccurance {
	public static void main(String[] args) {
		String str = "Udayu";
		char[] ch = str.toCharArray();
		System.out.println(ch);
		for (int i=0; i<str.length();i++){
		int count =0;
		for (int j=0; j<ch.length;j++){
		if (str.charAt(i) == ch[j]){
		count ++;
		System.out.println("Count of "+" "+ch[j]+" "+count);
		}
		
		}
		}
	}

}
