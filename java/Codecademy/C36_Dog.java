/*
텍스트 편집기에는 Dog 클래스가 포함되어 있습니다.
코드를 가지고 놀아보세요!

인스턴스 필드를 추가하고 제거하십시오.
값이 다른 인스턴스를 만듭니다. 다른 필드에 액세스하고 인쇄합니다.
 */

public class C36_Dog {
    String breed;
    boolean hasOwner;
    int age;

    public C36_Dog(String dogBreed, boolean dogOwned, int dogYears) {
        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        C36_Dog fido = new C36_Dog("poodle", false, 4);
        C36_Dog nunzio = new C36_Dog("shiba inu", true, 12);
        boolean isFidoOlder = fido.age > nunzio.age;
        int totalDogYears = nunzio.age + fido.age;
        System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
        System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
        System.out.println("The total age of the dogs is: " + totalDogYears);
        System.out.println("Main method finished");
    }
}

/*
36 Classes: Review 수업: 복습
Java는 모든 프로그램에 적어도 하나의 클래스가 있는 객체 지향 프로그래밍 언어입니다.
프로그램은 종종 클래스의 인스턴스인 많은 클래스와 개체에서 빌드됩니다.

클래스는 해당 인스턴스의 상태와 동작을 정의합니다. 동작은 클래스에 정의된 메서드에서 가져옵니다.
상태는 클래스 내부에 선언된 인스턴스 필드에서 가져옵니다.

클래스는 프로그램에서 표현하려는 실제 사물을 모델로 합니다.
나중에 여러 클래스에서 프로그램을 만드는 방법을 살펴보겠습니다.
현재 우리 프로그램은 단일 클래스입니다.

```
public class Dog {
  // instance field
  String breed;
  // constructor method
  public Dog(String dogBreed) {
    *
    value of parameter dogBreed
    assigned to instance field breed
    *
    breed = dogBreed;
            }
public static void main(String[] args) {
    *
    create instance:
    use 'new' operator and invoke constructor
    *
        Dog fido = new Dog("poodle");
    *
    fields are accessed using:
    the instance name, `.` operator, and the field name.
    *
    fido.breed;
    // "poodle"
    }
}
```



 */