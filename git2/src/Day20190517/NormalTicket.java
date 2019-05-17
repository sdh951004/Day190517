package Day20190517;
/*
 * 일반 티켓. 티켓이 발행될 때 티켓번호와 신용카드 결제 여부 정보를 가지고 있음.
 * 신용카드로 결제하는 경우 5% 금액이 가산됨.
 */
public class NormalTicket extends Ticket{
	String card; 
	NormalTicket(String Num,String ironman, String groote) { 
		super(Num,ironman, groote); }
	void Percent(String card) { 
		this.card=card; 
		if(this.card.equals("VISA")) { 
			changePrice(); 
			price=price+(price*5/100);
			System.out.println("할인 금액 :"+price); 
			} 
		}
	}

