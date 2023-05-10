/*
전체 Reservation 클래스는 코드 편집기에 있습니다.
main() 내부를 재생하고 가능한 모든 조건부 분기를 실행할 인스턴스를 생성할 수 있는지 확인하십시오. ...???
 */

public class C57_Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public C57_Reservation(int count, int capacity, boolean open) {
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
        if (!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] args) {
        // Create instances here
        C57_Reservation partyOfThree = new C57_Reservation(3, 12, true);
        C57_Reservation partyOfFour = new C57_Reservation(4, 3, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();

    }
}


/*
57 Review 검토
조건 연산자는 코드를 단순화하기 위해 부울 값에 대해 작동합니다.
분기 논리를 통합하기 위해 종종 조건문과 결합됩니다.

조건부 AND, &&는 양쪽의 부울이 참이면 참으로 평가됩니다.
```
if (true && false) {
  System.out.println("You won't see me print!");
} else if (true && true) {
  System.out.println("You will see me print!");
}
```

Conditional-OR, ||는 양쪽의 부울 중 하나 또는 둘 다 참이면 참으로 평가됩니다.

```
if (false || false) {
  System.out.println("You won't see me print!");
} else if (false || true) {
  System.out.println("You will see me print!");
}
```

Logical-NOT, !는 적용되는 반대 부울 값으로 평가됩니다.

```
if (!false) {
  System.out.println("You will see me print!");
}
```



 */