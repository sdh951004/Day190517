package DayTeacher;

public class Ticket {
	//�ʵ� ����
	int ticketNum;
	double ticketPrice;
	
	//������ ����
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


	//�ʵ忡 ���� get/set �޼ҵ� ����	
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
