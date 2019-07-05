package OOPConceptPart1;

public class CallbyvalueandCallbyReference {

	public static void main(String[] args) {
		
		CallbyvalueandCallbyReference obj= new CallbyvalueandCallbyReference();
		 int x = 26;
		 int y = 52;
		obj.testsum(x,y); // call by value or Pass by value
		
	}
	
	
     public int testsum(int a, int b) {
	int c =a+b;
	return c;
			
}
}
