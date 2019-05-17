package DayTeacher;
/*
 * 일반경제와 신용카드결제 여부를 판별하여
 * 신용카드일 경우 5% 가산비용 부과됨.
 */
public class NormalTicket extends Ticket{


	//필드 선언
	private boolean payByCredit;//신용카드인지 아닌지를 판별하기 위해 boolean 타입을 선언
	
	//생성자 선언
	NormalTicket(int ticketNum, boolean payByCredit) {
		super(ticketNum);
		this.payByCredit=payByCredit;
	}
	//티켓 가격 리턴을 위한 메소드
	@Override
	public double getTicketPrice() {
		if(payByCredit)
			return ticketPrice*1.05;
		else
			return ticketPrice;
	}
//	public boolean isPayByCredit() {//리턴을 받을 때 boolean타입의 경우 get 대신 is를 씀.
//		return payByCredit;
//	}
//	public void setPayByCredit(boolean payByCredit) {
//		this.payByCredit = payByCredit;
//	}
//	
	//카드 결제 여부를 리턴하는 메소드(payByCredit 필드 값 리턴)
	boolean isPayByCredit() {	//리턴을 받을 때 boolean타입의 경우 get 대신 is를 씀.
		return payByCredit;
	}
	
}
