package DayTeacher;

public class TicketMain {

	public static void main(String[] args) {
		/*
		 * ���������� Ƽ�� ������ ����, �ſ�ī��� ������ Ƽ�� ������ ������ ���.
		 */
		//�������� Ƽ�� Ŭ���� ��ü ����
		BookingTicket bt = new BookingTicket(100, 50);	//Ƽ�� �ѹ�, ��¥������
		bt.setTicketPrice(200000);
		
		System.out.println("����� �������� Ƽ�� ��ȣ��"+bt.getTicketNum()+"�̰� ���Ű�����"+bt.getTicketPrice());
	}

}
