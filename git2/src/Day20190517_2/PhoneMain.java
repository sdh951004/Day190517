package Day20190517_2;

public class PhoneMain {

	public static void main(String[] args) {
		//SmartPhone 클래스 객체 생성
		SmartPhone sp=new SmartPhone("주인님");
		
		sp.turnOn();
		sp.turnOff();
		sp.internetSearch();
		
		//추상클래스는 객체를 생성할 수 없다.
		//Phone p = new Phone("헐랭");
		
	}
	
	
}
