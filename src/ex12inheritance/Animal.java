package ex12inheritance;

public class Animal {
	// 멤버변수 : 특정한 연산이 없다면 대부분의 멤버변수는 String으로 정의한다.
	private String species; // 동물의 종류
	private int age; // 나이
	private String gender; // 성별
	
	// 멤버 메소드 : 현재 상태를 출력
	public void showAnimal(){
		System.out.println("동물의 종류: " + species);
		System.out.println("나이: " + age);
		System.out.println("성별: " + gender);
	}
	// 생성자 메소드 : 3개의 멤버변수를 초기화한다.
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	/*
	부모클래스의 멤버가 private인 경우 자식클래스에서 접근이 불가능하므로 반드시 getter/setter 메소드를 통해 접근해야한다.
	-getter : private멤버를 반환할때 사용
	-setter : 값을 설정할때 사용
	 */
	public String reSpecies() {
		return species;
	}
}
