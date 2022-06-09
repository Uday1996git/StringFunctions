package StringProjects;

public class SplitAndReverse {
	public static void Reverse() {
		String str ="Mr_Uday";
		String[] s=str.split("_");
		for(int i=0;i<s.length;i++) {
		//System.out.println(s[i]);
		}
		for(int i=0;i<s.length;i++) {
			String ct="";
			char[] ch=s[i].toCharArray();
			for(int j=0;j<ch.length;j++) {
				ct=ch[j]+ct;
			}
			s[i]=ct;
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			}
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length;i++) {
			sb.append(s[i]);
		}
		String si=sb.toString();
		System.out.println(si);
	}
	public static void main(String[] args) {
		Reverse();
	}

}
