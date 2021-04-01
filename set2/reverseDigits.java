package set2;

import java.util.Scanner;

public class reverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three digit number:");
		int num=sc.nextInt();
		int rev=0;
		while (num!=0)
		{
			rev=(rev*10)+num%10;
			num/=10;
		}
		System.out.println("Reverse of number:"+rev);
	}

}
