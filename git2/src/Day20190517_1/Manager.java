package Day20190517_1;

public class Manager extends Employee{
	/*
	 * ���ʽ��� ����
	 * �޿� �λ����� 20%
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
