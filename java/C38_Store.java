/*
1. 생성자와 main() 메서드 사이에 advertise()라는 메서드를 Store 클래스에 추가합니다.
다른 클래스에서 액세스할 수 있어야 하며 출력이 없어야 합니다.
메서드 본문을 비워 둘 수 있습니다.

2. advertise() 메서드 안에 두 개의 print 문을 입력합니다. 결과는 다음과 같습니다.
```
"Come spend some money!"
"Selling productType!"
```
여기서 productType은 변수 productType의 값으로 대체됩니다.
그러나 우리는 아직 이 문자열이 출력되는 것을 보지 않을 것입니다!
다음 연습에서 이 인쇄물을 실제로 실행하는 방법을 살펴보겠습니다.
 */

public class C38_Store {
    // instance fields
    String productType;

    // constructor method
    public C38_Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise(){
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");
    }
    // main method
    public static void main(String[] args) {

    }
}

/*
38 Defining Methods 메서드 정의

앞에서 이야기한 저축 계좌 예제에 대해 checkBalance() 메서드를 정의하면 다음과 같습니다.

```
public void checkBalance(){
  System.out.println("Hello!");
  System.out.println("Your balance is " + balance);
}
```

첫 번째 줄인 public void checkBalance()는 메서드 선언입니다.
프로그램에 방법에 대한 정보를 제공합니다.

    public은 다른 클래스가 이 메서드에 액세스할 수 있음을 의미합니다.
    이 과정의 뒷부분에서 이에 대해 자세히 알아볼 것입니다.

    void 키워드는 메서드에서 특정 출력이 없음을 의미합니다.
    이 강의 후반부에서 void가 아닌 메서드를 보게 되겠지만 지금은 모든 메서드가 void입니다.

    checkBalance()는 메서드의 이름입니다.

모든 메소드에는 메소드의 이름과 매개변수 유형으로 구성된 고유한 메소드 시그니처가 있습니다.
이 예에서 메서드 서명은 checkBalance()입니다.

두 개의 print 문은 중괄호({ 및 })로 정의된 메서드 본문 내부에 있습니다.

main() 메서드에서 할 수 있는 모든 작업은 다른 메서드에서도 수행할 수 있습니다!
수학 및 비교 연산자와 같이 알고 있는 모든 Java 도구를 사용하여 흥미롭고 유용한 메서드를 만들 수 있습니다.

계속 읽으세요: AP 컴퓨터 과학 A 학생

checkBalance()는 main() 메서드처럼 시그니처에 static 키워드가 포함되어 있지 않기 때문에 비정적 메서드로 간주됩니다.
이 과정의 뒷부분에서 비정적 메서드에 대해 자세히 알아봅니다.

 */