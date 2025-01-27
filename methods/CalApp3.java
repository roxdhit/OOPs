package Methods;

class Calculator3{
	int mul(int x, int y) {
		int z = x*y;
		return z;
	}
}
public class CalApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c3;
		c3 = new Calculator3();
		int a,b,res;
		a=5;
		b=10;
		res = c3.mul(a,b);
		System.out.println("The mul is"+res);

	}

}
