package Day20190517_4;

public class Truck extends Car{

	
	/*
	 * Truck은 짐을 실을 수 있다라는 문장 출력
	 */
	int weight;
	@Override
	public void Jim() {
		System.out.println("속도가"+speed+"km인"+weight+"kg을 실은 "+color+" 트럭차량 입니다.");
	}
	
}
