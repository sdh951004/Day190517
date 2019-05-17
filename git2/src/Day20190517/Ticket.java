package Day20190517;
/*
 * 각 티켓은 티켓 번호와 가격 정보를 가지고 있음.
 * 티켓의 가격은 변경 가능함.
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
			System.out.println("아이언맨 영화 티켓입니다. \n 티켓 넘버는 :"+Num); 
			return true; 
			} else { 
				System.out.println("그루트 영화 티켓입니다. \n 티켓 넘버는 :"+Num); 
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
	
		
	

