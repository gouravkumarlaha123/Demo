package emp;

public class EmpBusinessLogic {
	
	public double annualSalary(EmpDetails details) {
		double annualSalary = details.getEmpSalary()*12;
		return annualSalary;		
	}
	
	public double appraisal(EmpDetails details) {
		int appraisal=0;
		if (details.getEmpSalary()<10000) {
			appraisal=500;
		} else {
			appraisal=1000;
		}
		return appraisal;		
	}

}
