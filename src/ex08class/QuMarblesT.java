package ex08class;
/*
구슬치기 하는 아이들을 추상화하여 클래스로 정의해보자.
*어린아이가 보유하고 있는 구슬의 개수 정보를 담는다
*놀이를 통해 구슬을 획득 또는 상실하는 것을 표현한다.
*어린이의 현재 보유하고 있는 구슬의 개수를 표현한다.
초기화는 다음과 같이 진행한다.
◆어린이1의 보유갯수 : 구슬 20개
◆어린이2의 보유갯수 : 구슬 15개
게임은 다음과 같이 진행한다.
◆1차게임 : 어린이1은 어린이2의 구슬 5개를 획득한다.
◆2차게임 : 어린이2는 어린이1의 구슬 9개를 획득한다.
# 어린이 객체를 생성시 구슬의 보유갯수는 생성자를 통해 초기화 되어야 한다.
 */
// 구슬치기 하는 아이들을 추상화한 클래스
class ChildPropertyT{
	// 멤버변수 선언 : 어린이가 보유한 구슬의 갯수
	int bead;
	
	// 생성자메서드 정의
	public ChildPropertyT(int bead) {
		this.bead = bead;
		/*
		this의 두가지 활용법
		1. 생성자에서 또다른 생성자 호출(생성자 오버로딩)
			=> this(인수1, 인수2..)
		2. 멤버변수와 매개변수를 구분할때 사용
			=> this.멤버변수명
		 */
	}
	
	// 멤버 메서드
	// 어린이가 보유한 구슬의 갯수를 출력한다.
	void showProperty() {
		System.out.println("보유 구슬의 갯수 : " + bead);
	}
	// 구슬치기 게임을 진행한다.
	void obtainBead(ChildPropertyT child, int beadCnt) {
		/*
		해당 멤버메서드를 호출하는 어린이 객체는 게임에서 승리하여 구슬을 획득해야하고,
		매개변수로 전달되는 어린이 객체는 패배하여 구슬을 상실해야한다
		 */
		// 패배한 어린이 인스턴스는 구슬을 차감한다.
		child.bead -= beadCnt;
		// 승리한 어린이(객체 자신)은 구슬을 증가시킨다.
		this.bead += beadCnt;
	}
}
public class QuMarblesT {

	public static void main(String[] args) {

		ChildPropertyT child1 = new ChildPropertyT(20);
		ChildPropertyT child2 = new ChildPropertyT(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();
		
	}

}
