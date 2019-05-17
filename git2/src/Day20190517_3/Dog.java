package Day20190517_3;
//Animal 클래스 상속
public class Dog extends Animal{ //추상클래스에서 상속 받았을때 부모클래스의 추상메소드에 대한 실체적인 내용을 적어야 한다.
	//부모클래스의 추상메소드를 구체화.
	@Override
	public void sound() {//부모가 접근 제한 넓이를 public으로 생성하였기에 자식도 마찬가지로 public을 써줘야 한다.
		System.out.println("개 : 꺄옥");
	}
	
}
