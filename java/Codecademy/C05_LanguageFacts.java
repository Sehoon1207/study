/*
1. LanguageFacts.java 파일은 Java에 대한 정보를 화면에 인쇄합니다.
불행히도 파일 작성자는 공백을 사용하지 않았습니다.
각 명령문 뒤에 새 줄을 추가하여 파일을 읽기 쉽게 만드십시오!

2. main() 내부에 코딩에 대한 느낌을 출력하는 새 문을 추가합니다.
"Programming is..."으로 메시지를 시작합니다.
명령문 끝에 세미콜론을 두는 것을 잊지 마십시오!
*/

public class C05_LanguageFacts {
    public static void main(String[] args) {
        // Press enter or return on your keyboard after each semicolon!

        System.out.println("Java is a class-based language.");
        System.out.println("Java classes have a 'main' method.");
        System.out.println("Java statements end with a semicolon.");

        System.out.println("Programming is... hard");
    }
}


/*
05 Semicolons and Whitespace 세미콜론 및 공백

주석에서 보았듯이 코드를 읽는 것은 코드를 작성하는 것만큼 중요합니다.
우리는 다른 사람들이 읽기 쉬운 코드를 작성해야 합니다. 그 사람들은 동료일 수도, 친구일 수도, 심지어 당신 자신일 수도 있습니다!
Java는 구문이없는 코드 영역 인 공백을 해석하지 않지만 인간은 공백을 사용하여 코드를 쉽게 읽을 수 있습니다.
기능적으로 이 두 코드 샘플은 동일합니다.

```
System.out.println("Java");System.out.println("Lava");System.out.println("Guava");

System.out.println("Java");
System.out.println("Lava");
System.out.println("Guava");
```

그들은 화면에 같은 텍스트를 인쇄하지만 어떤 것을 읽고 싶습니까? 수백 개의 명령어라고 상상해 보세요! 공백은 필수적입니다.
Java는 세미콜론을 해석합니다. 세미콜론은 단일 작업을 수행하는 한 줄의 코드인 명령문의 끝을 표시하는 데 사용됩니다.
지금까지 본 유일한 명령문은 System.out.println("My message!");입니다.
문을 중괄호 {}와 대조해 보겠습니다. 중괄호는 클래스와 메서드의 범위를 표시합니다. 중괄호 끝에는 세미콜론이 없습니다.

*/