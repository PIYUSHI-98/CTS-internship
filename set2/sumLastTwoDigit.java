package set2;

import java.util.Scanner;

public class sumLastTwoDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 digit:");
		int number=sc.nextInt();
		int dig1=number%10;
		number/=10;
		int dig2=number%10;
		int ans=dig1+dig2;
		System.out.println("sum of last two digits:"+ans);
		
	}

}
