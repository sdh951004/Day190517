package Day20190517;
/*
 * �������� Ƽ��. Ƽ�� ��ȣ�� �������� �ϼ� ������ ����������.
 * ���� �����ߴ����� ���� ������ �޶���.
 * -30�� �� : 50% ����.
 * -10�� �� : 20% ����.
 * -5�� ��: 10% ����.
 * 
 */
public class BookingTicket extends Ticket {
	
	int date;
	BookingTicket(String Num,String ironman,String groote){
		super(Num,ironman,groote);
	}
	void dates(int date) { 
		this.date=date; 
		if(date>=30) {
			price=price-(price*50/100); 
			System.out.println("���� �ݾ�:"+price);
		}
		else if(date>=10) { // changePrice(); 
			price=price-(price*20/100); 
			System.out.println("���� �ݾ�:"+price);
		}
		else if(date>=5) { // changePrice(); 
			price=price-(price*10/100); 
			System.out.println("���� �ݾ�:"+price); 
			}
		}
	}

