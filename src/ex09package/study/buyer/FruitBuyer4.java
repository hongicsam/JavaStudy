package ex09package.study.buyer;

import ex09package.study.seller.FruitSeller4;

//구매자를 추상화 한 클래스
public class FruitBuyer4 {
	// 멤버변수 : 보유금액, 구매한 사과의 갯수
	int myMoney = 5000;
	int numOfApple = 0;
	
	// 멤버메서드
	public FruitBuyer4(int _myMoney, int _numOfapple) {
		myMoney = _myMoney;
		numOfApple = _numOfapple;
	}
	
	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	// 구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액 : " + myMoney);
		System.out.println("[구매자]사과갯수 " + numOfApple);
	}
}