package ex12inheritance;
/*
다음 상속관계에 있는 두 클래스의 적절한 생성자를 정의해보자.
main 함수에서는 MyFriendDetailInfo 클래스를 통해서 객체를 생성해야 하고 생성된 정보를 확인할 수 있도록 해보자.
 */
//친구의 정보를 저장할 기본클래스
class MyFriendInfo {
	private String name;
	int age;
  	// 생성자 메서드 정의
	public MyFriendInfo(String name, int age) {
		// 자신의 멤버변수를 초기화한다.
		this.name = name;
		this.age = age;
	}

	public void showMyFriendInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}
//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo extends MyFriendInfo {
	private String addr;
  	private String phone;
  	// 생성자 메서드 정의
	public MyFriendDetailInfo(String name, int age, String addr, String phone) {
		// 부모클래스의 생성자를 호출한다.
		super(name, age);
		// 자신의 멤버변수를 초기화한다.
		this.addr = addr;
		this.phone = phone;
	}

	public void showMyFriendDetailInfo() {
		showMyFriendInfo();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}
public class QuMyFriendDetailInfo {
	public static void main(String[] args) {
		//이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
		MyFriendDetailInfo info = new MyFriendDetailInfo("홍길동", 18, "산골짜기", "010-1234-5678");
		//정보Print
		info.showMyFriendDetailInfo();
	}
}
