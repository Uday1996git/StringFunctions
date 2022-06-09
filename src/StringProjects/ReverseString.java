package StringProjects;

public class ReverseString {
	public static void ReverseTheString(String str) {
		String rsv="";
		char ch;
		for(int j=0;j<str.length();j++) 
		{
			ch=str.charAt(j);
			 rsv=ch+rsv;
		}
		System.out.println(rsv);
	}
	public static void main(String[] args) {
		ReverseTheString("UDAY");
	}
}
