/*
우리의 완전한 주문 프로그램은 텍스트 편집기에 있지만 main() 메서드는 비어 있습니다.
다른 Order 인스턴스를 생성하고 모든 다른 조건부 블록에서 코드를 실행할 수 있는지 확인하십시오!
 */

public class C51_Order {
    boolean isFilled;
    double billAmount;
    String shipping;

    public C51_Order(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        } else {
            System.out.println("Low value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
        } else {
            System.out.println("Order not ready");
        }

        double shippingCost = calculateShipping();

        System.out.println("Shipping cost: ");
        System.out.println(shippingCost);
    }

    public double calculateShipping() {
        double shippingCost;
        switch (shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }
        return shippingCost;
    }

    public static void main(String[] args) {
        // create instances and call methods here!
        C51_Order handy = new C51_Order(true,395,"Express");
        C51_Order pen = new C51_Order(true,3,"Regular");
        C51_Order jacket = new C51_Order(true,20,"Regular");

        handy.ship();
        pen.ship();
        jacket.ship();
    }
}

/*
Review

이 수업 전에 우리의 코드는 한 줄씩 위에서 아래로 실행되었습니다.

조건문은 프로그램에 분기 경로를 추가합니다.
다른 입력이 다른 결과를 생성하도록 프로그램에서 결정을 내리기 위해 조건을 사용합니다.

조건문의 일반적인 구조는 다음과 같습니다.

```
if (condition) {
    // consequent path
} else {
    // alternative path
}
```
특정 조건문의 동작은 다음과 같습니다.

if-then:
조건이 참이면 코드 블록 실행

if-then-else:
조건이 참이면 한 블록 실행
조건이 거짓이면 다른 블록 실행

if-then-else 연결:
if-then과 동일하지만 임의의 수의 조건

스위치:
조건 값이 case 값과 일치하면 switch 블록이 실행됩니다.

 */