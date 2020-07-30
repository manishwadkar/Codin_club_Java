
public class EmpWageBuilderUC5{

public int calculateWage(int wageperHour, int empHours){

	return wageperHour*empHours;
}

	public static void main(String[] args) {

		final int isFullTime=1;
		final int isPartTime=2;
		final int wageperHour=20;
		int empHours=0;
		int empWage=0;
		int totalEmpWage=0;
		final int noOfWorkingDays=20;

		EmpWageBuilderUC5 c = new EmpWageBuilderUC5();

		for(int i=0;i<noOfWorkingDays;i++){
			int empCheck=(int)Math.floor(Math.random() * 10) % 3;
			System.out.println(empCheck);

			switch (empCheck){

			case isFullTime:
						empHours=8;
						empWage=c.calculateWage(wageperHour,empHours);
						System.out.println("Employee Wage: "+empWage);
						break;
			case isPartTime:
						empHours=4;
						empWage=c.calculateWage(wageperHour,empHours);
						System.out.println("Employee Wage: "+empWage);
						break;
			default:
						empHours=0;
						empWage=c.calculateWage(wageperHour,empHours);
						System.out.println("Employee Wage: "+empWage);
			}
			totalEmpWage+=empWage;
		}
		System.out.println("Total Employee Wage: "+totalEmpWage);
	}

}
