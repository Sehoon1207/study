/*
1.
잘못된 입력에 대해 경고하는 메시지를 Reservation() 생성자 내부에 작성해 보겠습니다.

저희 레스토랑은 8명 이상의 파티를 수용할 수 없으며, 0명 이하의 예약은 어리석은 일이 될 수 있기 때문에 원하지 않습니다.

Reservation() 내부에 ||를 사용하는 조건문을 작성합니다.

count가 1보다 작거나 8보다 큰 경우 다음 메시지를 작성하려고 합니다. Invalid reservation!.

 */

public class C54_Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public C54_Reservation(int count, int capacity, boolean open) {
        // Write conditional statement below
        if (count < 1 || count > 8){
            System.out.println("Invalid reservation!");
        }

        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        System.out.println("Please enjoy your meal!");
    }

    public static void main(String[] args) {
        C54_Reservation partyOfThree = new C54_Reservation(3, 12, true);
        C54_Reservation partyOfFour = new C54_Reservation(4, 3, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}

/*
54 Conditional-Or: || 조건부 또는: ||
등록 프로그램의 요구 사항이 다시 변경되었습니다.
특정 과정에는 여러 과정에서 충족되는 전제 조건이 있습니다.
학생들이 최소한 하나의 전제 조건을 수강했다면 등록이 허용되어야 합니다.

다음은 코드를 작성할 수 있는 한 가지 방법입니다.

```
if (hasAlgebraPrerequisite) {
  // Enroll in course
}

if (hasGeometryPrerequisite) {
  // Enroll in course
}
```

동일한 코드 블록에 두 개의 다른 if-then 문을 사용하고 있습니다.
OR 연산자를 사용하면 더 간결해질 수 있습니다.

```
if (hasAlgebraPrerequisite || hasGeometryPrerequisite) {
  // Enroll in course
}
```

OR 연산자 ||는 두 부울 값 사이에 사용되며 단일 부울 값으로 평가됩니다.
두 값 중 하나가 참이면 결과 값이 참이고 그렇지 않으면 결과 값이 거짓입니다.

이 코드는 모든 조합을 보여줍니다.

```
true || true
// true
false || true
// true
true || false
// true
false || false
// false
```

계속 읽으세요: AP 컴퓨터 과학 A 학생

경우에 따라 컴파일러는 첫 번째 부울 피연산자만 평가하여 논리식의 진리값을 결정할 수 있습니다.
이것은 단락 평가로 알려져 있습니다. 단락 평가는 && 또는 ||를 사용하는 식에서만 작동합니다.

||를 사용하는 식에서 피연산자 중 하나가 참 값을 갖는 한 결과 값은 참이 됩니다.
표현식의 첫 번째 피연산자가 참이면 다른 피연산자의 값이 무엇인지 알 필요 없이 최종 값도 참이 될 것임을 알 수 있습니다.

예를 들어 첫 번째 피연산자의 값이 참이기 때문에 두 번째 피연산자에서 숫자를 0으로 나누어도 오류 없이 다음 코드를 실행할 수 있습니다.

```
if (1 > 0 || 2 / 0 == 7) {
  System.out.println("No errors here!");
}
```

&&를 사용하는 식은 두 피연산자가 모두 참인 경우에만 참이 됩니다.
식의 첫 번째 피연산자가 거짓이면 전체 값이 거짓이 됩니다.


 */