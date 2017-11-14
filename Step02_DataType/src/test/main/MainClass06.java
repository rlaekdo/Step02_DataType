package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		//참조 데이터 type 을 담을수 있는 빈 변수 만들기
		String myName=null; /*(키값을 담을 공간만있고 키는 안들어있는상태이다
		null를 대입하면 된다.null은 기본데이터타입엔 대입불가
		 null이라도 집어넣어야함 선언만하면 변수선언이안됨*/
		
		boolean isRun=false;
		
		if(isRun) {
			myName="김구라";
		}
		//변수에 담긴 값이 null인지 아닌지에 따라
		//선택적인 동작을 해야 하는 경우가 있다.
		if(myName==null) {
			System.out.println("myName 이 numll 이네?");
		}
		System.out.println("메인 메소드가 종료 됩니다.");
	}
}
 