/*
1. 레이블이 지정되지 않은 두 개의 앨범 A 레코드와 B 레코드를 발굴했습니다.
동일한 앨범인지 확인하려면 각 앨범의 노래 수와 전체 앨범 길이를 비교해야 합니다.
먼저 두 앨범의 노래 수가 같은지 여부를 저장하는 sameNumberOfSongs라는 변수를 만듭니다.

2. 이제 두 앨범 길이가 같지 않은지 여부를 확인한 결과를 저장하는 differentLength라는 변수를 만듭니다.
 */
public class C23_EqualNotEqual {
    public static void main(String[] args) {
        int songsA = 9;
        int songsB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;
        boolean sameNumberOfSongs = songsA == songsB;
        boolean differentLength = albumLengthA != albumLengthB;
    }
}

/*
23 Equals and Not Equals

그렇다면 급여를 제대로 받았는지 확인하기 위해 급여를 어떻게 확인할까요?
이를 위해 다른 관계 연산자를 사용할 수 있습니다. ==는 두 변수가 같은지 알려줍니다.

```
double paycheckAmount = 620;
double calculatedPaycheck = 15.50 * 40;

System.out.print(paycheckAmount == calculatedPaycheck);
// This will print true, since paycheckAmount equals calculatedPaycheck
```

동등성 검사는 하나가 아닌 두 개의 등호입니다. 하나의 등호 =는 변수에 값을 할당하는 방법입니다!
이들을 섞는 것은 쉬우므로 올바른 수의 등호에 대한 코드를 확인하십시오.

두 변수가 같지 않은지 확인하려면 !=를 사용할 수 있습니다.

```
double balance = 20000.0;
double amountToDeposit = 620;
double updatedBalance = balance + amountToDeposit;

boolean balanceHasChanged = balance != updatedBalance;
// balanceHasChanged holds true, since balance does not equal updatedBalance
```

 */
