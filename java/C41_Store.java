/*
1.
greetCustomer()라는 Store 클래스에 메서드를 추가합니다.
다른 클래스에서 액세스할 수 있어야 하며 출력을 반환하지 않아야 합니다.
지금은 매개변수를 사용하지 않고 메서드 본문을 비워둡니다.

2.
customer라는 문자열String 매개변수를 허용하도록 greetCustomer() 메서드를 수정합니다.

3.
welcomeCustomer() 메서드 내부에 print 문을 추가하여 인쇄합니다.
```
"Welcome to the store, " + customer + "!"
```

4.
main() 메서드 내에서 lemonadeStand 객체에 대해 greetCustomer() 메서드를 호출합니다.
선택한 문자열String 인수를 전달하십시오!

 */

public class C41_Store {
    // instance fields
    String productType;

    // constructor method
    public C41_Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    public void greetCustomer(String customer){
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // main method
    public static void main(String[] args) {
        C41_Store lemonadeStand = new C41_Store("Lemonade");
        lemonadeStand.greetCustomer("Penguin");
    }
}

/*
41 Adding Parameters 매개변수 추가

메서드의 범위가 어떻게 한 메서드에서 선언된 변수를 다른 메서드에서 사용하지 못하게 하는지 살펴봤습니다.
한 메서드에 다른 메서드로 전달해야 하는 일부 정보가 있다면 어떻게 될까요?

생성자에 매개변수를 추가한 방법과 유사하게, 다른 모든 메소드를 사용자 정의하여 매개변수를 허용할 수 있습니다.
예를 들어 다음 코드에서는 Double 매개변수 stationNum과 stationName이라는 문자열 매개변수를 받는 startRadio() 메서드를 만듭니다.

```
class Car {

  String color;

  public Car(String carColor) {
    color = carColor;
  }

  public void startRadio(double stationNum, String stationName) {
    System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
    System.out.println("Enjoy!");
  }

  public static void main(String[] args){
    Car myCar = new Car("red");
    myCar.startRadio(103.7, "Meditation Station");
  }
}
```

매개 변수 값을 추가하면 메서드의 서명에 영향을 미칩니다.
생성자 서명과 마찬가지로 메서드 서명에는 메서드 이름과 메서드의 매개 변수 유형이 포함됩니다.
위 메서드의 서명은 startRadio(double, String)입니다.

main() 메서드에서 myCar 개체의 startRadio() 메서드를 호출하고
103.7의 이중 인수와 "Meditation Station"의 문자열 인수를 제공하여 다음과 같은 결과를 얻습니다.

```
Turning on the radio to 103.7, Meditation Station!
Enjoy!
```

여러 매개 변수가 있는 메서드를 호출할 때 호출에 지정된 인수는 서명에 나타나는 매개 변수와 동일한 순서로 배치되어야 합니다.
인수 유형이 매개변수 유형과 일치하지 않으면 오류가 발생합니다.

계속 읽으세요: AP 컴퓨터 과학 A 학생

메소드 오버로딩을 통해 Java 프로그램은 각 메소드의 매개변수 목록이 고유한 한 이름이 같은 여러 메소드를 포함할 수 있습니다.
예를 들어 두 개의 startRadio() 메서드를 포함하도록 위의 프로그램을 다시 만들 수 있습니다.

```
// Method 1
public void startRadio(double stationNum, String stationName) {
  System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
  System.out.println("Enjoy!");
}

// Method 2
public void startRadio(double stationNum) {
  System.out.println("Turning on the radio to " + stationNum + "!");
}

public static void main(String[] args){
  Car myCar = new Car("red");
  // Calls the first startRadio() method
  myCar.startRadio(103.7, "Meditation Station");

  // Calls the second startRadio() method
  myCar.startRadio(98.2);
}
```



 */