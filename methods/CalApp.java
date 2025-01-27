package Methods;

class Calculator{
	void add() {
		int a, b, c;
		a = 10;
		b = 20;
		c =a + b;
		System.out.println("The sum is"+c);
	}
}
public class CalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1;
		c1 = new Calculator();
		c1.add();

	}

}
