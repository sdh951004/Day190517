package DayTeacher_1;

public class Manager extends Employee{
	//�ʵ� ����
	double bonus;
	
	//������ ����
	Manager(String name, double salary, double bonus){
		super(name,salary);
		this.bonus=bonus;
	}
	//���ʽ� �� ������ ���� �޼ҵ�
	double getBonus() {
		return bonus;
	}
	
	//�޿��λ� ó���� �޼ҵ�(�޼ҵ� ������)
	@Override	//����??? 
	void raiseSalary() {
		this.salary=this.salary*1.2;
	}
	
}
