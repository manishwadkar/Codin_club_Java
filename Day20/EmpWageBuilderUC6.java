

public class EmpWageBuilderUC6{

public int calculateWage(int wageperHour, int totalEmpHours){

	return wageperHour*totalEmpHours;
}

	public static void main(String[] args) {

		final int isFullTime=1;
		final int isPartTime=2;
		final int wageperHour=20;
		int empHours=0;
		int empWage=0;
		int totalEmpWage=0;
		final int noOfWorkingDays=20;
		final int totalWorkingHoursperMonth=50;
		int totalEmpHours=0;
		int totalWorkingDays=0;

		EmpWageBuilderUC6 c = new EmpWageBuilderUC6();

		while(totalEmpHours<=totalWorkingHoursperMonth && totalWorkingDays<=noOfWorkingDays){
			int empCheck=(int)Math.floor(Math.random() * 10) % 3;
			System.out.println(empCheck);
			totalWorkingDays++;
			switch (empCheck){

			case isFullTime:
					empHours=8;
					break;
			case isPartTime:
					empHours=4;
					break;
			default:
					empHours=0;
			}
			totalEmpHours+=empHours;
			System.out.println("Day:"+totalWorkingDays+" EmpHrs: "+empHours);
		}
		totalEmpWage=c.calculateWage(wageperHour,totalEmpHours);
		System.out.println("Total Employee Wage: "+totalEmpWage);
	}

}
