
public class EmpWageBuilderUC4{

public int calculateWage(int wageperHour, int empHours){

	return wageperHour*empHours;
}

	public static void main(String[] args) {

		final int isFullTime=1;
		final int isPartTime=2;
		int wageperHour=20;
		int empHours=0;
		int empWage=0;
		int empCheck=(int)Math.floor(Math.random() * 10) % 3;

		System.out.println(empCheck);

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

		EmpWageBuilderUC4 c = new EmpWageBuilderUC4();
		empWage=c.calculateWage(wageperHour,empHours);

		System.out.println("Employee Wage: "+empWage);
	}

}
