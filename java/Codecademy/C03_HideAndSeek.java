/*
1. main() 내부와 print 문 System.out.println("Let's play hide and seek.");
아래에서 System.out.print()를 사용하여 다음 두 문을 출력합니다.
"Three..."
"Two..."

2. 이전 문 아래에 System.out.println()을 사용하여 다음 두 텍스트 값을 출력합니다.

"One..."
"Ready or not, here I come!"

*/

public class C03_HideAndSeek {
    public static void main(String[] args) {
        System.out.println("Let's play hide and seek.");
        System.out.print("Three...");
        System.out.print("Two...");
        System.out.println("One...");
        System.out.println("Ready or not, here I come!");
    }
}

/*
03 Print Statements 인쇄문
이전 프로그램의 이 명령어를 자세히 살펴보겠습니다.

```
System.out.println("Hello World");
```

Print 문은 화면에 정보를 출력합니다(출력 터미널이라고도 함).
이 코드 줄을 좀 더 세분화해 보겠습니다. 여기에 있는 용어 중 일부가 생소하더라도 걱정하지 마십시오.
나중에 이 모든 것이 무엇인지 훨씬 더 자세히 알아볼 것입니다!

System은 프로그램에 유용한 도구가 포함된 내장 Java 클래스입니다.
out은 "출력"의 줄임말입니다.
println은 "print line"의 줄임말입니다.

프로그램이 값을 출력한 후 화면에 새 줄을 생성하기를 원할 때마다 System.out.println()을 사용할 수 있습니다.

```
System.out.println("Hello World");
System.out.println("Today is a great day to code!");
```
"Hello World"가 인쇄된 후 출력 터미널은 출력할 다음 명령문에 대한 새 라인을 생성합니다.
이 프로그램은 다음과 같이 새 줄에 각 명령문을 인쇄합니다.

```
Hello World
Today is a great day to code!
```

System.out.print()를 사용하여 정보를 출력할 수도 있습니다.
우리는 println()이 아니라 print()를 사용하고 있음에 주목하십시오.
System.out.println()과 달리 이 유형의 print 문은 모든 것을 같은 줄에 출력합니다.

예를 들어:

```
System.out.print("Hello ");
System.out.print("World");
```
위의 코드는 다음과 같이 출력됩니다.

```
Hello World
```
이 예에서 print() 또는 println()을 다시 사용하면 새 텍스트가 World 바로 뒤에 같은 줄에 인쇄됩니다.
프로그램의 "커서"를 떠난 위치를 기억하는 것이 중요합니다. println()을 사용하면 커서가 다음 줄로 이동합니다.
print()를 사용하면 커서가 같은 줄에 유지됩니다.

참고: 이 연습 이후로 모든 연습에서는 System.out.println()을 사용하여 값을 출력합니다.
그러나 아래 체크포인트에서 System.out.print() 문을 사용하여 연습하게 됩니다.



*/