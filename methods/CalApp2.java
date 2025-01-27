package Methods;
 class Calculator2{
	 void sub(int x, int y) {
		 int z;
		 z = x - y;
		 System.out.println("The sub is"+z);
	 }
 }
public class CalApp2 {

	public static void main(String[] args) {
		Calculator2 c2;
		c2 = new Calculator2();
		int a,b;
		a =50;
		b=30;
		c2.sub(a, b);

	}

}
