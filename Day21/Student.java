public class Student{

	int id=29;
	String name="Manish";

	Student(int id1, String name1){
		id=id1;
		name=name1;
	}

	void display(){
		System.out.println("Through display method ID: "+id);
		System.out.println("Through display method Name: "+name);
	}
	public static void main(String args[]){

		Student student = new Student(33,"qwerty");
		System.out.println(student.id);
		System.out.println(student.name);
		student.display();
	}
}
