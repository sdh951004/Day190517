package DayTeacher_1;

public class Manager extends Employee{
	//필드 선언
	double bonus;
	
	//생성자 선언
	Manager(String name, double salary, double bonus){
		super(name,salary);
		this.bonus=bonus;
	}
	//보너스 값 리턴을 위한 메소드
	double getBonus() {
		return bonus;
	}
	
	//급여인상 처리용 메소드(메소드 재정의)
	@Override	//조건??? 
	void raiseSalary() {
		this.salary=this.salary*1.2;
	}
	
}
