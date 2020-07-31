
class Employee{
	public boolean checkEmployeeAttendance(){
		int isFullTime=1;
		double empCheck=Math.floor(Math.random() * 10) % 2;
		System.out.println(empCheck);
		return empCheck == isFullTime;
	}
}

public class EmpWageBuilderUC1{
	public static void main(String args[]){
		Employee e1 =new Employee();
		boolean isPresent=e1.checkEmployeeAttendance();

		if (isPresent) {
			System.out.println("Employee is Present");
		}
		else
			System.out.println("Employee is Absent");

	}
}
