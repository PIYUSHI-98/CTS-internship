package set2;

public class swapNoThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int b=8;
		System.out.println("Before swapping:");
		System.out.println("a = "+a+" b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping:");
		System.out.println("a = "+a+" b = "+b);

	}

}
