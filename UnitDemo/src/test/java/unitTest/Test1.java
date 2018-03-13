package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import emp.EmpBusinessLogic;
import emp.EmpDetails;


public class Test1 {
	@Test
	public void testAnnualSalary() {
		EmpDetails details=new EmpDetails();
		EmpBusinessLogic logic=new EmpBusinessLogic();
		details.setEmpName("Rahul");
		details.setEmpAge(22);
		details.setEmpSalary(10000);
		double annualSalary = logic.annualSalary(details);
		Assert.assertEquals(120000.0, annualSalary);
	}
	

}
