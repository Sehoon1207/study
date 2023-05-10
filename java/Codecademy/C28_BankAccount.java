/*
1. 복습을 위해 강의 전반에 걸쳐 이야기한 은행 계좌 기능 중 일부를 구축해 보겠습니다.
먼저, updatedBalance라는 새로운 이중 변수를 만들고 amountToWithdraw를 뺀 잔액을 저장합니다.

2. 이제 잔액을 3가지 방법으로 균등하게 나누어 가장 친한 친구 3명에게 주기로 결정했습니다.
업데이트된 잔액을 3으로 나눈 값을 보유하는 amountForEachFriend라는 이중 변수를 만듭니다.

3. 당신의 친구들은 당신이 그들에게 준 돈으로 콘서트 티켓을 사고 싶어합니다. 티켓 비용은 250입니다!
canPurchaseTicket이라는 부울을 생성하고 amountForEachFriend가 적어도 콘서트 티켓을 구매하기에 충분한지 여부와 동일하게 설정합니다.
그런 다음 System.out.println()을 사용하여 canPurchaseTicket을 인쇄합니다.

4. 그나저나 친구들에게 얼마나 많은 돈을 주었습니까?
+ 및 System.out.println()을 사용하여 다음을 인쇄합니다.
```
I gave each friend <amountForEachFriend>...
```
<amountForEachFriend>가 있는 amountForEachFriend 값으로.
 */
public class C28_BankAccount {
    public static void main(String[] args){
        double balance = 1000.75;
        double amountToWithdraw = 250;
        double updatedBalance = balance - amountToWithdraw;
        double amountForEachFriend = updatedBalance/3;
        boolean canPurchaseTicket = amountForEachFriend >= 250;
        System.out.println(canPurchaseTicket);
        System.out.println("I gave each friend "+amountForEachFriend + "...");
    }
}

/*
검토
변수로 아무 것도 할 수 없다면 변수가 무슨 소용이 있겠습니까?
이제 변수에 대해 작업하고 비교할 수 있는 몇 가지 방법을 살펴보았습니다.
가능성은 무한합니다!

우리는 다음을 다루었습니다.

- +와 -를 이용한 더하기와 빼기
- * 및 /를 사용한 곱셈 및 나눗셈
- 나머지를 찾기 위한 모듈로 연산자, %
- 복합 대입 연산자 +=, -=, *=, /= 및 %=.
- 연산 순서: 괄호 -> 지수 -> 곱셈, 나눗셈, 모듈로 -> 더하기, 빼기
- 보다 큼, > 및 보다 작음, <
- 같음, == 및 같지 않음, !=
- 크거나 같음, >= 및 작거나 같음, <=
- 문자열과 다른 객체를 비교하기 위한 equals()
- +를 사용하여 문자열 연결
- 변수를 변경할 수 없게 만드는 최종 키워드

여기에서 이러한 개념 중 일부를 연습하여 보다 복잡하고 흥미로운 Java 개념을 배우기 위한 견고한 기초를 갖추도록 하십시오!

 */