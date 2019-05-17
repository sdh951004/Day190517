package DayTeacher;
/*
 * �������� Ƽ�� Ƽ�Ϲ�ȣ�� �������� �ϼ� ������ ������ ����.
 * ���� �����ߴ����� ���� ���� ����.
 * 30�� �����̸� 50%����
 * 10�� �����̸� 20%����
 * 5�� �����̸� 10%����.
 */
public class BookingTicket extends Ticket {
	//�ʵ� ����
	private int bookingDays; //���� �� ������ ��Ҵ����� ���� �ʵ� ����
	
	//������
	BookingTicket(int ticketNum, int bookingDays){
		super(ticketNum); //�θ�Ŭ�������� ticketNum�ʵ带 �ҷ���.
		this.bookingDays=bookingDays;
	}
	
	//���� �ϼ��� ���� Ƽ�ϰ��� ������ ���� �޼ҵ�
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
	//���� �ϼ� ������ ���� �޼ҵ�
	int getBookingDays() { //������ �ǵ��� �ޱ� ���ؼ�.. ���δ�.
		return bookingDays;
	}
	
}
