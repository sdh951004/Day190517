package Day20190517;
/*
 * �Ϲ� Ƽ��. Ƽ���� ����� �� Ƽ�Ϲ�ȣ�� �ſ�ī�� ���� ���� ������ ������ ����.
 * �ſ�ī��� �����ϴ� ��� 5% �ݾ��� �����.
 */
public class NormalTicket extends Ticket{
	String card; 
	NormalTicket(String Num,String ironman, String groote) { 
		super(Num,ironman, groote); }
	void Percent(String card) { 
		this.card=card; 
		if(this.card.equals("VISA")) { 
			changePrice(); 
			price=price+(price*5/100);
			System.out.println("���� �ݾ� :"+price); 
			} 
		}
	}
