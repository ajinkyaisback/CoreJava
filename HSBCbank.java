package OOPConceptPart2;

public class HSBCbank implements USbank,Brazilbank {  //  Child Class

	
	// if a Class is implementing any interface,then its mandatory to define / Override all the methods of Interface.
	
	public void credit() { 
		
		System.out.println("hsbc---credit");
}
	public void debit() {
		System.out.println("hsbc---debit");
	}
	
	public void transfermoney() {
		System.out.println("hsbc---transfermoney");
	}
	
	public void educationloan() {
		System.out.println("hsbc---education loan");
	}
	public void carloan() {
		System.out.println("hsbc ---car loan");
	}
	//brazil bank method:
	public void Mutualfund() {
		System.out.println("hsbc --- MutualFund");
	}
}