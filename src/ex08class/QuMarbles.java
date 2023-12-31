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
class ChildProperty{
	// 구슬의 갯수를 저장할 멤버변수 선언
	int numOfMarble;
	
	// 구슬의 갯수를 받는 생성자
	public ChildProperty(int numOfMarble) {
		this.numOfMarble = numOfMarble;
	}
	// 현재 구슬의 갯수를 확인하고 출력하는 메서드
	public void showProperty() {
		System.out.println("보유 구슬의 개수 " + this.numOfMarble);
	}
	// 입력받은 child에게서 addMarble만큼의 구슬을 획득하는 메서드
	public void obtainBead(ChildProperty child, int addMarble) {
		// 입력받은 아이에게 addMarble만큼 구슬을 빼고
		child.numOfMarble -= addMarble;
		// 호출한 아이에게 addMarble만큼 구슬을 더한다.
		this.numOfMarble += addMarble;
	}
}
public class QuMarbles {

	public static void main(String[] args) {

		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

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
