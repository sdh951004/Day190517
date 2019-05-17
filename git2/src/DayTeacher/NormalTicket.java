package DayTeacher;
/*
 * �Ϲݰ����� �ſ�ī����� ���θ� �Ǻ��Ͽ�
 * �ſ�ī���� ��� 5% ������ �ΰ���.
 */
public class NormalTicket extends Ticket{


	//�ʵ� ����
	private boolean payByCredit;//�ſ�ī������ �ƴ����� �Ǻ��ϱ� ���� boolean Ÿ���� ����
	
	//������ ����
	NormalTicket(int ticketNum, boolean payByCredit) {
		super(ticketNum);
		this.payByCredit=payByCredit;
	}
	//Ƽ�� ���� ������ ���� �޼ҵ�
	@Override
	public double getTicketPrice() {
		if(payByCredit)
			return ticketPrice*1.05;
		else
			return ticketPrice;
	}
//	public boolean isPayByCredit() {//������ ���� �� booleanŸ���� ��� get ��� is�� ��.
//		return payByCredit;
//	}
//	public void setPayByCredit(boolean payByCredit) {
//		this.payByCredit = payByCredit;
//	}
//	
	//ī�� ���� ���θ� �����ϴ� �޼ҵ�(payByCredit �ʵ� �� ����)
	boolean isPayByCredit() {	//������ ���� �� booleanŸ���� ��� get ��� is�� ��.
		return payByCredit;
	}
	
}
