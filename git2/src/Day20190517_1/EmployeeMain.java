package Day20190517_1;

public class EmployeeMain {

	public static void main(String[] args) {
		/*
		 * 각 지급별 직원에 대한 객체를 만들어서
		 * 급여를 인상해주고
		 * 각 직원의 이름, 급여, 보너스 ,스톡옵션을 각각 출력한다.
		 */
		Manager mg=new Manager("신동혁", 3000000, 10000);
		mg.Bonus();
		System.out.println("이름 :"+mg.name+"\n 급여:"+mg.money+"\n 보너스:"+mg.bonus);
		System.out.println("------------");
		Executive ec=new Executive("진민욱", 2500000, 30000);
		ec.Bonus2(20000);
		System.out.println("이름 :"+ec.name+"\n 급여:"+ec.money+"\n 보너스:"+ec.bonus+"\n 스톡 :"+ec.stock);
	}

}
