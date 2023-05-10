/*
1.
computeShipping() 메서드를 다시 작성하여 대신 switch 문을 사용합니다.

calculateShipping()에는 초기화되지 않은 변수 shippingCost가 있습니다. switch 문을 사용하여 shippingCost에 올바른 값을 할당합니다.

인스턴스 필드 shipping 값을 확인하겠습니다.

배송이 "Regular"와 일치하는 경우 shippingCost는 0이어야 합니다.
배송이 "Express"와 일치하는 경우 shippingCost는 1.75여야 합니다.
기본값은 shippingCost에 .50을 할당해야 합니다.
메서드가 switch 문 다음에 shippingCost를 반환하는지 확인하세요.

 */
public class C50_Order {
    boolean isFilled;
    double billAmount;
    String shipping;

    public C50_Order(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping() {
        double shippingCost;
        // declare switch statement here
        switch (shipping){
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .5;
        }

        return shippingCost;
    }

    public static void main(String[] args) {
        // do not alter the main method!
        C50_Order book = new C50_Order(true, 9.99, "Express");
        C50_Order chemistrySet = new C50_Order(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}

/*
Switch Statement Switch 문

if-then-else 조건을 함께 연결하는 대신 switch 문을 사용하는 것입니다.
이 조건은 여러 조건에 대해 주어진 값을 확인하고 일치하는 코드 블록을 실행합니다.

다음은 대신 switch 문으로 조건부 코스 선택의 예입니다.

```
String course = "History";

switch (course) {
  case "Algebra":
    // Enroll in Algebra
    break;
  case "Biology":
    // Enroll in Biology
    break;
  case "History":
    // Enroll in History
    break;
  case "Theatre":
    // Enroll in Theatre
    break;
  default:
    System.out.println("Course not found");
}
```

이 예제에서는 각 사례 레이블에 대해 코스, 괄호 안에 포함된 값을 확인하여 학생을 역사 수업에 등록합니다.
case 레이블 뒤의 값이 괄호 안의 값과 일치하면 switch 블록이 실행됩니다.

위의 예에서 코스는 "History"와 일치하는 문자열 "History"를 참조합니다.

일치하는 값이 없으면 default 블록이 실행됩니다. 이것을 else로 생각하십시오.

Switch 블록은 중괄호로 표시되지 않고 break 키워드를 사용하여 switch 문을 종료하기 때문에 다른 코드 블록과 다릅니다.

중단 없이 일치하는 case 레이블 아래의 코드가 실행되며, 이는 거의 원하는 동작이 아닌 다른 case 레이블 아래의 코드를 포함합니다.

```
String course = "Biology";

switch (course) {
  case "Algebra":
    // Enroll in Algebra
  case "Biology":
    // Enroll in Biology
  case "History":
    // Enroll in History
  case "Theatre":
    // Enroll in Theatre
  default:
    System.out.println("Course not found");
}

// enrolls student in Biology... AND History and Theatre!
```

 */
