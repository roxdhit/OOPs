package Threading;
import java.util.*;
class Task1 extends Thread{
	Task1(){
		start();//automatically invokes run()
	}
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the username");
		String name = scan.next();
		System.out.println("enter rhe password");
		int pwd =scan.nextInt();
		System.out.println("collect your cash");
	}
}

class Task2 extends Thread{
	Task2(){
		start();
	}
	public void run() {
		try {
			for(int i =1; i <= 5;i++) {
				System.out.println("penatgonSpace");
				Thread.sleep(5000);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Task3 extends Thread{
	Task3(){
		start();
	}
	public void run() {
		int a, b, c;
		a = 10000;
		b = 40000;
		c = a+b;
		System.out.println(c);
	}
}







	public class MultiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 t1 = new Task1();
		t1.start();
		
		Task2 t2 = new Task2();
		t2.start();
		
		Task3 t3 = new Task3();
		t3.start();


	}

}
