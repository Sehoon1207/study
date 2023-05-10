/*
1. 우리의 텍스트 편집기에는 수업을 진행하면서 구축할 완전한 클래스 정의가 포함되어 있습니다.
코드를 실행하여 실제로 작동하는지 확인하십시오.
 */
public class C29_Store {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public C29_Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // main method
    public static void main(String[] args) {
        C29_Store lemonadeStand = new C29_Store("lemonade", 42, .99);
        C29_Store cookieShop = new C29_Store("cookies", 12, 3.75);

        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");

        System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    }
}


/*
29 Introduction to Classes

모든 프로그램에는 세계의 모델 역할을 하는 하나 이상의 클래스가 필요합니다.

예를 들어 학생 시험 점수를 추적하는 프로그램에는 Student, Course 및 Grade 클래스가 있을 수 있습니다.
우리의 실제 관심사, 학생 및 성적은 수업으로 프로그램 내에 있습니다.

우리는 각 학생을 Student 클래스의  instance, or object로 나타냅니다.

프로그램은 객체와 그 상호 작용을 중심으로 구축되기 때문에 이것은 객체 지향 프로그래밍입니다.
개체에는 상태state와 동작behavior이 포함됩니다.


클래스는 개체의 청사진입니다. 청사진은 일반적인 구조를 자세히 설명합니다.
예를 들어, 모든 학생은 ID를 가지고 있고, 모든 과정은 학생을 등록할 수 있습니다.

인스턴스는 사물 그 자체입니다. 이 학생의 ID는 42이고 이 과정은 해당 학생을 등록했습니다.

또 다른 예를 들어 은행의 예금 계좌를 살펴보겠습니다.

저축예금은 무엇을 알아야 할까요?

사용 가능한 잔액입니다.

저축예금은 어떻게 해야 하나요?

보증금.
돈을 인출.

두 사람이 SavingsAccount 클래스의 인스턴스인 계정을 가지고 있다고 가정해 보십시오.
그들은 행동(입금 및 출금 방법)을 공유하지만 개별 상태(잔고)를 가지고 있으며 동일한 잔고 금액에도 이 계정은 별도의 개체입니다.

 */