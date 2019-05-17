package Day20190517;
/*
 * 사전예약 티켓. 티켓 번호와 사전예약 일수 정보를 가지고있음.
 * 언제 예매했는지에 따라 가격이 달라짐.
 * -30일 전 : 50% 할인.
 * -10일 전 : 20% 할인.
 * -5일 전: 10% 할인.
 * 
 */
public class BookingTicket extends Ticket {
	
	int date;
	BookingTicket(String Num,String ironman,String groote){
		super(Num,ironman,groote);
	}
	void dates(int date) { 
		this.date=date; 
		if(date>=30) {
			price=price-(price*50/100); 
			System.out.println("할인 금액:"+price);
		}
		else if(date>=10) { // changePrice(); 
			price=price-(price*20/100); 
			System.out.println("할인 금액:"+price);
		}
		else if(date>=5) { // changePrice(); 
			price=price-(price*10/100); 
			System.out.println("할인 금액:"+price); 
			}
		}
	}

