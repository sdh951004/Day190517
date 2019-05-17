package Day20190517;

public class TicketMain {
	/*
	 * 사전예약 티켓. 일반 예매 티켓을 각각 객체로 만들어서 각 티켓의 번호와 가격을 출력.
	 */

	public static void main(String[] args) {
		BookingTicket ticket=new BookingTicket("2019-05-16","","groote"); 
		ticket.choiceTicket("ironman");
		 ticket.changePrice();
		 ticket.dates(31); 
		 System.out.println("---------------------------------------"); 
		 NormalTicket ticket1=new NormalTicket("05-16-2113","", "groote"); 
		 ticket1.choiceTicket("groote"); 
		 ticket1.changePrice();
		 ticket1.Percent("VISA"); } 
	}


