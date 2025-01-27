package Interfaces;
class Oracle implements Connection {
	 public void connect() {
	     System.out.println("Oracle connecting");
	 }
	 
	 public void query() {
	     System.out.println("Oracle executing");
	 }
	 
	 public void close() {
	     System.out.println("Oracle closing");
	 }
	}

	//Implement the Connection interface in Informics class
	class Informics implements Connection {
	 public void connect() {
	     System.out.println("Informics connecting");
	 }
	 
	 public void query() {
	     System.out.println("Informics executing");
	 }
	 
	 public void close() {
	     System.out.println("Informics closing");
	 }
	}

	//Implement the Connection interface in Sybase class
	class Sybase implements Connection {
	 public void connect() {
	     System.out.println("Sybase connecting");
	 }
	 
	 public void query() {
	     System.out.println("Sybase executing");
	 }
	 
	 public void close() {
	     System.out.println("Sybase closing");
	 }
	}

	//Database class that allows connections
	class Database {
	 void allowConnection(Connection ref) {
	     ref.connect();
	     ref.query();
	     ref.close();
	 }
	}

	//Main class to demonstrate the functionality
	public class Demo2 {

	 public static void main(String[] args) {
	     Oracle o = new Oracle();
	     Informics i = new Informics();
	     Sybase s = new Sybase();
	     Database db = new Database();
	     
	     // Allow connections to different databases
	     db.allowConnection(o);
	     db.allowConnection(i);
	     db.allowConnection(s);
	 }
	}

