package StringProjects;

public class SwapStrings {
	public static void Swap() {
		String str ="Uday";
		String s ="Is Here";
		str=str+s;
		System.out.println("Before swap"+"  "+str);
		s=str.substring(0,str.length()-s.length());
		str=str.substring(s.length());
	
		System.out.println(str+" "+s);
		
	}
	public static void main(String[] args) {
	Swap();
		}
	}
