/*
텍스트 편집기에는 이 단원에서 빌드할 예약 클래스가 포함되어 있습니다.

프로그램 실행을 제어하는데 사용하는 다양한 조건문과 연산자에 유의하십시오.

준비가 되면 계속 진행하세요!

 */

public class C52_Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public C52_Reservation(int count, int capacity, boolean open) {
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
        C52_Reservation partyOfThree = new C52_Reservation(3, 12, true);
        C52_Reservation partyOfFour = new C52_Reservation(4, 3, true);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}

/*
52 Introduction to Conditional Operators 조건부 연산자 소개

Java에는 부울 값만 사용하는 연산자가 포함되어 있습니다.
이러한 조건 연산자는 여러 부울 값을 단일 값(참 또는 거짓)으로 줄임으로써 복잡한 부울 관계를 포함하는 표현식을 단순화하는 데 도움이 됩니다.

예를 들어 여러 조건이 참인 경우에만 코드 블록을 실행하려면 어떻게 해야 합니까? AND 연산자: &&를 사용할 수 있습니다.

또는 두 조건 중 하나 이상이 참인 경우 코드 블록을 실행하려고 합니다.
OR 연산자를 사용할 수 있습니다: ||.

마지막으로 NOT 연산자: !를 사용하여 true가 false가 되고 false가 true가 되는 반대 값을 생성할 수 있습니다.

이러한 복잡한 관계를 이해하는 것은 처음에는 압도적으로 느껴질 수 있습니다.
운 좋게도 오른쪽에 표시된 것과 같은 진리표는 두 부울 기반 조건 사이의 관계를 결정하는 데 도움이 될 수 있습니다.

이 단원에서는 이러한 각 조건 연산자를 살펴보고 조건문에 구현하는 방법을 알아봅니다.

 */