/*
1. main() 내에서 Store 인스턴스를 생성하고 이를 lemonadeStand 변수에 할당합니다. 매개변수 값으로 "lemonade"를 사용하십시오.

 */

public class C34_Store {
    // instance fields
    String productType;

    // constructor method
    public C34_Store(String product) {
        productType = product;
    }

    // main method
    public static void main(String[] args) {
        C34_Store lemonadeStand = new C34_Store("lemonade");
        System.out.println(lemonadeStand.productType);
    }
}

/*
Classes: Assigning Values to Instance Fields 클래스: 인스턴스 필드에 값 할당

이제 생성자에 매개변수가 있으므로 메서드 호출에 값을 전달해야 합니다.
이러한 값을 인수 arguments 라고 합니다. 일단 전달되면 인스턴스 필드에 초기 값을 제공하는 데 사용됩니다.

여기에서는 색상color 필드가 "red"인 main() 메서드에서 인스턴스 ferrari를 생성합니다.

```
public class Car {
  String color;

  public Car(String carColor) {
    // assign parameter value to instance field
    color = carColor;
  }

  public static void main(String[] args) {
    // parameter value supplied when calling constructor
    Car ferrari = new Car("red");
  }
}
```

문자열 값 "red"를 생성자 메서드 호출인 new Car("red");에 전달합니다.
호출에 제공된 값의 유형은 매개변수에 의해 선언된 유형과 일치해야 합니다.
생성자 내에서 carColor 매개변수는 호출 중에 전달된 값인 "red"를 참조합니다. 이 값은 인스턴스 필드 색상에 할당됩니다.
color는 이미 선언되었으므로 할당하는 동안 유형을 지정하지 않습니다.
객체 ferrari는 값 "red"를 참조하는 인스턴스 필드로 색상 상태를 보유합니다.
점 연산자(.)를 사용하여 이 필드의 값에 액세스합니다.

```
*
accessing a field:
objectName.fieldName
*

ferrari.color;
// "red"
```

계속 읽으세요: AP 컴퓨터 과학 A 학생

실제 매개변수 또는 인수는 메서드 호출 중에 전달되는 값을 나타냅니다.

값에 의한 호출은 인수 값을 사용하여 메서드를 호출하는 프로세스입니다.
인수가 전달되면 형식 매개변수가 인수 값의 복사본으로 초기화됩니다.
예를 들어 페라리 개체를 선언할 때 문자열 값 "red"가 인수로 전달됩니다.
그런 다음 공식 매개변수 carColor에 해당 값의 사본이 지정됩니다.


 */
