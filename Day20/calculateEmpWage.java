
public class calculateEmpWage{

public int calculateWage(int wageperHour, int empHours){

	return wageperHour*empHours;
}

	public static void main(String[] args) {

		int isFullTime=1;
		int wageperHour=20;
		int empHours=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random() * 10) % 2;

		System.out.println(empCheck);
		if(empCheck == isFullTime){
			empHours=8;
		}
		else{
			empHours=0;
		}
		calculateEmpWage c = new calculateEmpWage();
		empWage=c.calculateWage(wageperHour,empHours);

		System.out.println(empWage);
	}

}
