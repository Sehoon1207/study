/*
1. Store() 생성자에 String 매개 변수 product를 추가합니다.

2. 생성자 메서드 내에서 인스턴스 변수 productType을 product 매개 변수와 동일하게 설정합니다.
 */
public class C33_Store {
    // instance fields
    String productType;

    // constructor method
    public C33_Store(String product) {
        productType = product;
    }

    // main method
    public static void main(String[] args) {


    }
}

/*
Classes: Constructor Parameters 클래스: 생성자 매개변수

동적인 개별 상태를 가진 개체를 생성하기 위해 생성자 메서드와 인스턴스 필드의 조합을 사용합니다.
인스턴스 변수에 값을 할당하려면 인스턴스에 할당하려는 데이터에 액세스할 수 있도록 매개 변수를 포함하도록 생성자 메서드를 변경해야 합니다.

우리는 이미 main() 메서드에서 String[] args라는 매개변수를 보았지만 메서드 본문 내에서 매개변수 값을 사용하는 것은 이번이 처음입니다.

이제 Car 생성자에 매개변수 String carColor가 있습니다.

```
public class Car {
  String color;
  // constructor method with a parameter
  public Car(String carColor) {
    // parameter value assigned to the field
    color = carColor;
  }
  public static void main(String[] args) {
    // program tasks
  }
}
```
String 값이 Car()에 전달되면 매개 변수 carColor에 할당됩니다.
그런 다음 생성자 내에서 carColor가 인스턴스 변수 color에 대한 값으로 할당됩니다.

우리의 메서드에는 메서드의 이름과 매개 변수를 정의하는 서명도 있습니다.
위의 예에서 시그니처는 Car(String carColor)입니다.

다음 실습에서는 메서드에 값을 전달하는 방법을 배웁니다!

계속 읽으세요: AP 컴퓨터 과학 A 학생

형식formal 매개변수와 실제actual 매개변수의 두 가지 유형이 있습니다.
정식 매개변수는 메서드에 전달할 수 있는 데이터의 유형과 이름을 지정합니다.
위의 예에서 String carColor는 형식formal 매개변수입니다.
carColor는 생성자에 전달되는 문자열 값을 나타냅니다.
다음 실습에서는 실제 매개변수에 대해 알아봅니다.

Java에서 생성자 오버로드 constructor overloading 로 인해 클래스는 서로 다른 매개 변수 값을 갖는 한 여러 생성자를 가질 수 있습니다.
서명은 컴파일러가 서로 다른 메서드를 구별하는 데 도움이 된다는 점에서 유용합니다. 예를 들어:

```
public class Car {
  String color;
  int mpg;
  boolean isElectric;

  // constructor 1
  public Car(String carColor, int milesPerGallon) {
    color = carColor;
    mpg = milesPerGallon;
  }
  // constructor 2
  public Car(boolean electricCar, int milesPerGallon) {
    isElectric = electricCar;
    mpg = milesPerGallon;
  }
}
```
위의 예에는 두 개의 생성자가 있습니다.
개체를 초기화할 때 컴파일러는 개체에 전달하는 값 때문에 사용할 생성자를 알 수 있습니다.
예를 들어 Car myCar = new Car(true, 40) 은 인수가 두 번째 생성자의 서명 유형 및 순서와 일치하기 때문에 두 번째 생성자에 의해 생성됩니다.

생성자를 정의하지 않으면 Java 컴파일러는 인수가 없는 기본 생성자를 생성하고 개체 기본값을 할당합니다.
선언 중에 인스턴스 필드에 값을 할당하여 기본값을 만들 수 있습니다.

```
public class Car {
  String color = "red";
  boolean isElectric = false;
  int cupHolders = 4;

  public static void main(String[] args) {
    Car myCar = new Car();
    System.out.println(myCar.color); // Prints: red
  }
}
```


 */
