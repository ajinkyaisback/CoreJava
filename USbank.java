package OOPConceptPart2;

public interface USbank {
	
	int min_bal=100;

	public void  credit();
	
	public void  debit();
	
	public void  transfermoney();
	
	//only method declaration 
	//no method body -- only method prototype
	//in Interface , we can declare the variables,vars are by default static in nature
	//vars value will not be changed , its final in nature .
	// No static method in Interface
	// we cannot create  the object of Interface
	//Interface are abstract in nature
	
	
}
