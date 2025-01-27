package Interfaces;
class Demo implements Compute{
	public void add() {
		int a, b, c;
		a =10; b =20;
		c =a+b;
		System.out.println(c);
		
	}
	public void sub() {
		int x, y, z;
		x =50; y=40;
		z = x - y;
		System.out.println(z);
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		Compute ptr;
		ptr = d1;
		ptr.add();
		ptr.sub();


	}

}
