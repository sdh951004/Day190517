package DayTeacher_1;

public class Executive extends Manager{
	//�ʵ� ����
	double stockOption;
	
	//������ ����
	Executive(String name, double salary, double bonus, double stockOption){
		super(name,salary,bonus);
		this.stockOption=stockOption;
	}
	
	//����ɼ� �� ���� �޼ҵ�
	double getStockOption() {
		return stockOption;
	}
	
	//�޿� �λ� �޼ҵ� ������
	@Override
	void raiseSalary() {
		this.salary=this.salary*1.3;
	}
}
