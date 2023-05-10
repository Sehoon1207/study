/*
1. Store에 대한 두 개의 새 인스턴스 필드를 추가합니다.
int 유형의 inventoryCount double 유형의 inventoryPrice입니다.

2. Store 생성자 메서드를 새 매개 변수로 업데이트합니다.
매개변수는 product, count, price 순이어야 합니다.
해당 순서를 사용하고 각 매개변수에 대한 유형을 포함해야 합니다.
예를 들어 product은 해당 값이 인스턴스 필드 String productType에 할당되기 때문에 String 유형입니다.

3. Store 생성자의 본문에서 적절한 인스턴스 필드에 매개변수 값을 할당합니다.

4. main() 내부에 cookieShop이라는 스토어 인스턴스를 생성합니다.
cookieShop은 상품으로서 "쿠키"를 가지고 있습니다.
cookieShop은 12개의 쿠키를 판매하며 각 쿠키의 가격은 3.75입니다.
 */

public class C35_Store {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public C35_Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // main method
    public static void main(String[] args) {
        C35_Store cookieShop = new C35_Store("cookies",12,3.75);
    }
}

/*
Classes: Multiple Fields 클래스: 여러 필드

개체는 단일 인스턴스 필드로 제한되지 않습니다.
프로그램의 요구 사항에 필요한 만큼 많은 필드를 선언할 수 있습니다.
여러 필드를 갖도록 Car 인스턴스를 변경해 보겠습니다.
자동차 엔진이 켜져 있음을 나타내는 부울 isRunning과 자동차가 이동하는 속도를 나타내는 int velocity를 추가합니다.

```
public class Car {
  String color;
  // new fields!
  boolean isRunning;
  int velocity;

  // new parameters that correspond to the new fields
  public Car(String carColor, boolean carRunning, int milesPerHour) {
    color = carColor;
    // assign new parameters to the new fields
    isRunning = carRunning;
    velocity = milesPerHour;
  }

  public static void main(String[] args) {
    // new values passed into the method call
    Car ferrari = new Car("red", true, 27);
    Car renault = new Car("blue", false, 70);

    System.out.println(renault.isRunning);
    // false
    System.out.println(ferrari.velocity);
    // 27
  }
}
```
생성자에는 이제 새 필드의 값을 받는 여러 매개변수가 있습니다.
여전히 유형과 각 매개변수의 이름을 지정합니다.

주문이 중요합니다! 매개변수에 나열된 것과 동일한 순서로 생성자 호출에 값을 전달해야 합니다.

```
// values match types, no error
Car honda = new Car("green", false, 0);

// values do not match types, error!
Car junker = new Car(true, 42, "brown");
```

 */