/*
Operators.java의 세 가지 표현식을 살펴보십시오.
실행 순서에 대한 이해를 바탕으로 각 표현식의 값이 참인지 거짓인지 알아봅니다.
준비가 되면 인쇄 문의 주석을 제거하여 올바른지 확인하십시오.
 */

public class C56_Operators {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        boolean ex1 = !(a == 7 && (b >= a || a != a));
        // System.out.println(ex1);

        boolean ex2 = a == b || !(b > 3);
        // System.out.println(ex2);

        boolean ex3 = !(b <= a && b != a + b);
        // System.out.println(ex3);

    }
}

/*
56 Combining Conditional Operators 조건부 연산자 결합

단일 표현식에서 여러 조건부 연산자를 사용하여 부울 표현식을 확장할 수 있습니다.

예를 들어:
```
boolean foo = true && !(false || !true)
```

이와 같은 표현식은 컴파일러에서 어떻게 평가됩니까? 조건부 연산자의 평가 순서는 다음과 같습니다.

Conditions placed in parentheses - ()
NOT - !
AND - &&
OR - ||

이 정보를 사용하여 foo의 값을 찾기 위해 위의 표현식을 분석해 보겠습니다.

```
true && !(false || !true)
```

먼저 (false || !true)가 괄호로 묶여 있기 때문에 평가합니다. 평가 순서에 따라 false와 같은 !true를 평가합니다.

```
true && !(false || false)
```

그런 다음 false와 같은 (false || false)를 평가합니다. 이제 우리의 표현은 다음과 같습니다.

```
true && !false
```

다음으로 NOT 연산자를 사용하기 때문에 !false를 평가합니다. 이 표현식은 true와 같으며 표현식을 다음과 같이 만듭니다.

```
true && true
```

true && true는 true로 평가됩니다. 따라서 foo의 값은 참입니다.

 */