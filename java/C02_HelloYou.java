/*
텍스트 편집기에는 main() 메서드가 있는 HelloYou 클래스가 포함된 HelloYou.java 파일이 있습니다.

main() 내부에 Hello someName!을 출력하는 문을 추가하고 someName을 대신하는 이름을 사용합니다.
문을 세미콜론으로 끝내야 합니다.

예를 들어 이름이 "Maria"인 경우 프로그램은 Hello Maria!를 인쇄합니다.
*/


public class C02_HelloYou {
    public static void main(String[] args) {
        System.out.println("Hello Maria!");
    }
}

/*
02 안녕 자바 파일!
Java는 다른 플랫폼에서 실행되지만 프로그래머는 동일한 방식으로 작성합니다.
Java 작성을 위한 몇 가지 규칙을 살펴보겠습니다.

지난 실습에서는 HelloWorld.java 파일을 보았습니다.
Java 파일의 확장자는 .java입니다. 일부 프로그램은 하나의 파일이고 다른 프로그램은 수백 개의 파일입니다!

HelloWorld.java 내부에는 다음과 같은 클래스가 있습니다.
```
public class HelloWorld {

}
```
앞으로 클래스에 대해 더 이야기하겠지만 지금은 클래스를 단일 개념으로 생각하십시오.

HelloWorld 개념은 다음과 같습니다. Hello World 프린터.
다른 클래스 개념은 다음과 같습니다. 자전거 또는 저축 계좌.

중괄호 {}를 사용하여 이 개념의 영역을 표시했습니다. 중괄호 안의 구문은 클래스의 일부입니다.

각 파일에는 파일 이름을 딴 하나의 기본 클래스가 있습니다.
클래스 이름: HelloWorld 및 파일 이름: HelloWorld. 모든 단어는 대문자입니다.

클래스 내부에는 프로그램 작업을 나열하는 main() 메서드가 있습니다.

```
public static void main(String[] args) {

}
```
클래스와 마찬가지로 메서드의 시작과 끝을 표시하기 위해 중괄호를 사용했습니다.

public, static 및 void는 앞으로 학습할 구문입니다.
String[] args는 프로그램에 전달하려는 정보의 자리 표시자입니다.
이 구문은 프로그램을 실행하는 데 필요하지만 현재 탐색해야 하는 것보다 더 고급입니다.

우리 프로그램은 또한 화면에 "Hello World"라는 텍스트를 표시했습니다.
이것은 print 문을 사용하여 수행되었습니다.
```
System.out.println("Hello World");
```

*/