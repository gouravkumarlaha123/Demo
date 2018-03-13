package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import emp.EmpBusinessLogic;
import emp.EmpDetails;

public class Test2 {
	@Test
	public void testAppraisal() {
		EmpDetails details=new EmpDetails();
		EmpBusinessLogic logic=new EmpBusinessLogic();
		details.setEmpName("Rahul");
		details.setEmpAge(22);
		details.setEmpSalary(10000);
		double appraisals = logic.appraisal(details);
		Assert.assertEquals(1000.0, appraisals);
	}

}
