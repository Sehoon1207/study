/*
1.
코드 편집기에는 주문 배송 준비 여부를 나타내는 isFilled 값이 있습니다.
다음과 같은 if-then-else 문을 작성합니다.
isFilled가 true이면 Shipping을 인쇄합니다.
isFilled가 거짓이면 Order not ready를 인쇄합니다.

 */
public class C47_Order {

    public static void main(String[] args) {

        boolean isFilled = false;

        // Write an if-then-else statement:
        if (isFilled == true) {
            System.out.println("Shipping");
        } else {
            System.out.println("ready");
        }

    }

}

/*
47 If-Then-Else If-Then-Else

우리는 한 코드 블록을 조건부로 실행하는 방법을 살펴보았습니다. 하지만 실행하고 싶은 코드 블록이 두 개라면 어떻게 될까요?
학생이 필수 전제 조건을 갖추고 있으면 선택한 과정에 등록하고 그렇지 않으면 대신 전제 조건 과정에 등록한다고 가정해 보겠습니다.
else 키워드를 사용하여 대체 조건 분기를 만듭니다.

```
if (hasPrerequisite) {

  // Enroll in course

} else {

  // Enroll in prerequisite

}
```
이 조건문은 정확히 하나의 코드 블록이 실행되도록 합니다.
조건 hasPrerequisite가 false이면 else 이후의 블록이 실행됩니다.

이제 조건문에 두 개의 별도 코드 블록이 있습니다.
조건이 true로 평가되면 첫 번째 블록이 실행되고 조건이 false로 평가되면 두 번째 블록이 실행됩니다.

이 코드는 if-then-else 문이라고도 합니다.

조건이 참이면 무언가를 하십시오.
그렇지 않으면 다른 일을 하십시오.

 */