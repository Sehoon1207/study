/*
1. 코드 실행이 두 가지 메서드를 사용하여 파일에서 어떻게 이동하는지 살펴보겠습니다.
다음 메시지와 함께 스토어 생성자 내부에 인쇄 문을 추가합니다. I am inside the constructor method.
생성자를 호출하여 Store 인스턴스를 생성할 때마다 이 메시지가 표시됩니다.

2. 생성자 내부에서 코드를 실행하지 않았기 때문에 생성자 메시지가 인쇄되는 것을 보지 못했습니다.
main() 내부에 lemonadeStand라는 Store 인스턴스를 생성합니다. 새로운 키워드를 잊지 마세요!
생성자 메시지가 표시되어야 합니다.

3. main() 내부에서 lemonadeStand를 인쇄하여 Java가 이 인스턴스를 어떻게 나타내는지 확인합니다.
인쇄된 메시지의 순서를 검토합니다.

프로그램을 실행하면 main()이 호출됩니다.
인스턴스를 생성하여 main()에서 Store()로 이동합니다.
Store() 내부의 코드가 실행됩니다.
Store()가 실행을 마치면 main()으로 돌아갑니다.
 */

public class C31_Store {

    // new method: constructor!
    public C31_Store() {
        System.out.println("I am inside the constructor method.");
    }

    // main method is where we create instances!
    public static void main(String[] args) {
        System.out.println("Start of the main method.");

        // create the instance below
        C31_Store lemonadeStand = new C31_Store();
        // print the instance below
        System.out.println(lemonadeStand);
    }
}

/*
31 Classes: Constructors

객체(클래스의 인스턴스)를 생성하려면 생성자 메서드가 필요합니다. 생성자는 클래스 내에서 정의됩니다.
---
생성자
생성자는 클래스 내의 일반 메서드와 같지만 클래스의 개체를 초기화하는 데 사용됩니다.
Java에서는 new객체를 생성하기 위해 키워드가 사용될 때마다 적어도 하나의 생성자가 호출됩니다.

생성자의 유형
기본 생성자: 이 생성자는 매개변수를 허용하지 않습니다.
매개 변수가 있는 생성자: 이러한 생성자는 특정 수의 매개 변수를 허용합니다.

생성자 만들기
다음은 생성자를 만드는 몇 가지 규칙입니다.
    생성자는 항상 클래스 이름과 같은 이름을 가집니다.
    abstract생성자는 , static, final및 로 선언할 수 없습니다 synchronized.
    생성자에는 명시적인 반환 유형이 없습니다.
---

생성자가 있는 Car 클래스를 살펴보겠습니다. 생성자 Car()는 클래스와 동일한 이름을 공유합니다.

```
public class Car {
  // Constructor method
  public Car() {
    // instructions for creating a Car instance
  }

  public static void main(String[] args) {
    // body of main method
  }
}
```

인스턴스를 생성하려면 main() 내에서 생성자를 호출하거나 호출해야 합니다.
다음 예제에서는 Car 인스턴스를 변수 ferrari에 할당합니다.

```
public class Car {

  public Car() {
    // instructions for creating a Car instance
  }

  public static void main(String[] args) {
    // Invoke the constructor
    Car ferrari = new Car();
  }
}
```

이 예에서 변수 ferrari는 int 또는 boolean과 같은 기본 데이터 유형으로 선언되는 대신 참조 데이터 유형으로 선언됩니다.
이는 변수 값이 인스턴스의 메모리 주소에 대한 참조임을 의미합니다.
선언하는 동안 클래스 이름은 변수의 유형으로 사용됩니다.
이 경우 유형은 자동차입니다.

대입 연산자(=) 다음에 생성자 메서드인 Car()를 호출하고 new 키워드를 사용하여 인스턴스를 만들고 있음을 나타냅니다.
new를 생략하면 오류가 발생합니다.

페라리의 값을 출력하면 메모리 주소가 표시됩니다.

```
Car@76ed5528
```

계속 읽으세요: AP 컴퓨터 과학 A 학생

특수 값 null을 활용하면 참조를 할당하지 않고 참조 유형 변수를 초기화할 수 있습니다.
null인 것은 가치가 없습니다. 객체에 null을 할당하면 무효 참조를 갖게 됩니다.

예를 들어 다음 코드 스니펫에서는 Car 인스턴스를 만들고 참조를 할당한 다음 해당 값을 null로 변경합니다.

```
Car thunderBird = new Car();
System.out.println(thunderBird); // Prints: Car@76ed5528

thunderBird = null; // change value to null
System.out.println(thunderBird); // Prints: null
```

null 참조를 사용하여 메서드를 호출하거나 인스턴스 변수에 액세스하면 NullPointerException 오류가 발생한다는 점에 유의해야 합니다.

 */