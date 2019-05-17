package Day20190517_2;
//추상클래스 선언 abstract
public abstract class Phone {
	/*
	 * 추상클래스 사용하는 이유
	 * -추상클래스는 실체클래스(자식클래스)의 규격을 지정할 수 있음.
	 * 	:규격이라고 하는 것은 필드, 생성자, 메소드를 의미
	 * -실체클래스는 추상클래스에서 정의되지 않은 추가 필드, 메소드만 정의하면 되기 때문에 코드를 줄일 수 있음.
	 * -추상메소드도 정의할 수 있으며 추상메소드는 실행내용이 없는 이름만 선언된 형태임.
	 * -단, 추상클래스는 객체로 만들 수 없음.
	 */
	
	//필드 선언
	public String owner;
	
	//생성자 선언
	public Phone(String owner) {
		this.owner=owner;
	}
	
	//메소드 선언
	public void turnOn() {
		System.out.println("폰 전원 켬");
	}
	
	public void turnOff() {
		System.out.println("폰 전원 끔");
	}
}
