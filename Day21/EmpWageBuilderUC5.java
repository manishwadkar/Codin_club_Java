
//Usecase 5 Calculate Wages for a Month assuming 20 working days in a month

class Employee{

      final int isFullTime=1;
		final int isPartTime=2;
      int wagePerHour=20;
		int empHours=0;

      public int checkEmployeeAttendance(){

         int empCheck=(int)Math.floor(Math.random() * 10) % 3;
         System.out.println(empCheck);

         if(empCheck==isFullTime){
            System.out.println("Employee is Present Full-time");
            return 1;
         }
			else if(empCheck==isPartTime){
				System.out.println("Employee is Present Part-time");
				return 2;
			}
         else
            System.out.println("Employee is Absent");
            return 0;
      }

      public int calculateWages(int empHours){
            return wagePerHour*empHours;
      }

		public int checkEmployeeAttendanceSwitch(){

			int empCheck=(int)Math.floor(Math.random() * 10) % 3;
         System.out.println(empCheck);

			switch (empCheck){

			case isFullTime:
						System.out.println("Employee is Full-time");
						empHours=8;
						break;
			case isPartTime:
						System.out.println("Employee is part-time");
						empHours=4;
						break;
			default:
						empHours=0;
			}
			return empHours;
		}
}

public class EmpWageBuilderUC5{
      public static void main(String args[]){

			final int noOfWorkingDays=20;
			int empWage=0;
			int totalEmpWage=0;
         Employee e= new Employee();

			for(int i=0;i<noOfWorkingDays;i++){
         	int empHrs=e.checkEmployeeAttendanceSwitch();
				empWage=e.calculateWages(empHrs);
				System.out.println("Employee wage: "+empWage);
				totalEmpWage+=empWage;
			}
			System.out.println("Total Employee wage: "+totalEmpWage);

      }
}
