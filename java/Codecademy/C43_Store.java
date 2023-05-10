/*
1.
우리는 가격과 세금을 반환하는 메서드를 원합니다.
세금을 포함한 가격을 반환하도록 의도된 getPriceWithTax()라는 메서드를 정의합니다.
이 메서드는 매개변수를 받지 않고 double을 반환해야 합니다.
지금은 메서드 본문을 비워 둘 수 있습니다.
참고: 메서드에서 올바른 유형을 반환할 때까지 코드에 오류가 있으며 다음 단계에서 수행합니다.

2.
getPriceWithTax() 메서드 내에서 price + price * 0.08과 동일한 이중 변수 totalPrice를 생성합니다.
0.08은 가격에 적용되는 세금입니다.
그런 다음 totalPrice를 반환합니다.

3.
main() 내부에서 double lemonadePrice를 lemonadeStand.getPriceWithTax()에서 반환된 값으로 설정합니다.

4.
이제 LemonadePrice를 출력합니다.
 */

public class C43_Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public C43_Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax(){
        double totalPrice = price + price * 0.08;
        return totalPrice;
    }
    // main method
    public static void main(String[] args) {
        C43_Store lemonadeStand = new C43_Store("Lemonade", 3.75);
        double lemonadePrice = lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);
    }
}


/*
44 Returns 보고
변수는 선언된 범위에만 존재할 수 있음을 기억하십시오.
메서드에서 값을 반환하면 생성된 메서드 외부의 값을 사용할 수 있습니다.

키워드 return을 사용하여 값을 반환합니다.
```
public int numberOfTires() {
   int tires = 4;
   // return statement
   return tires;
}
```
numberOfTires()라고 하는 이 메서드는 4를 반환합니다.
반환 문이 실행되면 컴파일러는 함수를 종료합니다.
함수에서 return 문 뒤에 존재하는 모든 코드는 무시됩니다.

이전 연습에서는 새 메서드를 만들 때 키워드 void를 사용했습니다.
여기서는 반환 유형이 int임을 나타내기 위해 void를 int로 바꿉니다.

void 키워드("완전히 비어 있음"을 의미)는 해당 메서드를 호출한 후 값이 반환되지 않음을 나타냅니다.

numberOfTires()와 같은 비공극 메서드는 호출될 때 값을 반환합니다.
메서드가 반환해야 하는 값의 유형을 지정하기 위해 데이터 유형 키워드(예: int, char 등)를 사용할 수 있습니다.
반환 값의 유형은 메서드의 반환 유형과 일치해야 합니다.
반환 표현식이 반환 유형과 호환되는 경우 해당 값의 복사본이 반환 값으로 알려진 프로세스에서 반환됩니다.

void 메서드와 달리 non-void 메서드는 다음과 같이 변수 값이나 식의 일부로 사용할 수 있습니다.

```
public static void main(String[] args){
    Car myCar = new Car("red");
    int numTires = myCar.numberOfTires();
}
```
main() 내에서 myCar의 numberOfTires() 메서드를 호출했습니다.
메서드는 4의 int 값을 반환하므로 numTires라는 정수 변수에 값을 저장합니다.
numTires를 인쇄하면 4가 표시됩니다.

계속 읽으세요: AP 컴퓨터 과학 A 학생

메서드에서 기본 값을 반환하는 방법을 배웠지만 메서드가 객체를 반환하도록 하려면 어떻게 해야 할까요?
객체를 반환하는 것은 기본 값을 반환하는 것과 약간 다르게 작동합니다.
기본 값을 반환하면 값의 복사본이 반환됩니다. 그러나 객체를 반환할 때 복사본 대신 객체에 대한 참조를 반환합니다.

Car를 매개변수로 받고 Car 객체를 반환하는 메서드를 포함하는 두 번째 클래스인 carLot를 만들어 봅시다.

```
class CarLot {
    Car carInLot;
    public CarLot(Car givenCar) {
        carInLot = givenCar;
    }

    public Car returnACar() {
        // return Car object
        return carInLot;
    }

    public static void main(String[] args) {
        Car myCar = new Car("red", 70);
        System.out.println(myCar);
        CarLot myCarLot = new CarLot(myCar);
        System.out.println(myCarLot.returnACar());
    }
}
```
이 코드는 myCar와 carInLot가 동일한 참조 값을 갖기 때문에 동일한 메모리 주소를 출력합니다.

 */