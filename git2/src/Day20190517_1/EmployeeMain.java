package Day20190517_1;

public class EmployeeMain {

	public static void main(String[] args) {
		/*
		 * �� ���޺� ������ ���� ��ü�� ����
		 * �޿��� �λ����ְ�
		 * �� ������ �̸�, �޿�, ���ʽ� ,����ɼ��� ���� ����Ѵ�.
		 */
		Manager mg=new Manager("�ŵ���", 3000000, 10000);
		mg.Bonus();
		System.out.println("�̸� :"+mg.name+"\n �޿�:"+mg.money+"\n ���ʽ�:"+mg.bonus);
		System.out.println("------------");
		Executive ec=new Executive("���ο�", 2500000, 30000);
		ec.Bonus2(20000);
		System.out.println("�̸� :"+ec.name+"\n �޿�:"+ec.money+"\n ���ʽ�:"+ec.bonus+"\n ���� :"+ec.stock);
	}

}
