package Day20190517;
/*
 * �� Ƽ���� Ƽ�� ��ȣ�� ���� ������ ������ ����.
 * Ƽ���� ������ ���� ������.
 */

public class Ticket {
	String Num; String ironman; 
	String groote;
	int price; String 
	ticketname=null; 
	Ticket(){ } 
	Ticket(String Num,String ironman, String groote){ 
		this.Num=Num; this.ironman=ironman; this.groote=groote;
		} 
	boolean choiceTicket(String ticketname) { 
		this.ticketname=ticketname;
		if(ticketname.equals("ironman")) { 
			//if(ironman.equals(ironman)) { 
			System.out.println("���̾�� ��ȭ Ƽ���Դϴ�. \n Ƽ�� �ѹ��� :"+Num); 
			return true; 
			} else { 
				System.out.println("�׷�Ʈ ��ȭ Ƽ���Դϴ�. \n Ƽ�� �ѹ��� :"+Num); 
			return false; 
			} 
		}
	void changePrice() { 
		if(ticketname.equals("ironman")) { 
			//if(ironman.equals(ironman)) { 
			price=28000;
			} 
		else { 
			price=25000; 
			}
		} 
	
		}
	
		
	

