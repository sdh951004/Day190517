package Day20190517_1;

public class Manager extends Employee{
	/*
	 * 보너스도 있음
	 * 급여 인상율은 20%
	 */
	
	int bonus;
	
	Manager(String name, int money, int bonus){
		super(name, money);
		this.bonus=bonus;
	}
	
	
	void Bonus(){
		moneyUp();		
		money=(int) ((money*1.1)+bonus);
	}
}
