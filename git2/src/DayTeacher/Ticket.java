package DayTeacher;

public class Ticket {
	//필드 선언
	int ticketNum;
	double ticketPrice;
	
	//생성자 선언
	Ticket(int ticketNum){
		this.ticketNum=ticketNum;
	}
//	public Ticket(int ticketNum, double ticketPrice) {
//		this.ticketNum = ticketNum;
//		this.ticketPrice = ticketPrice;
//	}
//	
//
//	public Ticket() {
//	}


	//필드에 대한 get/set 메소드 선언	
	public int getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(int ticketNum) {
		this.ticketNum = ticketNum;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	
	
}
