package Day20190517_1;

public class Executive extends Manager{
	/*
	 * ���� �ɼ� ����.
	 * �޿� �������� 30%
	 */
	double stock;
	Executive(String name, int money, int bonus) {
		super(name, money, bonus);
	}
	
	void Bonus2(int stock) {
		this.stock=stock;
		moneyUp();
		money=(int) ((money*1.2)+stock);
	}

}
