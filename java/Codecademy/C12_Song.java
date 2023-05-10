/*
1. 값이 "Yesterday, all my troubles seemed so far away"인 openingLyrics라는 변수를 만듭니다.

2. openingLyrics를 인쇄하려면 System.out.println()을 호출하십시오.
 */

public class C12_Song {
    public static void main(String[] args) {
        String openingLyrics = "Yesterday, all my troubles seemed so far away";
        System.out.println(openingLyrics);
    }
}

/*
가죽 끈
지금까지 기본 제공 동작이 없는 가장 단순한 데이터 유형인 기본 데이터 유형을 배웠습니다.
우리 프로그램은 또한 프리미티브 대신 객체인 문자열을 사용합니다. 개체에는 기본 제공 동작이 있습니다.

문자열은 일련의 문자를 보유합니다. 예를 들어 "Hello World"를 출력했을 때 문자열의 인스턴스를 이미 본 적이 있습니다.
String 개체를 만드는 방법에는 String 리터럴을 사용하거나 String 클래스를 호출하여 새 String 개체를 만드는 두 가지 방법이 있습니다.

문자열 리터럴은 큰따옴표("")로 묶인 일련의 문자입니다. 기본 유형 변수와 마찬가지로 유형을 먼저 지정하여 String 변수를 선언합니다.
```
String greeting = "Hello World";
```
다음과 같이 String을 선언할 때 String 클래스를 호출하여 새로운 String 객체를 생성할 수도 있습니다.
```
String salutations = new String("Hello World");
```

String 리터럴을 사용하여 String을 생성하는지 또는 새 String 객체를 사용하여 생성하는지에 따라 동작에 미묘한 차이가 있습니다.
나중에 자세히 살펴보겠지만 지금은 거의 항상 문자열 리터럴을 사용할 것입니다.

Keep Reading: AP Computer Science A Students

이스케이프 시퀀스로 알려진 특정 기호는 Java 인쇄 문에서 다른 용도로 사용됩니다. 이스케이프 시퀀스는 컴파일러에서 다른 문자와 다르게 해석됩니다. 이스케이프 문자는 \로 시작합니다.

AP 시험에 대해 알아야 할 세 가지 이스케이프 시퀀스가 있습니다.

1. \" 이스케이프 시퀀스를 사용하면 문자열 값에 따옴표 "를 추가할 수 있습니다. :
```
System.out.println("\"Hello World\"");
// Prints: "Hello World"
```

이스케이프 시퀀스를 사용하지 않으면 Java는 문자열을 끝내기 위해 "를 사용한다고 생각할 것입니다!

2. \\ 이스케이프 시퀀스를 사용하면 문자열 텍스트에 백슬래시를 넣을 수 있습니다.

```
System.out.println("This is the backslash symbol: \\");
// Prints: This is the backslash symbol: \
```

이것은 마지막 예와 유사합니다.
"와 마찬가지로 \는 일반적으로 특별한 의미를 갖습니다.
이 경우 \는 이스케이프 시퀀스를 시작하는 데 사용됩니다. 글쎄, 우리가 이스케이프 시퀀스를 시작하지 않고 그냥 \를 원할 경우 문자열에서 \\를 사용합니다
— 우리는 \가 이스케이프 시퀀스의 시작으로 해석되는 것을 원하지 않는다고 말하기 위해 이스케이프 시퀀스를 사용하고 있습니다.

3. 마지막으로 문자열에 \n 이스케이프 시퀀스를 배치하면 컴파일러는 새 텍스트 줄을 출력합니다.

```
System.out.println("Hello\nGoodbye");
*
Prints:
Hello
Goodbye
*
```
\n을 "newline"의 이스케이프 시퀀스로 생각할 수 있습니다.


 */