package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USbank.min_bal);
		
		
     HSBCbank b= new HSBCbank();
     b.credit();
     b.debit();
     b.educationloan();
     b.transfermoney();
     b.carloan();
     b.Mutualfund();
       
	// Dynamic polymorphism
     //child class object can be referred by parent Interface reference var
     USbank a=new HSBCbank();
     
     a.credit();
     a.debit();
     a.transfermoney();
     
	}

}
