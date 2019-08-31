package basic;

public class employee {
	int empId;
	double salary;
	char grade;
	/*employee(int empId,double salary,char grade)
	{
		this.empId=empId;
		this.salary=salary;
		this.grade=grade;
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1=new employee(100,1000.0,'a');
				employee e2=new employee(101,2000.0,'b');
						employee e3=new employee(102,3000.0,'c');
						System.out.println(e1.grade+"   " + e1.salary);
						System.out.println(e2.empId);
						System.out.println(e3.empId);
	}
	/*public employee(int Id, double salary, char grade) {
		super();
		this.empId = Id;
		this.salary = salary;
		this.grade = grade;
	}*/
	public employee(int empId, double salary, char grade) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.grade = grade;
	}

}
