package DayTeacher_1;

public class Employee {
	//필드 선언
	String name;
	double salary; //월급
	
	//생성자 선언
	Employee(String name, double salary){
		this.name=name;
		this.salary = salary;
	}
	
	//getter만 메소드 선언하는 이유 생성자에서 set값을 받기 때문.
	String getName() { //불러오기 위한 get방식
		return name;
	}
	
	double getSalary() {
		return salary;
	}
	
	//급여 인상 처리용 메소드
	void raiseSalary() {
		this.salary = this.salary*1.1;
	}
}
