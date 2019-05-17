package Day20190517_4;

public class Sedan extends Car{

	
	/*
	 * Sedan은 사람을 실을 수 있다라는 문장 출력
	 */
	int human;
	@Override
	public void Jim() {
		System.out.println("속도가"+speed+"km인 "+human+"명을 태운 "+color+" 승용 차량입니다.");
	}
	
}
