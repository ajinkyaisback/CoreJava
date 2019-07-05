package OOPConceptPart1;

public class CallbyvalueandCallbyReference {
	int p;
	int q;


	public static void main(String[] args) {
		
		CallbyvalueandCallbyReference obj= new CallbyvalueandCallbyReference();
		 int x = 26;
		 int y = 52;
		obj.testsum(x,y);// call by value or Pass by value
		System.out.println(obj.testsum(15, 20));
		obj.p=60;
		obj.q=40;
		obj.swap(obj);
				//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	
     public int testsum(int a, int b) {
	int c =a+b;
	return c;
			
}
     public void swap(CallbyvalueandCallbyReference t) {
    	 int temp;
    	 temp=t.p; 
    	 t.p=t.q;
    	 t.q=temp;
    	
     }
}
