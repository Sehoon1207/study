/*
1. 마지막 연습에서 우리는 advertise()라는 새 메서드를 정의했지만 실제로 실행되는 것을 보지는 못했습니다.
이제 advertise()가 정의된 Store 클래스가 있습니다.
main() 메서드의 lemonadeStand 객체에서 advertise() 메서드를 호출하고 출력이 무엇인지 확인하십시오!

2. 이제 lemonadeStand 객체에서 advertise() 메서드를 두 번 더 호출합니다.
main() 메서드에서 총 3번 호출해야 합니다.
*/

public class C39_Store {
    // instance fields
    String productType;

    // constructor method
    public C39_Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    // main method
    public static void main(String[] args) {
        C39_Store lemonadeStand = new C39_Store("Lemonade");
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();
    }
}

/*
39 Calling Methods 호출 방법

비정적 메서드를 클래스에 추가하면 해당 클래스의 개체에서 사용할 수 있게 됩니다.
메서드를 실행하려면 생성한 개체에서 메서드를 호출해야 합니다.

이전 강의에서 Car 클래스에 비정적 startEngine() 메서드를 추가해 보겠습니다.
main() 메서드 내에서 myFastCar 개체에 대해 startEngine()을 호출합니다.

```
class Car {

  String color;

  public Car(String carColor) {
    color = carColor;
  }

  public void startEngine() {
    System.out.println("Starting the car!");
    System.out.println("Vroom!");
  }

  public static void main(String[] args){
    Car myFastCar = new Car("red");
    // Call a method on an object
    myFastCar.startEngine();
    System.out.println("That was one fast car!");
  }
}
```

메서드 호출을 자세히 살펴보겠습니다.

```
myFastCar.startEngine();
```

먼저 myFastCar 개체를 참조합니다.
그런 다음 도트 연산자(.)를 사용하여 startEngine() 메서드를 호출합니다.
메서드를 호출하려면 메서드 이름 뒤에 괄호()를 포함해야 합니다.

위의 프로그램을 실행하면 다음과 같은 결과를 얻을 수 있습니다.

```
Starting the car!
Vroom!
That was one fast car!
```
코드는 일반적으로 코드 실행이 프로그램의 맨 위에서 시작하여 프로그램의 맨 아래에서 끝나는 하향식 순서로 실행됩니다.
그러나 메소드가 호출되지 않는 한 컴파일러는 메소드를 무시합니다.

메서드가 호출되면 컴파일러는 메서드에 포함된 모든 명령문을 실행합니다.
모든 메서드 명령이 실행되면 하향식 실행 순서가 계속됩니다.
이것이 바로 "Starting the car!" 그리고 "Vroom!"은 "That was one fast car!" 이전에 출력되었습니다.

 */