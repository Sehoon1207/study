/*
1. Song.java의 노래에는 세 줄이 있습니다.
먼저 line1과 line2가 같은지 출력합니다.

2. 이제 line2와 line3이 같은지 출력합니다.
 */
public class C25_Song {
    public static void main(String[] args){
        String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
        String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        System.out.println(line1.equals(line2));
        System.out.println(line2.equals(line3));
    }
}

/*
25 .equals()

지금까지 기본 유형에 대한 작업만 사용했습니다. 문자열을 곱하거나 한 문자열이 다른 문자열보다 작은지 확인하는 것은 의미가 없습니다.
하지만 사이트에 로그인하는 두 명의 사용자가 있고 그들의 사용자 이름이 동일한지 확인하고 싶다면 어떻게 해야 할까요?

문자열과 같은 객체에는 원시 항등 연산자를 사용할 수 없습니다.
객체와의 동등성을 테스트하기 위해 .equals()라는 내장 메서드를 사용합니다. 객체를 비교할 때 항상 .equals()를 사용해야 합니다.
== 가끔 작동하지만 가끔 작동하는 이유는 객체가 메모리에 저장되는 방식과 관련이 있습니다.

이 수업의 목적과 좋은 습관을 위해 객체를 비교할 때 == 대신 .equals()를 사용하는 것을 기억하십시오.

이를 사용하려면 .를 사용하여 하나의 문자열에서 호출하고 괄호 안에 비교할 문자열을 전달합니다.

```
String person1 = "Paul";
String person2 = "John";
String person3 = "Paul";

System.out.println(person1.equals(person2));
// Prints false, since "Paul" is not "John"

System.out.println(person1.equals(person3));
// Prints true, since "Paul" is "Paul"
```

 */