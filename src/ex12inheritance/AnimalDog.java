package ex12inheritance;

public class AnimalDog extends Animal {
	// 확장한 멤버변수
	private String dogKind; //강아지 종류
	private String name; // 이름
	
	/*
	부모클래스의 species 멤버변수는 private으로 선언되어 자식에서는 접근이 불가능하므로,
	이때는 public으로 선언된 getter 메소드를 통해 접근해야 한다.
	 */
	public void bark() {
		System.out.println("이름이 " + name + "이고 종(" + reSpecies() + ")이 " + dogKind + "인 강아지가 짖는다.");
	}
	public void showDog() {
		/*
		 * 여기서 사용된 super는 부모클래스의 객체를 가리키는 의미로 부모클래스의 showAnimal() 메소드를 호출한다.
		 */
		showAnimal();
		System.out.println("강아지의 종류: " + dogKind);
		System.out.println("이름: " + name);
	}
	// 생성자 메소드
	public AnimalDog(String species, int age, String gender, String dogKind, String name) {
		/*
		자식 클래스에서는 반드시 부모클래스의 객체를 먼저 생성해야 한다.
		여기서 사용된 super()는 부모클래스의 생성자 메소드를 호출하는 용도로 사용된다.
		 */
		super(species, age, gender);
		// 자신의 멤버변수를 초기화한다.
		this.dogKind = dogKind;
		this.name = name;
	}
	
}
