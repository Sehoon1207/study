/*
1. Store 클래스에 일부 상태를 추가합니다.
productType에 대한 문자열String 인스턴스 필드를 선언합니다.


 */

public class C32_Store {
    // declare instance fields here!
    String productType;

    // constructor method
    public C32_Store() {
        System.out.println("I am inside the constructor method.");
    }

    // main method
    public static void main(String[] args) {
        System.out.println("This code is inside the main method.");

        C32_Store lemonadeStand = new C32_Store();

        System.out.println(lemonadeStand);
    }
}


/*
32 Classes: Instance Fields 클래스: 인스턴스 필드

마지막 연습은 Store@6bc7c054와 같은 Store 인스턴스를 인쇄하는 것으로 끝났습니다.
첫 번째 부분인 Store는 클래스를 나타내고 두 번째 부분인 @6bc7c054는 컴퓨터 메모리에서 인스턴스의 위치를 나타냅니다.

우리는 메모리 위치에 대해 신경 쓰지 않지만 인스턴스에는 다른 특성이 없습니다!
객체가 생성되면 생성자는 객체의 초기 상태를 설정합니다.
상태는 개체의 특성을 나타내는 관련 데이터로 구성됩니다.

인스턴스 변수 또는 인스턴스 필드를 도입하여 개체에 데이터를 추가합니다.

우리는 다양한 색상의 Car 인스턴스를 원하므로 String 색상 인스턴스 필드를 선언합니다.
종종 인스턴스 변수 instance variables 는 개체와 "has-a" 관계로 설명됩니다.
예를 들어 Car는 "has-a" 색상color입니다.
이것을 생각하는 또 다른 방법은 인스턴스 변수가 개체와 관련된 명사 및 형용사라는 것입니다.
자동차에는 색상 외에 어떤 특성이 있을 수 있습니까?

```
public class Car {
  *
  declare fields inside the class
  by specifying the type and name
  *
String color;

    public Car() {
    *
    instance fields available in
    scope of constructor method
    *
    }

    public static void main(String[] args) {
        // body of main method
    }
}
```
선언은 클래스 내에 있으며 인스턴스 변수는 생성자 내에서 할당할 수 있습니다.

필드는 각 인스턴스가 소유하게 될 상태 유형입니다.
한 인스턴스는 색상이 "빨간색"이고 다른 인스턴스는 "파란색"일 수 있습니다.
이러한 인스턴스 필드에 초기 값을 제공하는 것은 생성자의 작업입니다.
다음 실습에서 이 작업을 수행하는 방법을 배웁니다.


 */