/*
Operations.java의 표현식을 살펴보십시오.
각 표현식의 값을 스스로 해결하십시오.
계산이 올바른지 확인하려면 인쇄 문의 주석을 제거하고 코드를 실행하십시오.
 */

public class C21_Operations {
    public static void main(String[] args) {

        int expression1 = 5 % 2 - (4 * 2 - 1);
        // System.out.println(expression1);

        int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
        // System.out.println(expression2);

        int expression3 = 5 * 4 % 3 - 2 + 1;
        // System.out.println(expression3);

    }
}

/*
21 Order of Operations 작업 순서

단일 표현식에 여러 연산자를 배치하는 경우 컴파일러는 어떤 작업을 먼저 평가합니까?

```
int num = 5 * (10 - 4) + 4 / 2;
```

작업 순서는 위의 것과 같은 표현식이 평가되는 순서를 나타냅니다.
동일한 우선 순위를 공유하는 연산자는 식 내에서 왼쪽에서 오른쪽으로 평가됩니다.

순서는 다음과 같습니다.

1. 괄호
2. 지수
3. 모듈로/곱셈/나눗셈
4. 덧셈/뺄셈

이 새로운 정보를 염두에 두고 num의 값을 찾을 수 있도록 위의 식을 분석해 보겠습니다.

```
5 * (10 - 4) + 4 / 2
```

10 - 4는 괄호로 묶여 있기 때문에 먼저 평가됩니다. 이 값은 6이 되어 표현식을 다음과 같이 만듭니다.

```
5 * 6 + 4 / 2
```

다음으로 * 연산자 때문에 5 * 6이 평가됩니다. 이 값은 30입니다. 이제 식은 다음과 같습니다.

```
30 + 4 / 2
```

연산 순서에 따라 나누기 연산자 /가 더하기 연산자 +보다 우선 순위가 높기 때문에 4 / 2가 다음에 평가됩니다.
이제 표현은 다음과 유사합니다.

```
30 + 2
```

30 + 2는 32입니다. 이것은 num의 값이 32라는 것을 의미합니다.

 */
