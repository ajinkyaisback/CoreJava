package ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
 System.out.println("PQR");
 
 System.out.println("ABC");

 try {
	throw new Exception("Use Try Catch Block Between Me");
} catch (Exception e) {
	e.printStackTrace();
}
 
 
 String Exec_flag="N";
 if(Exec_flag.equals("N")) {
 try{
	 throw new Exception("Exec Flag is No Exception");
	}catch(Exception e) {
		e.printStackTrace();
	}
 
	}
}
}
