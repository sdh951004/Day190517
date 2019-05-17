package DayTeacher_1;

public class Executive extends Manager{
	//필드 선언
	double stockOption;
	
	//생성자 선언
	Executive(String name, double salary, double bonus, double stockOption){
		super(name,salary,bonus);
		this.stockOption=stockOption;
	}
	
	//스톡옵션 값 리턴 메소드
	double getStockOption() {
		return stockOption;
	}
	
	//급여 인상 메소드 재정의
	@Override
	void raiseSalary() {
		this.salary=this.salary*1.3;
	}
}
