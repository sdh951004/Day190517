package DayTeacher;
/*
 * 사전예약 티켓 티켓번호와 사전예약 일수 정보를 가지고 있음.
 * 언제 예약했는지에 따라 가격 변동.
 * 30일 이전이면 50%할인
 * 10일 이전이면 20%할인
 * 5일 이전이면 10%할인.
 */
public class BookingTicket extends Ticket {
	//필드 선언
	private int bookingDays; //몇일 전 예약을 잡았는지에 대한 필드 선언
	
	//생성자
	BookingTicket(int ticketNum, int bookingDays){
		super(ticketNum); //부모클래스에서 ticketNum필드를 불러옴.
		this.bookingDays=bookingDays;
	}
	
	//예약 일수에 따른 티켓가격 지정을 위한 메소드
	double getPrice() {

		if(bookingDays>=30) {
			ticketPrice = ticketPrice*0.5;
		}
		else if(bookingDays>=10) {
			ticketPrice = ticketPrice *0.8;
		}
		else if(bookingDays>=5) {
			ticketPrice = ticketPrice *0.9;
		}
		return ticketPrice;
	}
	//예약 일수 리턴을 위한 메소드
	int getBookingDays() { //리턴을 되돌려 받기 위해서.. 쓰인다.
		return bookingDays;
	}
	
}
