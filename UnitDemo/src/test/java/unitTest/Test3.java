package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import emp.EmpBusinessLogic;
import emp.EmpDetails;

public class Test3 {
	@Test()
	public void testAppraisal() {
		EmpDetails details=new EmpDetails();
		EmpBusinessLogic logic=new EmpBusinessLogic();
		details.setEmpName("Rahul");
		details.setEmpAge(22);
		details.setEmpSalary(5000);
		double appraisals = logic.appraisal(details);
		Assert.assertEquals(500.0, appraisals);
	}

}
