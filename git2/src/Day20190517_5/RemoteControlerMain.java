package Day20190517_5;

public class RemoteControlerMain {

	public static void main(String[] args) {
		//�������̽� Ÿ���� ���� rc�� ����
		RemoteControl rc;
		
		//rc�� Tv ��ü�� �����ؼ� Tv�� �� �޼ҵ� ȣ��
		rc= new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		//rc�� Audio��ü�� �����ؼ� Audio�� �� �޼ҵ� ȣ��
		rc= new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(6);
	}

}
