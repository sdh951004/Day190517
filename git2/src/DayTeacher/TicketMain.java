package DayTeacher;

public class TicketMain {

	public static void main(String[] args) {
		/*
		 * 사전예약한 티켓 정보와 가격, 신용카드로 결제한 티켓 정보와 가격을 출력.
		 */
		//사전예약 티켓 클래스 객체 생성
		BookingTicket bt = new BookingTicket(100, 50);	//티켓 넘버, 날짜예약일
		bt.setTicketPrice(200000);
		
		System.out.println("당신의 사전예약 티켓 번호는"+bt.getTicketNum()+"이고 구매가격은"+bt.getTicketPrice());
	}

}
