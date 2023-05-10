/*
1.
우리의 Reservation 클래스에는 식당이 주어진 예약을 수용할 수 있는지 확인하는 ConfirmReservation() 메서드가 있습니다.

3개의 인스턴스 변수를 사용하여 조건 논리를 ConfirmReservation()에 빌드해야 합니다.

restaurantCapacity
guestCount
isRestaurantOpen
if-then-else 문을 사용하십시오.

restaurantCapacity가 guestCount보다 크거나 같고 레스토랑이 영업 중인 경우 "예약 확인됨"을 인쇄하고 isConfirmed를 true로 설정합니다.

그렇지 않으면 "예약 거부됨"을 인쇄하고 isConfirmed를 false로 설정합니다.

 */

public class C53_Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public C53_Reservation(int count, int capacity, boolean open) {
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    public void confirmReservation() {
    /*
       Write conditional
       ~~~~~~~~~~~~~~~~~
       if restaurantCapacity is greater
       or equal to guestCount
       AND
       the restaurant is open:
         print "Reservation confirmed"
         set isConfirmed to true
       else:
         print "Reservation denied"
         set isConfirmed to false
    */
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        }else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        System.out.println("Please enjoy your meal!");
    }

    public static void main(String[] args) {
        C53_Reservation partyOfThree = new C53_Reservation(3, 12, true);
        C53_Reservation partyOfFour = new C53_Reservation(4, 3, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}

/*
53 Conditional-And: && 조건부 And: &&

학생 등록 프로그램으로 돌아가 봅시다.
우리는 추가 요구 사항을 추가했습니다: 학생들은 전제 조건을 갖추어야 할 뿐만 아니라 수업료도 지불해야 합니다.
학생을 등록하기 전에 두 가지 조건이 충족되어야 합니다.

다음은 코드를 작성할 수 있는 한 가지 방법입니다.
```
if (tuitionPaid) {
  if (hasPrerequisite) {
    // enroll student
  }
}
```
두 개의 if-then 문을 중첩했습니다.
이것은 작업을 수행하지만 AND 연산자를 사용하면 더 간결해질 수 있습니다.

```
if (tuitionPaid && hasPrerequisite) {
  // enroll student
}
```

AND 연산자 &&는 두 부울 값 사이에 사용되며 단일 부울 값으로 평가됩니다.
양쪽의 값이 true이면 결과 값이 true이고 그렇지 않으면 결과 값이 false입니다.

이 코드는 모든 조합을 보여줍니다.

```
true && true
// true
false && true
// false
true && false
// false
false && false
// false
```

 */