package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class Friend {
	String name;
	String phone;
	String addr;
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	public void showAllData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + addr);
	}
	public void showBasicInfo()	{}
}
class HighFriend extends Friend {
	String nickname;
	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}
	@Override
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)==");
		super.showAllData();
		System.out.println("별명 : " + nickname);
	}
	@Override
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("별명 : " + nickname);
		System.out.println("전번 : " + phone);
	}
}
class UnivFriend extends Friend {
	String major;
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	@Override
	public void showAllData() {
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공 : " + major);
	}
	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
	}
}
// 메인클래스
public class MyFriendInfoList {
	public static void menuShow() {
		System.out.println("######### 메뉴를 입력하세요 #########");
		System.out.print("1.고딩친구입력 ");
		System.out.println("2.대딩친구입력");
		System.out.print("3.전체정보출력 ");
		System.out.println("4.간략정보출력");
		System.out.print("5.검색 ");
		System.out.print("6.삭제 ");
		System.out.println("7.프로그램종료");
		System.out.print("메뉴선택>>>");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		컬렉션은 인스턴스 생성시 크기를 지정할 필요가 없다.
		데이터의 갯수에 따라 자동으로 증가된다.
		 */
		FriendInfoHandler handler = new FriendInfoHandler();
		
		while(true) {
			// 1. 메뉴를 출력한다.
			menuShow();
			
			// 2. 사용자는 수행할 기능의 메뉴를 선택한다.
			int choice = scan.nextInt();
			
			// 3. 선택한 번호에 따라 switch문으로 각 메서드를 호출한다.
			switch(choice) {
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deletInfo();
				break;
			case 7:
				System.out.println("프로그램종료");
				return;
			}
		}
	}
}
/*
해당 프로그램에서 기능을 담당하는 클래스로 핸들러 혹은 매니져 클래스라고 부른다.
 */
class FriendInfoHandler {
	// 멤버변수
//	private Friend[] myFriends;
//	private int numOfFriends;
	/*
	기존 인스턴스배열에 저장했던것을 컬렉션으로 변경한다.
	컬렉션은 제네릭을 기반으로 하므로 인스턴스 생성시 저장할 객체의 타입을 결정하게된다.
	여기서는 Friend클래스를 상속한 High, Univ를 저장할 것이므로 아래와 같이 선언하면된다.
	 */
	ArrayList<Friend> myFriends;
	
	
	// 생성자 : 컬렉션은 데이터 저장시 자동인덱싱이 되므로 크기는 필요없다.
	public FriendInfoHandler() {
		// 정보를 저장할 인스턴스 배열을 생성한다.
//		myFriends = new Friend[num];
		// 배열의 인덱스는 0부터 시작이므로 이와같이 초기화한다.
//		numOfFriends = 0;
		/*
		생성자에세 정보를 저장할 List계열의 컬렉션을 생성한다.
		 */
		myFriends = new ArrayList<Friend>();
		
	}
	
	/*
	연습문제] List컬렉션을 기반으로 친구(고딩/대딩) 정보를 추가하는 프로그램을 작성하시오.
		1차는 추가/출력1/출력2 까지 진행합니다.
		출력1은 확장 for문을 통해 구현하세요.
		출력2는 이터레이터를 통해 구현하세요.
	 */
	// 친구 정보 추가
	public void addFriend(int choice) {
		/*
		고딩 or 대딩 모두 기본정보가 있으므로 먼저 입력받는다.
		 */
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		// 공통정보를 입력받는다.
		System.out.print("이름: ");
		iName = scan.nextLine();
		System.out.print("전화번호: ");
		iPhone = scan.nextLine();
		System.out.print("주소: ");
		iAddr = scan.nextLine();
		
		if(choice==1) {
			// 고딩 친구 정보 추가
			System.out.print("별명: ");
			iNickname = scan.nextLine();
			/*
			High인스턴스를 생성한다.
			해당 인스턴스는 자신의 타입이나 부모타입인 Friend에 저장할 수 있다.
			 */
			Friend hFriend = new HighFriend(iName, iPhone, iAddr, iNickname);
			myFriends.add(hFriend);
		}else if(choice==2) {
			// 대딩 친구 정보 추가
			System.out.print("전공: ");
			iMajor = scan.next();
			// Univ인스턴스 생성
			myFriends.add(new UnivFriend(iName, iPhone, iAddr, iMajor));
		}
		/*
		기존 객체배열은 정보를 추가할때마다 인덱싱을 위해 변수를 ++하는 부분이 필요했지만,
		List의 경우 자동인덱싱을 지원하므로 단지 추가만 해주면 된다.
		추가시에는 add()를 사용한다.
		 */
	}
	
	// 저장된 연락처 전체정보 출력(확장for문 사용)
	public void showAllData() {
		/*
		확장for문의 형식
			=> for(저장된타입 참조변수 : 반복할 배열 혹은 컬렉션)
		 */
		for(Friend fr : myFriends) {
			fr.showAllData();
		}
	}
	// 저장된 연락처 간략정보 출력(이터레이터 사용)
	public void showSimpleData() {
		Iterator<Friend> itr = myFriends.iterator();
		while(itr.hasNext()) {
			itr.next().showBasicInfo();
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	/*
	연습문제] 이름을 입력받아 연락처를 검색하는 메서드를 작성하시오.
	 */
	// 연락처 정보 검색
	public void searchInfo() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String searchName = scan.nextLine();
//		for(Friend fr : myFriends) {
//			if(searchName.compareTo(fr.name)==0) {
//				System.out.println(searchName + "의 연락처 : " + fr.phone);
//			}
//		}
		// 저장된 갯수만큼 반복해서 검색
		for(Friend fr : myFriends) {
			// 입력한 이름과 일치하는 항목을 찾는다.
			if(searchName.equals(fr.name)) {
				fr.showAllData();
				isFind = true;
			}
		}
		if(isFind) {
			System.out.println("일치하는 정보를 찾았습니다.");
		}else {
			System.out.println("일치하는 정보가 없습니다.");
		}
	}
	/*
	오늘의숙제] 삭제할 이름을 입력받은 후 삭제하는 메서드를 구현하시오.
	 */
	// 연락처 정보 삭제
	public void deletInfo() {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("삭제할 친구의 이름을 입력하세요 : ");
//		String dFriend = scan.next();
//		for(Friend fr : myFriends) {
//			if(dFriend.compareTo(fr.name)==0) {
//				System.out.println(dFriend + " 친구의 정보를 삭제했습니다.");
//				myFriends.remove(fr);
//				return;
//			}
//		}
//		System.out.println(dFriend + " 친구의 정보는 없습니다.");
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요:");
		String deletName = scan.nextLine();
		
		Iterator<Friend> itr = myFriends.iterator();
		while(itr.hasNext()) {
			// 해당 루프의 객체 참조값을 변수에 저장한다.
			Friend fr = itr.next();
			// 이름이 일치하는지 확인한다.
			if(fr.name.equals(deletName)) {
				// 참조값을 통해 객체를 삭제한다.
				myFriends.remove(fr);
				isFind = true;
				// 삭제후 루프를 탈출한다.
				break;
			}
		}
		if(isFind==true) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("검색된 이름이 없습니다.");
		}
	}
		
}
