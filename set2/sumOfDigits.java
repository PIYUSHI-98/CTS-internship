package set2;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three digit number:");
		int num=sc.nextInt();
		int sum=0;
		while (num!=0)
		{
			sum+=num%10;
			num/=10;
		}
		System.out.println("Sum of digits:"+sum);
	}

}
