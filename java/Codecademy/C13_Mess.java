/*
1. Mess.java 파일에서 잘못된 유형의 변수를 선언했습니다. 다음 명령을 사용하여 파일을 컴파일하십시오.

2. 할당 값의 유형과 일치하도록 변수의 유형을 변경하십시오.
예를 들어, 연도는 2001로 지정되므로 int여야 합니다.

3. 파일을 다시 컴파일하십시오. 이제 오류 없이 컴파일됩니다!
 */

public class C13_Mess {
    public static void main(String[] args) {
        int year = 2001;
        String title = "Shrek";
        char genre = 'C';
        double runtime = 1.58;
        boolean isPG = true;
    }
}

/*
13 Static Checking 정적 검사
Java 프로그래밍 언어에는 정적 유형 지정이 있습니다. 변수에 잘못된 유형의 값이 지정되면 Java 프로그램이 컴파일되지 않습니다.
이것은 버그, 특히 형식 선언 버그입니다.

벌레는 위험해! 코드가 충돌하거나 잘못된 결과가 생성됩니다.
정적 타이핑은 버그가 코드 실행 중이 아니라 프로그래밍 중에 발견되기 때문에 도움이 됩니다.

변수의 선언된 유형이 할당된 값의 유형과 일치하지 않으면 프로그램이 컴파일되지 않습니다.

```
int greeting = "Hello World";
```
문자열 "Hello World"는 int 유형의 변수에 보관할 수 없습니다.

위의 예에서 컴파일 시 콘솔에 오류가 표시됩니다.

```
error: incompatible types: String cannot be converted to int
    int greeting = "Hello World";
```
컴파일 시 버그가 발견되지 않으면 런타임 오류를 일으켜 코드 실행을 방해합니다. 프로그램이 충돌합니다.
Java의 정적 유형 지정은 프로그래머가 런타임 오류를 피하도록 도와주므로 버그가 없는 훨씬 안전한 코드를 갖게 됩니다.

 */