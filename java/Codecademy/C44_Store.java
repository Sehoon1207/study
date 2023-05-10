/*
1.
main() 메서드에서 lemonadeStand 및 cookieShop 개체를 인쇄합니다.
이 인쇄물이 이러한 개체를 이해하는 데 도움이 됩니까?

2.
Store 클래스에 대한 toString() 메서드를 만듭니다.
메서드 시그니처는 그것이 public이고 String을 반환한다고 말해야 합니다.
어떤 매개변수도 가져오면 안 됩니다. 지금은 문자열 "Store"를 반환하도록 합니다.

3.
"스토어"는 그다지 도움이 되지 않습니다! 어떤 매장인가요?
이 Store 개체를 설명하는 문자열을 반환하도록 toString()을 변경합니다.
문자열은 다음과 같아야 합니다.
```
This store sells productType at a price of price.
```
여기서 productType 및 price는 해당 인스턴스 필드의 값입니다.
예를 들어, 모자 가격이 8인 모자 가게라면 문자열은 다음과 같이 말할 것입니다.
```
This store sells hats at a price of 8.
```

4.
인쇄물을 다시 보십시오. 지금 더 도움이 되나요?
 */

public class C44_Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public C44_Store(String product, double initialPrice) {
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
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        C44_Store lemonadeStand = new C44_Store("Lemonade", 3.75);
        C44_Store cookieShop = new C44_Store("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);
    }

    public String toString(){
        return "This store sells " + productType + " at a price of "+price+".";
    }
}

/*
44 The toString() Method toString() 메서드

객체를 인쇄할 때 객체가 무엇을 나타내는지 결정하는 데 별로 도움이 되지 않는 문자열을 자주 봅니다.
지난 수업에서 Store 객체를 인쇄할 때 다음과 같은 출력이 표시되는 것을 보았습니다.

```
Store@6bc7c054
```

여기서 Store는 객체의 이름이고 6bc7c054는 메모리에서의 위치입니다.

상점에서 판매하는 제품, 가격 또는 정의한 다른 인스턴스 필드에 대해서는 아무 것도 알려주지 않습니다.
이 인쇄물을 더 설명적으로 만드는 방법을 클래스에 추가할 수 있습니다.

클래스에 대한 toString() 메서드를 정의할 때 객체를 인쇄할 때 인쇄할 문자열을 반환할 수 있습니다.

```
class Car {

    String color;

    public Car(String carColor) {
        color = carColor;
    }

    public static void main(String[] args){
        Car myCar = new Car("red");
        System.out.println(myCar);
    }

   public String toString(){
       return "This is a " + color + " car!";
   }
}
```

이것이 실행되면 System.out.println(myCar) 명령이 This is a red car!를 인쇄하여 객체 myCar에 대해 알려줍니다.

 */