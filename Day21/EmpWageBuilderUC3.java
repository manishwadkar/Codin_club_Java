class Employee{

      int isFullTime=1;
		int isPartTime=2;
      int wagePerHour=20;

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
}

public class EmpWageBuilderUC3{
      public static void main(String args[]){

         Employee e= new Employee();
         int c=e.checkEmployeeAttendance();


         if(c==1)
            System.out.println("Daily Wage: "+e.calculateWages(8));
         else if(c==2)
				System.out.println("Daily Wage: "+e.calculateWages(4));
			else
            System.out.println("Daily wage is 0");

      }
}
