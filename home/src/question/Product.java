package question;

 class Product {
	int price; 
	int bonusPoint;    //필드생성

		Product(int price){           
			this.price=price;
			bonusPoint = (int)(price/10.0);
		} //매개변수price 생성자 선언
}
//-------------------------------------------------------
class Tv1 extends Product {
	Tv1(){
		super(100);
	} //기본생성자 생성시 부모 매개변수값 100입력
	
	public String toString(){
		return "Tv";
		} //문자열타입 Tv리턴하는 toString메서드
}
//-------------------------------------------------------
class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
//-------------------------------------------------------
class Buyer {
	int money = 1000;   //초기값설정
	int bonusPoint = 0;
	
	public int getMoney(int money) { 
		System.out.println(money +"을 입금하였습니다.");
		return this.money += money;
	} //getMoney메서드로 입력한money값 더해줌
	
	void buy(Product p) { //매개변수로 Product객체인 p를 입력해줘야함
		if(money<p.price) { //p객체의 필드값 price보다 money가낮을시
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;   //메서드종료
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"을/를 구입하셨습니다.");
		//toString 메서드 이용시 해당객체(여기선 p)를 호출시 리턴된문자열 출력
	}
}