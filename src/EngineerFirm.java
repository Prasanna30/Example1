
public class EngineerFirm implements Company {
	int[] income;
	
	public EngineerFirm(int n){
		this.income=new int[n];
		for(int i=0; i<income.length ; i++) {
			income[i]=0;
	
		}
		
	}

	@Override
	public void assignSalaries(int[] salaries) {
		for(int i=0; i<income.length && i<salaries.length; i++) {
			income[i]=salaries[i];
	}
		
	}

	@Override
	public void averageSalary() {
		int totalcost=0;
		
		for (int i=0; i<=income.length;i++) {
		totalcost=totalcost+income[i];
		
		}
		int Average=totalcost/income.length;
		System.out.println(Average);
	}

	@Override
	public void maxSalary() {
		int maxsalary=0;
		for (int i=0; i<=income.length;i++) {
		if(maxsalary<income[i]) {
			maxsalary=income[i];
		}
		}
		System.out.println(maxsalary);
		
	}

	@Override
	public void minSalary() {
		int minsalary=0;
		for (int i=0; i<=income.length;i++) {
		if(minsalary>income[i] || minsalary==0) {
			minsalary=income[i];
		}
		}
		System.out.println(minsalary);

		
	}

}
