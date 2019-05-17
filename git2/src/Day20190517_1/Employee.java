package Day20190517_1;

public class Employee {
	/*
	 * 직원의 이름, 급여 정보를 가지고 있음
	 * 급여 인상에 대한 메소드를 가짐.(인상율은 10%)
	 */
	String name;
	int money;
	
	Employee(String name, int money){
		this.name=name;
		this.money=money;
	}
	
	void moneyUp() {
		money=(int)(money*1.1);
	}
}
