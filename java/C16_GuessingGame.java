/*
1. GuessingGame.java 파일에서 우리는 두 개의 정수 미스터리1과 미스터리2를 정의했습니다.
강의의 나머지 부분에서 이러한 연산자에 대해 이야기할 것입니다.
System.out.println()을 사용하여 값 2를 보유하는 변수를 인쇄하십시오.

 */

public class C16_GuessingGame {
    public static void main(String[] args) {
        int mystery1 = 8 + 6;
        int mystery2 = 8 - 6;
        System.out.println(mystery2);
    }
}

/*

사용자의 은행 계좌를 나타내는 프로그램을 작성한다고 가정해 보겠습니다.
변수를 사용하여 잔액을 저장하는 방법을 알고 있습니다! 큰 십진수를 담을 수 있는 기본 유형인 double을 사용합니다.
하지만 어떻게 계좌에 입금하고 인출할 수 있을까요?

다행스럽게도 변수 값을 조작할 수 있는 능력이 있습니다. 변수 값을 변경하기 위해 식, 산술 연산자 등을 사용할 수 있습니다.

예를 들어 Java에는 숫자 값에 대한 계산을 수행하는 산술 연산이 내장되어 있습니다.

```
// declare initial balance
double balance = 20000.99;
// declare deposit amount
double depositAmount = 1000.00;
// store result of calculation in our original variable
balance = balance + depositAmount;
```

위 코드의 마지막 줄에서 balance + depositAmount 표현식을 사용하여 balance 변수의 새 값을 결정했습니다.
표현식이 실행될 때 단일 값을 생성합니다.

변수의 데이터 유형은 변수를 조작하는 데 사용할 수 있는 작업에서 큰 역할을 합니다.
데이터 유형은 일련의 값과 해당 값에 대한 작업 집합의 조합으로 생각할 수 있습니다.
예를 들어 double 데이터 유형은 4.8과 같은 값과 더하기(+)와 같은 연산으로 구성됩니다.
지금은 주로 숫자와 부울에 사용할 수 있는 일련의 작업에 중점을 둘 것입니다.

식의 데이터 유형은 결과 값에 따라 결정됩니다.
예를 들어 두 개의 int 값을 사용하는 표현식은 int 값으로 평가됩니다.
표현식에 double 값이 포함되어 있으면 결과 값도 double 유형이 됩니다.

이 단원 전체에서 다양한 데이터 유형의 변수를 조작하는 방법을 배웁니다.
 */
