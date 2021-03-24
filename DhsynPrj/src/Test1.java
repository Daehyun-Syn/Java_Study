
public class Test1 {

	public static void main(String[] args) {
String str1 = "IT 입니다";
String str2 = "10";
String str3 = "20";

str1 = "java입니다."; // 앞에서 선언한 내용을 초기화 

System.out.printf("%s \n", str1);
System.out.printf("%s \n", str2 + str3);
// str2,3 의 값이 문자열로 선언됬기때문에 값은 30이 아닌 1020 이 나옴

int num1 = Integer.parseInt(str1);
//문자열 형태로 저장된 값을 정수형태에 메모리 공간에 넣어 정수값으로 변환 
// Integer : 정수값으로 변경해주는 자바 클래스 
// parseInt : Integer 안에 들어가있는 함수 
int num2 = Integer.parseInt(str3);
//
System.out.println("더하기 결과 :" + (num1 + num2));


	
	}

}
