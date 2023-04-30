/*
1. advertise() 메서드 내에서 productType 변수를 main() 메서드에서 선언한 쿠키 변수로 변경합니다.
이렇게 하면 다음과 같은 결과가 출력됩니까???
```
Selling cookies!
```

2. 아니요! 오류가 발생했습니다! 광고 방법 내에서 쿠키 변수에 액세스할 수 없습니다.
범위가 잘못되었습니다! 다시 productType으로 변경합니다.
```
String message = "Selling " + productType + "!";
```

3. main() 메서드 내에서 advertise() 메서드에서 선언한 String message를 인쇄합니다. 다음과 같이 인쇄되어야 합니다.
```
Selling Cookies!
```

4. 또 망했어! 메시지 변수는 advertise() 메서드의 범위 내에서만 존재합니다!
main() 메서드에서 잘못된 인쇄 문을 삭제합니다.

 */

public class C40_Store {
    // instance fields
    String productType;

    // constructor method
    public C40_Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    // main method
    public static void main(String[] args) {
        String cookie = "Cookies";
        C40_Store cookieShop = new C40_Store(cookie);

        cookieShop.advertise();
    }
}

/*
40 Scope 범위

메서드는 클래스의 개체가 수행하는 작업입니다.

중괄호({ 및 })를 사용하여 이 작업의 도메인을 표시합니다.
중괄호 안에 있는 모든 것은 작업의 일부입니다. 이 도메인을 메서드 범위라고 합니다.

메서드 범위 밖에 있는 코드의 메서드 내부에서 선언된 변수에 액세스할 수 없습니다.

자동차 클래스를 다시 살펴보면 다음과 같습니다.

```
class Car {
  String color;
  int milesDriven;

  public Car(String carColor) {
    color = carColor;
    milesDriven = 0;
  }

  public void drive() {
     String message = "Miles driven: " + milesDriven;
     System.out.println(message);
  }

  public static void main(String[] args){
     Car myFastCar = new Car("red");
     myFastCar.drive();
  }
}
```

드라이브 내부에서 선언 및 초기화되는 변수 message는 main() 내부에서 사용할 수 없습니다!
drive() 메서드의 범위 내에서만 존재합니다.

그러나 클래스 상단에 선언된 MileDriven은 전체 클래스의 범위에 속하므로 클래스의 모든 메소드 내부에서 사용할 수 있습니다.


*/