/*
1.
회사는 소비자가 "ship50"쿠폰을 사용하면 회사가 특급 배송료를 낮추는 임시 거래를 제공합니다.
지난 연습문제에서 else-if 문의 본문을 다시 작성해 봅시다.
else-if 문 내에서 couponCode가 "ship50"과 같은지 확인하는 중첩된 if-then 문을 만듭니다.
중첩된 조건이 참이면 값 .85를 반환합니다.
조건이 거짓이면 중첩된 else 문을 사용하여 값 1.75를 반환합니다.
 */
public class C49_Order {
    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;

    public C49_Order(boolean filled, double cost, String shippingMethod, String coupon) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
        couponCode = coupon;
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
        if (shipping.equals("Regular")) {
            return 0;
        } else if (shipping.equals("Express")) {
            // Add your code here
            if (couponCode == "ship50") {
                return .85;
            }else{
                return 1.75;
            }

        } else {
            return .50;
        }
    }

    public static void main(String[] args) {
        // do not alter the main method!
        C49_Order book = new C49_Order(true, 9.99, "Express", "ship50");
        C49_Order chemistrySet = new C49_Order(false, 72.50, "Regular", "freeShipping");

        book.ship();
        chemistrySet.ship();
    }
}

/*
Nested Conditional Statements 중첩된 조건문

다른 조건문 안에 조건문을 배치하여 생성되는 중첩 조건문을 생성하여 더 복잡한 조건 구조를 만들 수 있습니다.

```
if (outer condition) {
  if (nested condition) {
    Instruction to execute if both conditions are true
  }
}
```

중첩된 조건문을 구현할 때 외부 문이 먼저 평가됩니다.
외부 조건이 true이면 내부 중첩 문이 평가됩니다.

날씨에 따라 무엇을 입을지 결정하는 데 도움이 되는 프로그램을 만들어 봅시다.

```
int temp = 45;
boolean raining = true;

if (temp < 60) {
  System.out.println("Wear a jacket!");
  if (raining == true) {
    System.out.println("Bring your umbrella.");
  } else {
    System.out.println("Leave your umbrella home.");
  }
}
```

위의 코드 스니펫에서 컴파일러는 첫 번째 if-then 문의 조건인 temp < 60을 확인합니다.
temp의 값이 45이므로 이 조건은 참입니다. 따라서 우리 프로그램은 Wear a jacket!을 인쇄할 것입니다.

그런 다음 중첩된 if-then 문의 조건인 raining == true를 평가합니다.
이 조건도 참이므로 Bring your umbrella도 화면에 출력됩니다.

첫 번째 조건이 false이면 중첩된 조건이 평가되지 않습니다.

 */