package Day20190517;

public class TicketMain {
	/*
	 * �������� Ƽ��. �Ϲ� ���� Ƽ���� ���� ��ü�� ���� �� Ƽ���� ��ȣ�� ������ ���.
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


