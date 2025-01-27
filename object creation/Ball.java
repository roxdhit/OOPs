package ObjectCreation;

public class Ball {
	String color = "Red";
	int price = 120;
	
	public static void main(String[] args) {
		Ball b1;
		b1 = new Ball();
		
		System.out.println("The the color of ball is" + b1.color);
		System.out.println("The price of the ball is" + b1.price);
	}

}
