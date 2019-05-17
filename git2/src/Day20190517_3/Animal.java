package Day20190517_3;
//추상 클래스
public abstract class Animal {
	//필드선언
	public String kind; //동물 종
	//메소드 선언
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	//추상메소드 선언
	public abstract void sound(); //추상메소드 선언할때 중괄호 없으며 세미콜론으로 끝낸다.
}
