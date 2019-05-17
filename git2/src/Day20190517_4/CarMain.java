package Day20190517_4;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * Sedan,Truck에 대한 객체 각각 생성해서
		 * 각자 할 수 있는 것을 출력문으로 출력
		 */
		Sedan car=new Sedan();
		car.human=4;
		car.speed=90;
		car.color="버건디색";
		car.Jim();
		
		Truck car1=new Truck();
		car1.weight=1600;
		car1.speed=60;
		car1.color="똥색";
		car1.Jim();
		
	}

}
