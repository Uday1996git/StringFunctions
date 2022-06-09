package StringProjects;

public class FindOddEven {
	public void oddEven(int a) {
	if(a%2==0) {
		System.out.println(a +" "+ "Is even number");
	}
	else {
		System.out.println(a +" "+ "Is Odd number");
	}
	}
	
	public void ArrayOfNumbers(int Num[]) {
		int arrE[]=new int[Num.length];
		int arrO[]=new int[Num.length];
		int j = 0,k=0;
		for(int i=0; i<Num.length;i++) {
			if(Num[i]%2==0) {
				arrE[j]=Num[i];
				System.out.println(arrE[j]+" "+ "Is Even");
				j++;
			}
			else {
				arrO[k]=Num[i];
				System.out.println(Num[i]+" "+ "Is Odd");
				k++;
			}
		}
		System.out.println(java.util.Arrays.toString(arrE));
		System.out.println(java.util.Arrays.toString(arrO));
	}
	public static void main(String[] args) {
		FindOddEven f=new FindOddEven();
		f.oddEven(11);
		int[] Num= {1,2,3,4,5,6,7,8,9,10,23,34,23,12,78,76,56,55,89,101};
		f.ArrayOfNumbers(Num);
		
	}
}
