package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���� �Ǿ����ϴ�.");
		//���� ������ type �� ������ �ִ� �� ���� �����
		String myName=null; /*(Ű���� ���� �������ְ� Ű�� �ȵ���ִ»����̴�
		null�� �����ϸ� �ȴ�.null�� �⺻������Ÿ�Կ� ���ԺҰ�
		 null�̶� ����־���� �����ϸ� ���������̾ȵ�*/
		
		boolean isRun=false;
		
		if(isRun) {
			myName="�豸��";
		}
		//������ ��� ���� null���� �ƴ����� ����
		//�������� ������ �ؾ� �ϴ� ��찡 �ִ�.
		if(myName==null) {
			System.out.println("myName �� numll �̳�?");
		}
		System.out.println("���� �޼ҵ尡 ���� �˴ϴ�.");
	}
}
 