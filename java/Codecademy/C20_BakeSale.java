/*
1. 당신은 또한 베이킹 세일에 얼마나 많은 쿠키가 있는지 추적하는 일을 담당하고 있습니다. 이 값은 변수 numCookies로 표시됩니다.
고객이 와서 쿠키 3개를 구입합니다. 이 변경 사항을 반영하려면 적절한 복합 할당 연산자를 사용하십시오.

2. 다른 고객은 나머지 쿠키의 절반을 구입합니다.
이 변경 사항을 반영하려면 적절한 복합 할당 연산자를 사용하십시오.
 */

public class C20_BakeSale {
    public static void main(String[] args) {
        int numCookies = 17;
        numCookies -= 3;
        numCookies /= 2;
        // Add your code above
        System.out.println(numCookies);
    }
}

/*
21 Compound Assignment Operators 복합 할당 연산자

때때로 우리는 변수의 값을 조정해야 합니다.
우리가 베이킹 세일에서 일하고 있고 numCupcakes라는 변수를 생성하여 얼마나 많은 컵케이크가 있는지 추적하고 싶다고 상상해 보십시오.

```
int numCupcakes = 12;
```

컵케이크를 8개 더 구웠다면 + 연산자를 사용하여 변수를 업데이트할 수 있음을 알 수 있습니다.

```
numCupcakes = numCupcakes + 8; // Value is now 20
```

이 방법은 잘 작동하지만 변수 numCupcakes를 두 번 작성해야 했습니다.
복합 대입 연산자를 사용하여 이 구문을 단축할 수 있습니다.

복합 할당 연산자는 변수에 대해 산술 연산을 수행한 다음 해당 값을 다시 할당합니다.
+= 복합 할당 연산자를 사용하여 이전 코드를 다음과 같이 다시 작성할 수 있습니다.

```
numCupcakes += 8; // Value is now 20
```

이제 numCupcakes를 한 번만 참조하면 됩니다.
우리가 다룬 모든 산술 연산자에 대해 복합 대입 연산자를 사용할 수 있습니다.

Addition (+=)
Subtraction (-=)
Multiplication (*=)
Division (/=)
Modulo (%=)

 */