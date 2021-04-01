package set2;

import java.util.Scanner;

public class fahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature:");
		double f=sc.nextFloat();
		double c=(f-32)*5/9;
		System.out.println("Fahrenheit to Celsius:"+c);
	}

}
