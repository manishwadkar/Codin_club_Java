
public class calculateEmpWagePartTime{

public int calculateWage(int wageperHour, int empHours){

	return wageperHour*empHours;
}

	public static void main(String[] args) {

		int isFullTime=1;
		int wageperHour=20;
		int empHours=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random() * 10) % 3;

		System.out.println(empCheck);
		if(empCheck == isFullTime){
			empHours=8;
			System.out.println("Full time");
		}
		else if(empCheck == 2){
			empHours=4;
			System.out.println("Part time");
		}
		else{
			empHours=0;
		}
		calculateEmpWagePartTime c = new calculateEmpWagePartTime();
		empWage=c.calculateWage(wageperHour,empHours);

		System.out.println("Employee Wage: "+empWage);
	}

}
