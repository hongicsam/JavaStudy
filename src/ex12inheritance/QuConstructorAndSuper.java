package ex12inheritance;
/*
상속관계에 놓여있는 클래스의 생성자 정의 및 호출방식을 기본으로 다음 클래스의 적절한 생성자를 삽입해보자.
그리고 이의 확인을 위한 main 메소드도 적절히 정의해보자.
 */
class Car {
   	int gasoline;
   	// Car 생성자 정의
   	public Car(int gasoline) {
   		this.gasoline = gasoline;
   	}
}
class HybridCar extends Car {
   	int electric;
   	// HybridCar 생성자 정의
   	public HybridCar(int gasoline, int electric) {
   		// 부모클래스인 Car를 호출
   		super(gasoline);
   		this.electric = electric;
   	}
}
class HybridWaterCar extends HybridCar {
   	int water;
   	// HybridWaterCar 생성자 정의
   	public HybridWaterCar(int gasoline, int electric, int water) {
   		// 부모클래스 Car를 호출한 부모클래스인 HybridCar를 호출
		super(gasoline, electric);
		this.water = water;
	}


	public void showNowGauge() {
     	System.out.println("남은가솔린:"+gasoline);
     	System.out.println("남은전기량:"+electric);
     	System.out.println("남은워터량:"+water);
   	}
}
public class QuConstructorAndSuper {

	public static void main(String[] args) {
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}
}
