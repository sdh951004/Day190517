package Day20190517_2;
//추상클래스인 Phone 클래스 상속
public class SmartPhone extends Phone{
	//생성자 선언
	SmartPhone(String owner){
		super(owner);
	}
	
	//메소드 선언
	public void internetSearch() {
		System.out.println("인터넷 검색");
	}
}
