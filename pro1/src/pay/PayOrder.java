package pay;

public class PayOrder {
	
	
	public static Pay PayOrder(String payOption) {
		switch(payOption) {
		case "naver" : return new NaverPay();
		case "kakao" : return new KakaoPay();
		default : return new BadMoney();
		}
		
	}
}
