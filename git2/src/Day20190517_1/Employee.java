package Day20190517_1;

public class Employee {
	/*
	 * ������ �̸�, �޿� ������ ������ ����
	 * �޿� �λ� ���� �޼ҵ带 ����.(�λ����� 10%)
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
