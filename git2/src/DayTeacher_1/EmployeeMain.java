package DayTeacher_1;

public class EmployeeMain {

	public static void main(String[] args) {
		//��� ��ü ���� �� ����غ���
		Employee emp=new Employee("���",200);
		System.out.println("�̸� :"+emp.getName());
		System.out.println("�޿� :"+emp.getSalary());
		emp.raiseSalary();
		System.out.println("�̸� :"+emp.getName());
		System.out.println("�޿� :"+emp.getSalary());
		
		Executive exc=new Executive("���ο�",2000000 , 20000, 30);
		exc.raiseSalary();
		System.out.println("�̸� :"+exc.getName());
		System.out.println("�޿� :"+exc.getSalary());
		
	}

}
