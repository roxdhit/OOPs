package Interfaces;
import java.util.*;
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Entering the main");
		int a[] = new int[5];
		int i;
		for( i = 0; i <= 4; i++) {
			System.out.println("Enter an element");
			a[i] = scan.nextInt();
		}
		try {
			for(i =0; i<= 5; i++) {
				System.out.println(a[i]);
			}
		}
		catch(Exception e) {
			System.out.println("Problem in accessing an array");
		}
		System.out.println("Exiting main normally");

	}

}
