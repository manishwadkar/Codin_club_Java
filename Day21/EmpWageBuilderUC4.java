
//UC4 Same as UC3 just use switch case for computing wages 

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

public class EmpWageBuilderUC4{
      public static void main(String args[]){

         Employee e= new Employee();
         int empHrs=e.checkEmployeeAttendanceSwitch();

			System.out.println("Employee wage: "+e.calculateWages(empHrs));

      }
}
