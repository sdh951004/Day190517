package Day20190517_4;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * Sedan,Truck�� ���� ��ü ���� �����ؼ�
		 * ���� �� �� �ִ� ���� ��¹����� ���
		 */
		Sedan car=new Sedan();
		car.human=4;
		car.speed=90;
		car.color="���ǵ��";
		car.Jim();
		
		Truck car1=new Truck();
		car1.weight=1600;
		car1.speed=60;
		car1.color="�˻�";
		car1.Jim();
		
	}

}
