package DayTeacher_1;

public class EmployeeMain {

	public static void main(String[] args) {
		//사원 객체 만들어서 값 출력해보기
		Employee emp=new Employee("사원",200);
		System.out.println("이름 :"+emp.getName());
		System.out.println("급여 :"+emp.getSalary());
		emp.raiseSalary();
		System.out.println("이름 :"+emp.getName());
		System.out.println("급여 :"+emp.getSalary());
		
		Executive exc=new Executive("진민욱",2000000 , 20000, 30);
		exc.raiseSalary();
		System.out.println("이름 :"+exc.getName());
		System.out.println("급여 :"+exc.getSalary());
		
	}

}
