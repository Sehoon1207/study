/*
1.
주문에 대한 배송비를 계산해야 합니다.
비용을 계산하는 데 사용하는 새로운 인스턴스 필드인 String shipping이 있습니다.
calculateShipping() 메서드 내에서 다른 값을 확인하려면 연결된 if-then-else를 사용하십시오.
배송 인스턴스 필드가 "Regular"인 경우 메서드는 0을 반환해야 합니다.
배송 인스턴스 필드가 "Express"인 경우 메서드는 1.75를 반환해야 합니다.
그렇지 않으면 메서드는 .50을 반환해야 합니다.

 */
public class C48_Order {
    boolean isFilled;
    double billAmount;
    String shipping;

    public C48_Order(boolean filled, double cost, String shippingMethod) {
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
        // declare conditional statement here
        if (shipping == "Express") {
            return 1.75;
        }else if (shipping == "Regular"){
            return 0;
        }else {
            return .50;
        }
    }

    public static void main(String[] args) {
        // do not alter the main method!
        C48_Order book = new C48_Order(true, 9.99, "Express");
        C48_Order chemistrySet = new C48_Order(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}

/*
48 If-Then-Else-If

우리가 배운 조건부 구조는 함께 연결되어 프로그램에서 요구하는 만큼의 조건을 확인할 수 있습니다.

우리 프로그램이 이제 학생에게 적합한 과정을 선택한다고 상상해보십시오.
올바른 과정 등록을 찾기 위해 제출 내용을 확인합니다.

이제 조건문에는 하향식으로 평가되는 여러 조건이 있습니다.

```
String course = "Theatre";

if (course.equals("Biology")) {

  // Enroll in Biology course

} else if (course.equals("Algebra")) {

  // Enroll in Algebra course

} else if (course.equals("Theatre")) {

  // Enroll in Theatre course

} else {

  System.out.println("Course not found!");

}
```

true로 평가되는 첫 번째 조건은 해당 코드 블록이 실행되도록 합니다.
다음은 순서를 보여주는 예입니다.

```
int testScore = 72;

if (testScore >= 90) {

  System.out.println("A");

} else if (testScore >= 80) {

  System.out.println("B");

} else if (testScore >= 70) {

  System.out.println("C");

} else if (testScore >= 60) {

  System.out.println("D");

} else {

  System.out.println("F");

}
// prints: C
```

이 연결된 조건문에는 true를 평가하는 두 가지 조건이 있습니다.
testScore >= 70이 testScore >= 60보다 먼저 나오므로 이전 코드 블록만 실행됩니다.

참고: 코드 블록 중 하나만 실행됩니다.

 */
