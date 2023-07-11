package ex12inheritance;
/*
상속관계에 놓여있는 클래스의 생성자 정의 및 호출방식을 기본으로 다음 클래스의 적절한 생성자를 삽입해보자.
그리고 이의 확인을 위한 main 메소드도 적절히 정의해보자.
 */
/*
상속관계가 있는 클래스에서 자식클래스를 통해 인스턴스를 생성할때에는 반드시 부모클래스의 인스턴스를 먼저 생성해야한다.
이때 super()를 사용해서 부모의 생성자를 호출한다.
 */
class Car {
   	int gasoline;
   	public Car(int gasoline) {
   		this.gasoline = gasoline;
   	}
}
class HybridCar extends Car {
   	int electric;
   	// 인수 1개를 부모로 전달하고 멤버변수를 초기화한다.
   	public HybridCar(int gasoline, int electric) {
   		super(gasoline);
   		this.electric = electric;
   	}
}
class HybridWaterCar extends HybridCar {
   	int water;
   	// 부모클래스로 2개의 인수를 전달하고, 1개는 멤버면수를 초기화한다.
   	public HybridWaterCar(int gasoline, int electric, int water) {
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
