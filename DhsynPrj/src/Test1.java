
public class Test1 {

	public static void main(String[] args) {
String str1 = "IT �Դϴ�";
String str2 = "10";
String str3 = "20";

str1 = "java�Դϴ�."; // �տ��� ������ ������ �ʱ�ȭ 

System.out.printf("%s \n", str1);
System.out.printf("%s \n", str2 + str3);
// str2,3 �� ���� ���ڿ��� ������⶧���� ���� 30�� �ƴ� 1020 �� ����

int num1 = Integer.parseInt(str1);
//���ڿ� ���·� ����� ���� �������¿� �޸� ������ �־� ���������� ��ȯ 
// Integer : ���������� �������ִ� �ڹ� Ŭ���� 
// parseInt : Integer �ȿ� ���ִ� �Լ� 
int num2 = Integer.parseInt(str3);
//
System.out.println("���ϱ� ��� :" + (num1 + num2));


	
	}

}
