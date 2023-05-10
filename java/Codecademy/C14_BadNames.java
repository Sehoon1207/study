/*
1. BadNames.java 파일에서 혼란스러운 이름으로 변수를 선언했습니다.
파일을 실행하고 컴파일하려고 할 때 표시되는 오류 메시지를 확인합니다.

2. 이러한 변수 이름 중 일부는 불법입니다! 파일 컴파일을 방해하는 항목을 변경하십시오.
 */

public class C14_BadNames {
    public static void main(String[] args) {
        String firstName = "Samira";
        String blah = "Smith";
        String email = "samira@google.com";
        int salaryexpectation = 100000;
        int year_of_birth = 1955;

        System.out.println("The program runs!");
    }
}

/*
14 Naming
프로필에 대한 사용자 이름을 저장하고 있다고 상상해 봅시다. 어떤 코드 예제가 더 좋다고 생각하십니까?

```
String data = "Delilah";
String nameOfUser = "Delilah";
```

이 두 가지 모두 컴파일되지만 두 번째 예가 훨씬 이해하기 쉽습니다. 코드를 읽는 사람은 "Delilah" 값의 용도를 알 수 있습니다.

규칙에 따라 변수 이름을 지정하면 명확하고 읽기 쉽고 유지 관리 가능한 코드가 생성됩니다.
다른 사람 또는 미래의 자신이 코드를 읽을 때 변수의 목적에 대해 혼란이 없습니다.

Java에서 변수 이름은 대소문자를 구분합니다. myHeight는 myheight와 다른 변수입니다.
변수 이름의 길이는 무제한이지만 의미를 명확하게 유지하면서 간결하게 유지해야 합니다.

변수는 유효한 문자, $ 또는 _로 시작합니다. 다른 기호나 숫자는 변수 이름을 시작할 수 없습니다.
1stPlace 및 *Gazer는 유효한 변수 이름이 아닙니다.

단 한 단어의 변수 이름은 모두 소문자로 표기됩니다.
두 단어 이상의 변수 이름은 첫 글자가 소문자이고 이후 각 단어의 시작 글자는 대문자입니다.
이 스타일의 대문자를 camelCase라고 합니다.

```
// good style
boolean isHuman;

// bad styles
// no capitalization for new word
boolean ishuman;
// first word should be lowercase
boolean IsHuman;
// underscores don't separate words
boolean is_human;
```

 */