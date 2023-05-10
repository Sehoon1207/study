/*
1. pi라는 변경할 수 없는 double 변수를 만들고 해당 값을 3.14로 설정합니다.
파이의 값을 인쇄하십시오.

2. 새 줄에서 pi 값을 변경해 봅니다.
프로그램이 실행되면 어떻게 됩니까?
 */


public class C27_Final {
    public static void main(String[] args) {
        final double pi = 3.14;
        System.out.println(pi);
        //pi = 2;
    }
}

/*
27 final Keyword 최종 키워드
이 강의 전반에 걸쳐 변수를 조작할 수 있는 다양한 방법에 대해 논의했습니다.
그러나 절대 값을 변경해서는 안 되는 변수로 무엇을 해야 할까요?
예를 들어, 우리가 태어난 연도는 항상 동일하게 유지됩니다.
해당 정보를 변경할 수 있는 방법이 없습니다. 코드에서 이와 같은 값은 변경할 수 없습니다.
조작할 수 없는 값을 가진 변수를 선언하려면 final 키워드를 사용해야 합니다.
final 키워드를 사용하려면 다음과 같이 변수 선언 앞에 final을 추가하십시오.

```
final int yearBorn = 1968;
```
final을 사용하여 변수를 선언하면 값을 변경할 수 없습니다. 그렇게 하려고 하면 오류가 발생합니다.

```
error: cannot assign a value to final variable yearBorn
```
 */