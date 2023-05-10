/*
1. 하루에 충분한 물을 마시기 위한 30일 챌린지를 완료하려고 노력했습니다.
totalRecommendedAmount라는 이중 변수를 만들고 권장 수분 섭취량(recommendedWaterIntake)과
챌린지 일수(daysInChallenge)의 곱으로 설정합니다.

2. isChallengeComplete라는 부울 변수를 만들고 섭취량인 yourWaterIntake가
적어도 totalRecommendedAmount만큼인지 확인하는 결과로 설정합니다.
그런 다음 isChallengeComplete 변수를 인쇄합니다.
 */
public class C24_GreaterThanEqualTo {
    public static void main(String[] args){
        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;
        double totalRecommendedAmount =  recommendedWaterIntake * daysInChallenge;
        boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
        System.out.println(isChallengeComplete);
    }
}

/*
24 Greater/Less Than or Equal To

월급에서 예상했던 금액 이상을 받았는지 어떻게 확인할 수 있습니까?
크거나 같음, >= 또는 작거나 같음, <=!를 사용할 수 있습니다.

```
double paycheckAmount = 620;
double calculatedPaycheck = 15.50 * 40;
System.out.println(paycheckAmount >= calculatedPaycheck);
//this will print true, since paycheckAmount equals calculatedPaycheck
```

 */