
class Employee{

		int isFullTime=1;
		int wagePerHour=20;

		public int checkEmployeeAttendance(){

			double empCheck=Math.floor(Math.random() * 10) % 2;
			System.out.println(empCheck);

			if(empCheck==isFullTime){
				System.out.println("Employee is Present Full-time");
				return 1;
			}
			else
				System.out.println("Employee is Absent");
				return 0;
		}

		public int calculateWages(int empHours){
				return wagePerHour*empHours;
		}
}

public class EmpWageBuilderUC2{
		public static void main(String args[]){

			Employee e= new Employee();
			int c=e.checkEmployeeAttendance();

			if(c==1)
				System.out.println("Daily Wage: "+e.calculateWages(8));
			else
				System.out.println("Daily wage is 0");
		}
}
