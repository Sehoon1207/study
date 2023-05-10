/*
1. main()에는 청구서에 지불할 금액의 소계를 나타내는 subtotal이라는 변수와 그 소계에 적용될 세율을 나타내는 tax라는 변수가 있습니다.
소계와 소계 및 세금의 곱을 포함하는 이중 변수 total을 생성합니다.
총 변수를 인쇄하십시오!

2. 이 식사를 함께 구입하고 비용을 나누기를 원하는 사람은 4명이었습니다.
합계를 4로 나눈 perPerson이라는 이중 변수를 만듭니다.
perPerson 변수를 인쇄하십시오!

 */

public class C18_MultAndDivide {
    public static void main(String[] args) {
        double subtotal = 30;
        double tax = 0.0875;
        double total = subtotal * (1+tax);
        System.out.println(total);
        double perPerson = total/4;
        System.out.println(perPerson);
    }
}


/*
Multiplication and Division

고용주가 급여를 계산하여 은행 계좌에 입금한다고 가정해 보겠습니다.
우리는 지난주에 시간당 $15.50로 40시간을 일했습니다.
Java는 곱셈 연산자 *를 사용하여 이를 계산할 수 있습니다.

```
double paycheckAmount = 40 * 15.50;
//paycheckAmount now holds 620.0
```

총 잔고가 몇 시간인지 확인하려면 나눗셈 연산자 /를 사용합니다.

```
double balance = 20010.5;
double hourlyRate = 15.5;
double hoursWorked = balance / hourlyRate;
//hoursWorked now holds 1291.0
```

나눗셈은 정수와 다른 결과를 가집니다. / 연산자는 정수 나누기를 수행하므로 나머지는 손실됩니다.

```
int evenlyDivided = 10 / 5;
//evenlyDivided holds 2, because 10 divided by 5 is 2
int unevenlyDivided = 10 / 4;
//unevenlyDivided holds 2, because 10 divided by 4 is 2.5
```

evenlydivided는 당신이 기대하는 것을 저장하지만, int는 십진수를 저장할 수 없기 때문에 불균등 분할은 2를 보유합니다!
int는 소수점을 반올림하지 않고 바닥을 칩니다. Java는 결과를 int 유형에 맞추기 위해 0.5를 제거합니다!

숫자를 0으로 나누려고 하면 결과적으로 ArithmeticException 오류가 발생한다는 점에 유의해야 합니다.

 */