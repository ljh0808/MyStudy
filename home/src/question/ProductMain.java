package question;

public class ProductMain {

	public static void main(String[] args) {

		
		Buyer kim = new Buyer();  
		System.out.println(kim.money);
		kim.getMoney(1000);
		
		Product pd = new Tv1();
		kim.buy(pd);
		System.out.println(kim.bonusPoint);
		System.out.println(kim.money);
		
	}

}
