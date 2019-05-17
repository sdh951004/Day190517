package Day20190517_5;

public class RemoteControlerMain {

	public static void main(String[] args) {
		//인터페이스 타입의 변수 rc를 선언
		RemoteControl rc;
		
		//rc에 Tv 객체를 대입해서 Tv의 각 메소드 호출
		rc= new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		//rc에 Audio객체를 대입해서 Audio의 각 메소드 호출
		rc= new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(6);
	}

}
