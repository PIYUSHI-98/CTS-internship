package set2;

import java.util.Scanner;

public class digitAddTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the four digit number:");
		int num=sc.nextInt();
		int number=0;
		int newNumber=0;
		int temp=0;
		while (num!=0)
		{
			number=num%10;
			if(number==9)
				newNumber=1;
			else if(number==8)
				newNumber=0;
			else
				newNumber=number+2;
			temp=(temp*10)+newNumber;
			num/=10;
		}
		int rev=0;
		while (temp>0)
		{
			rev=(rev*10)+temp%10;
			temp/=10;
		}
		System.out.println("Number after transformation:"+rev);
	}

}
