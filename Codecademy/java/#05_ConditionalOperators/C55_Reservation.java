/*
1.
informUser()를 더 유익하게 만들어 봅시다. 예약이 확정되지 않은 경우 알아야 합니다!
if-then-else 문을 작성하고 ! isConfirmed를 조건으로 사용합니다.
예약이 확정되지 않은 경우 'Unable to confirm reservation, please contact restaurant.'이라고 적어주세요.
그렇지 않으면 쓰기: Please enjoy your meal!

 */

public class C55_Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public C55_Reservation(int count, int capacity, boolean open) {
        if (count < 1 || count > 8) {
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
        // Write conditional here
        if (!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] args) {
        C55_Reservation partyOfThree = new C55_Reservation(3, 12, true);
        C55_Reservation partyOfFour = new C55_Reservation(4, 3, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}

/*
55 Logical NOT: ! 논리적 NOT: !

단항 연산자 NOT, !는 단일 값에서 작동합니다.
이 연산자는 적용되는 반대 부울로 평가됩니다.

```
!false
// true
!true
// false
```

NOT은 프로그램에서 의도를 명확하게 표현하는 데 유용합니다.
예를 들어 if-then의 반대 동작이 필요할 때가 있습니다.
조건이 false인 경우에만 코드 블록을 실행합니다.

```
boolean hasPrerequisite = false;

if (hasPrerequisite) {
  // do nothing
} else {
  System.out.println("Must complete prerequisite course!");
}
```

이 코드는 우리가 원하는 것을 수행하지만 아무 것도 수행하지 않는 코드 블록이 있다는 것은 이상합니다!
논리 NOT 연산자는 예제를 정리합니다.

```
boolean hasPrerequisite = false;

if (!hasPrerequisite) {
  System.out.println("Must complete prerequisite course!");
}
```

빈 코드 블록 없이 간결한 조건문을 작성할 수 있습니다.



 */