package Day20190517_3;
//�߻� Ŭ����
public abstract class Animal {
	//�ʵ弱��
	public String kind; //���� ��
	//�޼ҵ� ����
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	//�߻�޼ҵ� ����
	public abstract void sound(); //�߻�޼ҵ� �����Ҷ� �߰�ȣ ������ �����ݷ����� ������.
}
