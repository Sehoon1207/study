
/*
1. 2016년 현재 Android는 모바일 운영 체제 시장의 81.7%를 차지하고 있습니다.
이 백분율을 double로 androidShare라는 변수를 만듭니다.

2. androidShare를 콘솔에 출력합니다.
 */

public class C09_MarketShare {
    public static void main(String[] args) {
        double androidShare = 81.7;
        System.out.println(androidShare);
    }
}

/*
09 doubles
정수는 모든 프로그램에 필요한 것을 달성하지 못합니다. 무언가의 가격을 저장하고 싶다면 어떻게 해야 할까요? 소수점이 필요합니다.
세계 인구를 저장하고 싶다면 어떻게 해야 할까요? 그 숫자는 int 유형이 담을 수 있는 것보다 클 것입니다.

이중 기본 데이터 유형이 도움이 될 수 있습니다. double은 매우 큰 숫자와 매우 작은 숫자뿐만 아니라 소수도 포함할 수 있습니다.
최대값은 1,797,693,134,862,315.7 E+308이며 약 17 뒤에 0이 307개 있습니다. 최소값은 4.9 E-324로 소수점 이하 324자리입니다!

double 유형의 변수를 선언하려면 선언에 double 키워드를 사용합니다.

```
// doubles can have decimal places:
double price = 8.99;
// doubles can have values bigger than what an int could hold:
double gdp = 12237700000;
```

 */
