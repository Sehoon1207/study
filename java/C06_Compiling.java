/*
1. 터미널에 명령어를 입력하여 파일을 컴파일하고 실행하는 연습을 해보자!

우리의 텍스트 편집기에는 깨진 프로그램이 포함되어 있으므로 컴파일러가 실수를 잡는 데 어떻게 도움이 되는지 확인할 수 있습니다.
어떤 수정도하지 마십시오!
터미널에서 javac Compiling.java 명령을 입력하고 Enter 또는 Return을 누릅니다.
그런 다음 작업 확인 버튼을 클릭하여 작업을 확인하고 다음 체크포인트로 이동합니다.

2. 오류가 보이십니까?

컴파일러는 인쇄 문 중 하나에 세미콜론이 누락되어 있다고 알려줍니다.
터미널에서 ls를 입력하고 return 또는 enter를 누릅니다.
ls는 "list"의 약자이며 이 명령은 사용 가능한 모든 파일을 나열합니다.
하나의 파일만 있습니다. Compiling.java, 오류 때문에 파일을 성공적으로 컴파일하지 못했습니다.
작업 확인 버튼을 클릭하여 다음 체크포인트로 이동합니다.

3. 텍스트 편집기에서 누락된 세미콜론을 추가한 다음 작업 확인 버튼을 클릭합니다.
다음 연습에서 이 파일을 컴파일하고 실행할 것입니다!

*/

/*
1. 프로그램을 컴파일하고 실행해 봅시다!
컴파일되지 않은 .java 파일을 보려면 터미널에서 ls 명령을 실행하십시오.
각 체크포인트를 완료한 후 작업 확인 버튼을 누르세요.

2. 터미널에서 파일을 컴파일한 후 작업 확인 버튼을 누릅니다.


3. 새 .class 파일을 보려면 ls를 다시 입력하십시오.
터미널에서 실행 파일을 실행한 후 작업 확인 버튼을 누릅니다.

*/

public class C06_Compiling {
    public static void main(String[] args) {

        System.out.println("Java is a class-based language.");
        System.out.println("Java classes have a 'main' method.");
        System.out.println("Java statements end with a semicolon.");

        System.out.println("Programming is... fun!");

    }
}

/*
06 Compilation: Catching Errors

편집: 오류 잡기
Java는 컴파일된 프로그래밍 언어입니다.
즉, .java 파일에 작성하는 코드는 컴퓨터의 Java Virtual Machine에서 실행되기 전에 컴파일러에 의해 바이트 코드로 변환됩니다.
컴파일러는 인간에게 친숙한 프로그래밍 언어를 컴퓨터가 실행할 수 있는 다른 프로그래밍 언어로 번역하는 프로그램입니다.

이전 연습에서는 자동으로 파일을 컴파일하고 실행했습니다.
오프 플랫폼 개발 환경(Off-platform development environments)도 파일을 컴파일하고 실행할 수 있지만
Java 개발의 이러한 측면을 이해하는 것이 중요하므로 직접 수행하겠습니다.

컴파일 프로세스는 컴퓨터가 코드를 실행하기 전에 실수를 포착합니다.

Java 컴파일러는 코드를 변환하는 동안 일련의 검사를 실행합니다. 이러한 검사를 통과하지 못한 코드는 컴파일되지 않습니다.

이 연습에서는 대화형 터미널을 사용합니다. 더 배우고 싶다면 Codecademy는 명령줄에 대한 강의를 제공합니다.

예를 들어 Plankton.java라는 파일을 터미널 명령으로 컴파일할 수 있습니다.

```
javac Plankton.java
```

성공적인 컴파일은 .class 파일인 Plankton.class를 생성하며 터미널 명령으로 실행합니다.

```
java Plankton
```

실패한 컴파일은 오류 목록을 생성합니다. 오류가 수정되고 컴파일 명령이 다시 실행될 때까지 .class 파일이 만들어지지 않습니다.


07 Compilation: Creating Executables 컴파일: 실행 파일 만들기

컴파일은 우리가 오류를 잡는 데 도움이 되었습니다. 이제 파일을 수정했으므로 성공적인 컴파일 과정을 살펴보겠습니다.
참고로 다음 명령을 사용하여 터미널에서 .java 파일을 컴파일할 수 있습니다.

```
javac Whales.java
```

파일이 성공적으로 컴파일되면 이 명령은 FileName.class라는 실행 가능한 클래스를 생성합니다.
실행 가능은 터미널에서 이 프로그램을 실행할 수 있음을 의미합니다.
다음 명령으로 실행 파일을 실행합니다.

```
java Whales
```

파일 이름의 .class 부분은 생략합니다.
예를 들어 전체 컴파일 사이클은 다음과 같습니다.

```
// within the file: Welcome.java
public class Welcome {
  public static void main(String[] args) {
    System.out.println("Welcome to Codecademy's Java course!");
  }
}
```

하나의 파일이 있습니다: Welcome.java. 다음 명령으로 컴파일합니다.

```
javac Welcome.java
```

터미널에는 성공적인 컴파일을 나타내는 오류가 표시되지 않습니다.

이제 두 개의 파일이 있습니다.

1. Java 구문이 포함된 원래 파일인 Welcome.java.
2. Java 바이트코드가 포함된 컴파일된 파일인 Welcome.class는 Java Virtual Machine에서 실행할 준비가 되어 있습니다.

다음 명령을 사용하여 컴파일된 클래스를 실행할 수 있습니다.
```
java Welcome
```

다음이 화면에 인쇄됩니다.

```
Welcome to Codecademy's Java course!
```

08  Java Review: Putting It All Together 자바 리뷰: 종합하기

이 단원에서는 Java로 첫 번째 프로그램을 작성하기 시작했습니다.

또한 Java 프로그램을 작성하는 방법에 대한 규칙과 지침도 배웠습니다.

Java 프로그램에는 적어도 하나의 클래스와 하나의 main() 메서드가 있습니다.
각 클래스는 하나의 실제 아이디어를 나타냅니다.
main() 메서드는 프로그램의 작업을 실행합니다.
Java 주석은 인간 독자에게 유용한 컨텍스트를 추가합니다.
Java에는 공백, 중괄호 및 세미콜론이 있습니다.
공백은 사람이 코드를 쉽게 읽을 수 있도록 하는 것입니다.
중괄호는 클래스와 메서드의 범위를 표시합니다.
세미콜론은 문의 끝을 표시합니다.
자바는 컴파일된 언어입니다.
컴파일은 우리 코드에서 실수를 잡아냅니다.
컴파일러는 코드를 실행 가능한 클래스로 변환합니다.

*/