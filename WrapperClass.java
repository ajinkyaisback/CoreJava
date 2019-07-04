package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x ="100";
		System.out.println(x+20);
		
		
		// 1)data conversion : String to int 
		
		int i =Integer.parseInt(x);
		System.out.println(i+20);
//Integer, Boolean,Double , Character.
		
		// 2)String to double 
		String s ="12.22";
		double d = Double.parseDouble(s);
		System.out.println(d+20);
		
		
		// 3)String to Boolean:
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(k);
		
		// 4)int to string conversions
		int h=200;
		System.out.println(h+20);
		
		String c=String.valueOf(h);
		System.out.println(c+100);
		
		
	}
	
}
