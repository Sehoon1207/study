/*
1.
코드 편집기에는 소매 배송을 추적하는 Order 클래스가 포함되어 있습니다.
"High value item!"을 출력하는 if-then 문을 작성하세요! itemCost가 24.00보다 큰 경우.

 */

public class C46_Order {

    public static void main(String[] args) {

        double itemCost = 30.99;

        // Write an if-then statement:
        if (itemCost > 24.00) {
            System.out.println("High value item!");
        }


    }

}

/*
46 If-Then Statement If-Then 문

if-then 문은 우리가 작성할 수 있는 가장 간단한 제어 흐름입니다. 진리에 대한 표현식을 테스트하고 이를 기반으로 일부 코드를 실행합니다.

```
if (flip == 1) {

  System.out.println("Heads!");

}
```

if 키워드는 조건문의 시작을 표시하고 그 뒤에 괄호()가 옵니다.
괄호는 부울 데이터 유형을 보유합니다.

괄호 안의 조건에 대해 부울을 참조하는 변수 또는 부울로 평가되는 비교를 사용할 수도 있습니다.

부울 조건 다음에는 코드 블록을 표시하는 여는 중괄호와 닫는 중괄호가 옵니다. 이 블록은 부울이 참인 경우에만 실행됩니다.


```
boolean isValidPassword = true;

if (isValidPassword) {

  System.out.println("Password accepted!");

}

// Prints "Password accepted!"

int numberOfItemsInCart = 9;

if (numberOfItemsInCart > 12) {

  System.out.println("Express checkout not available");

}

// Nothing is printed.
```

조건문이 간단하면 중괄호를 완전히 생략할 수 있습니다.

```
if (true) System.out.println("Brevity is the soul of wit");
```

참고: 조건문은 세미콜론으로 끝나지 않습니다.
 */