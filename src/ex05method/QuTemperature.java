package ex05method;

import java.util.Scanner;

public class QuTemperature {

	/*
	섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("섭씨를 입력하세요 : ");
		// 입력받은 숫자를 섭씨로 사용할 변수에 저장
		double celsius = scanner.nextDouble();
		System.out.print("화씨를 입력하세요 : ");
		// 입력받은 숫자를 화씨로 사용할 변수에 저장
		double fahrenheit = scanner.nextDouble();
		
		// 메서드에 섭씨 또는 화씨를 넣어서 프린트문에서 호출 
		System.out.printf("섭씨 %.1f℃를 화씨로 변환하면 %.1f℉\n", celsius, convertCelsius(celsius));
		System.out.printf("화씨 %.1f℉를 섭씨로 변환하면 %.1f℃", fahrenheit, convertFahrenheit(fahrenheit));
	}
	// 온도는 보통 소수점까지 표시되니까 double로 리턴해야하니 double타입으로 선언
	public static double convertCelsius(double temperature) {
		// 섭씨를 화씨로 변환하는 공식
		double cCelsius = 1.8 * temperature + 32;
		// 변환이 완료된 섭씨(즉 화씨라는 소리임)를 리턴
		return cCelsius;
	}
	// 온도는 보통 소수점까지 표시되니까 double로 리턴해야하니 double타입으로 선언
	public static double convertFahrenheit(double temperature) {
		// 화씨를 섭씨로 변환하는 공식
		double cFahrenheit = (temperature - 32) / 1.8;
		// 변환이 완료된 화씨(즉 섭씨라는 소리임)를 리턴
		return cFahrenheit;
	}
	
}
