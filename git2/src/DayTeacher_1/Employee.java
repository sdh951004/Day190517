package DayTeacher_1;

public class Employee {
	//�ʵ� ����
	String name;
	double salary; //����
	
	//������ ����
	Employee(String name, double salary){
		this.name=name;
		this.salary = salary;
	}
	
	//getter�� �޼ҵ� �����ϴ� ���� �����ڿ��� set���� �ޱ� ����.
	String getName() { //�ҷ����� ���� get���
		return name;
	}
	
	double getSalary() {
		return salary;
	}
	
	//�޿� �λ� ó���� �޼ҵ�
	void raiseSalary() {
		this.salary = this.salary*1.1;
	}
}
