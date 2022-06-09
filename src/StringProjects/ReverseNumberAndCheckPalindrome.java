package StringProjects;

import java.util.Scanner;

public class ReverseNumberAndCheckPalindrome {
	public void ReverseInt() {
		int n,a,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input Number to reverse");
		n=s.nextInt();	
		int b=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			temp=temp*10+a;
		}
		if(temp==b) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		s.close();
	}
	public static void main(String[] args) {
		ReverseNumberAndCheckPalindrome num=new ReverseNumberAndCheckPalindrome();
		num.ReverseInt();
	}
}
