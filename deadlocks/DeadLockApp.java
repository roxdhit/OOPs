package Deadlocks;


class DBProcess implements Runnable{
	String r1 = "Oracle";
	String r2 = "Informics";
	String r3 = "DB2";
	
	public void run() {
		if(Thread.currentThread().getName().equals("Rama")) {
			acquireRamaResource();
		}
		else {
			acquireSitaResource();
		}
	}
	
	void acquireRamaResource() {
		synchronized(r1) {
			System.out.println("Rama acquired Oracle");
			
			synchronized(r2) {
				System.out.println("Rama acquired Informics");
				
				synchronized(r3) {
					System.out.println("Rama acquired DB2");
				}
			}
		}
		
	}
	
	void acquireSitaResource() {
		synchronized(r3) {
			System.out.println("Sita acquired DB2");
			
			synchronized(r2) {
				System.out.println("Sita acquired informics");
			}
			synchronized(r1) {
				System.out.println("Sita acquired Oracle");
			}
		}
	}
}





public class DeadLockApp {

	public static void main(String[] args) {
		DBProcess db = new DBProcess();
		Thread t1 = new Thread(db);
		Thread t2 = new Thread(db);
		t1.setName("Rama");
		t2.setName("Sita");
		t1.start();
		t2.start();
		
	}

}
