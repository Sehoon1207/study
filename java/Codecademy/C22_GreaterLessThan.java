/*
1. 취득한 학점인 creditsEarned가 졸업에 필요한 학점인 creditsToGraduate보다 큰지 확인하는 표현식을 인쇄하십시오.

2. creditsOfSeminar 크레딧의 가치가 있는 세미나 수강 후 획득한 크레딧 금액을 보유하는 creditsAfterSeminar라는 변수를 생성합니다.
creditsAfterSeminar는 creditsEarned와 creditsOfSeminar의 합이어야 합니다.
creditsToGraduate가 creditsAfterSeminar보다 작은지 출력하십시오.
 */
public class C22_GreaterLessThan {
    public static void main(String[] args) {
        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;
        System.out.println(creditsEarned > creditsToGraduate);
        double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
        System.out.println(creditsAfterSeminar > creditsToGraduate);
    }
}

/*
22 Greater Than and Less Than

이제 우리는 은행 계좌 프로그램에서 돈을 인출하고 있으며 사용 가능한 금액보다 적은 돈을 인출하고 있는지 확인하려고 합니다.

Java에는 부울 비교를 수행하는 숫자 데이터 유형에 대한 관계 연산자가 있습니다.
여기에는 인출 문제를 해결하는 데 도움이 되는 미만(<) 및 초과(>)가 포함됩니다.

```
double balance = 20000.01;
double amountToWithdraw = 5000.01;
System.out.print(amountToWithdraw < balance);
//this will print true, since amountToWithdraw is less than balance
```

지난 수업에서 배웠던 비교 결과를 부울로 저장할 수 있습니다.

```
double myBalance = 200.05;
double costOfBuyingNewLaptop = 1000.05;
boolean canBuyLaptop = myBalance > costOfBuyingNewLaptop;
//canBuyLaptop is false, since 200.05 is not more than 1000.05
```


 */
