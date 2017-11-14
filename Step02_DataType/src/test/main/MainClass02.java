package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//국어점수
		int kor=95;
		//영어점수
		int eng=100;
		// 국어 영어 점수의 평균을 구해서 출력하고 싶다면?
		
		//두점수의 합
		int sum=kor+eng;
		/*
		 *   정수 끼리 연산 하면 결과는 정수
		 *   정수와 실수 와 연산하면 결과는 실수
		 * 
		 */
		//평균
		double ave=sum/2d; //sum이 정수이므로 분모를 실수로 바꿔줌 (결과는 실수)
		
		System.out.println("평균:"+ave);
		
	}
				
}
