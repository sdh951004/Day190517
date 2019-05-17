package Day20190517_1;

public class Executive extends Manager{
	/*
	 * 스톡 옵션 있음.
	 * 급여 연상율은 30%
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
